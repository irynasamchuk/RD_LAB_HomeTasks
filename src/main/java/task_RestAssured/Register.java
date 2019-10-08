package task_RestAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class Register {
    RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri("https://reqres.in/")
            .setContentType(ContentType.JSON)
            .setBasePath("api/register")
            .build();

    @Test(description = "This test is for 'REGISTER - SUCCESSFUL' endpoint")
    public void checkRegisterSuccessfull() {
        String newUser = "{\"email\" : \"eve.holt@reqres.in\", \"password\": \"pistol\"}";
        given()
                .spec(requestSpec)
                .body(newUser)
                .when()
                .post()
                .then()
                .statusCode(200)
                .and()
                .body("id", equalTo(4))
                .log()
                .all();
    }

    @Test(description = "This test is for 'REGISTER - UNSUCCESSFUL' endpoint")
    public void checkLoginUnsuccessfull() {
        String newUser = "{\"email\" : \"eve.holt@reqres.in\"}";
        given()
                .spec(requestSpec)
                .body(newUser)
                .when()
                .post()
                .then()
                .statusCode(400)
                .and()
                .body("error", equalTo("Missing password"))
                .log()
                .all();
    }
}
