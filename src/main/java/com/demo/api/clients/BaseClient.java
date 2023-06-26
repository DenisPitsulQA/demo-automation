package com.demo.api.clients;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseClient {
    protected final String baseUrl;
    protected final ContentType contentType;
    protected String accessToken;

    public BaseClient(String url, ContentType contentType) {
        this.baseUrl = url;
        this.contentType = contentType;
    }

    public RequestSpecification prepareRequest() {
        return given()
                .relaxedHTTPSValidation()
                .baseUri(baseUrl)
                .contentType(contentType)
                .accept(contentType);
    }
}
