package task_RestAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Login {
    RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri("https://reqres.in/")
            .setContentType(ContentType.JSON)
            .setBasePath("api/login")
            .build();

    @Test
            //(description = "This test is for 'LOGIN - SUCCESSFUL' endpoint")
    public void loginSuccessfull() {
        String user = "{\"email\" : \"eve.holt@reqres.in\", \"password\": \"cityslicka\"}";
        given()
                .spec(requestSpec)
                .body(user)
                .when()
                .post()
                .then()
                .body("token", equalTo("QpwL5tke4Pnpja7X4"))
                .log()
                .ifStatusCodeIsEqualTo(200);
    }

    @Test(description = "This test is for 'LOGIN - UNSUCCESSFUL' endpoint")
    public void loginUnsuccessfull() {
        String user = "{\"email\": \"peter@klaven\"}";
        given()
                .spec(requestSpec)
                .body(user)
                .when()
                .post()
                .then()
                .body("error", equalTo("Missing password"))
                .and()
                .statusCode(400);
    }
}
