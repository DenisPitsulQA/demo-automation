package com.demo.api;

import com.codeborne.selenide.Selenide;
import com.demo.actions.Actions;
import com.demo.api.clients.CurrencyClient;
import com.demo.api.models.CurrencyConvertResponse;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CurrencyApiTest {

    private static final String BASE_URL = "https://api.fastforex.io";
    private static final String CURRENCY_FROM = "USD";
    private static final String CURRENCY_TO = "CNY";
    private static final String API_KEY = "55ef3e6460-b3dd54add5-rwphq7";

    private CurrencyClient client;

    //https://api.fastforex.io/convert?from=USD&to=CNY&amount=1.00&api_key=55ef3e6460-b3dd54add5-rwphq7


    @BeforeClass
    private void initClient() {
        client = new CurrencyClient(BASE_URL, ContentType.JSON);
    }


    @Test
    public void currencyApiTest() {
        CurrencyConvertResponse currencyConvertResponse1 = client.convertCurrency(CURRENCY_FROM, CURRENCY_TO, "1", API_KEY);
        int firstNumber = (int) currencyConvertResponse1.getResult().getCNY();

        CurrencyConvertResponse currencyConvertResponse2 = client.convertCurrency(CURRENCY_FROM, CURRENCY_TO, "10", API_KEY);
        int secondNumber = (int) currencyConvertResponse2.getResult().getCNY();

        Selenide.open("https://www.random.org/");
        String generatedNumber = Actions.randomNumberServiceActions().generateRandomNumber(firstNumber, secondNumber);

        CurrencyConvertResponse currencyConvertResponse3 = client.convertCurrency(CURRENCY_FROM, CURRENCY_TO, generatedNumber, API_KEY);

        System.out.println("Final currency convert response: " + currencyConvertResponse3);
    }
}
