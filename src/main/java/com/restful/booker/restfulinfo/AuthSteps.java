package com.restful.booker.restfulinfo;

import com.restful.booker.constants.Endpoints;
import com.restful.booker.model.AuthPojo;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class AuthSteps {

    @Step
    public ValidatableResponse createToken(String userName, String password) {
        AuthPojo authPojo = new AuthPojo();
        authPojo.setUsername(userName);
        authPojo.setPassword(password);

        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .body(authPojo)
                .when()
                .post(Endpoints.GET_TOKEN)
                .then().log().all();


    }


}
