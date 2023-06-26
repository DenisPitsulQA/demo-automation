package com.demo.api.clients;

import com.demo.api.models.CurrencyConvertResponse;
import io.restassured.http.ContentType;

public class CurrencyClient extends BaseClient {

    private final String path = "/convert";

    public CurrencyClient(String url, ContentType contentType) {
        super(url, contentType);
    }

    public CurrencyConvertResponse convertCurrency(String from, String to, String amount, String apiKey) {
        return prepareRequest()
                .when()
                .get(path + "?from=" + from + "&to=" + to + "&amount=" + amount + "&api_key=" + apiKey)
                .then()
                .extract()
                .as(CurrencyConvertResponse.class);
    }

}
