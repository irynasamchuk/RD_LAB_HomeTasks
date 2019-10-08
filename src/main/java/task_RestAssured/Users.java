package task_RestAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class Users {
    RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri("https://reqres.in/")
            .setContentType(ContentType.JSON)
            .setBasePath("/api/users")
            .addFilter(new RequestLoggingFilter())
            .build();

    RequestSpecification requestSpecId = new RequestSpecBuilder()
            .setBaseUri("https://reqres.in/")
            .setContentType(ContentType.JSON)
            .setBasePath("/api/users/{id}")
            .build();

    ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectResponseTime(lessThan(5000L))
            .expectBody("$", hasKey("data"))
            .build();


    @Test(description = "This test is for 'LIST USERS' endpoint")
    public void restGetUsersList() {
        given()
                .spec(requestSpec)
                .param("page", 1)
                .when()
                .get()
                .then()
                .statusCode(200)
                .and()
                .body("total", equalTo(12))
                .and()
                .body("data.first_name", hasItem("George"));
    }

    @Test(description = "This test is for 'SINGLE USER' endpoint")
    public void restGetSingleUser() {
        given()
                .spec(requestSpecId)
                .pathParam("id", "2")
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .and()
                .body("data.first_name", equalTo("Janet"))
                .log()
                .all();
    }

    @Test(description = "This test is for 'SINGLE USER NOT FOUND' endpoint")
    public void restGetSingleNotFound() {
        given()
                .spec(requestSpecId)
                .pathParam("id", 45)
                .when()
                .get()
                .then()
                .statusCode(404);
    }

    @Test(description = "This test is for 'CREATE' endpoint")
    public void createSingleUser() {
        String newUser = "{\"name\" : \"Ira\", \"job\": \"QA\"}";
        given()
                .spec(requestSpec)
                .body(newUser)
                .when()
                .post()
                .then()
                .statusCode(201)
                .log()
                .all();
    }

    @Test(description = "This test is for 'UPDATE' endpoint")
    public void updateSingleUser() {
        String user = "{\"name\" : \"morpheus\", \"job\": \"resident QA\"}";
        given()
                .spec(requestSpecId)
                .body(user)
                .when()
                .put("id", 2)
                .then()
                .statusCode(200)
                .log()
                .all();
    }

    @Test(description = "This test is for 'UPDATE' with path endpoint")
    public void updateSingleUserWithPatch() {
        String user = "{\"name\" : \"Charles\", \"job\": \"resident QA\"}";
        given()
                .spec(requestSpecId)
                .body(user)
                .when()
                .patch("id", 5)
                .then()
                .statusCode(200)
                .log()
                .all();
    }

    @Test(description = "This test is for 'DELETE' with path endpoint")
    public void deleteSingleUsers() {
        given()
                .spec(requestSpecId)
                .when()
                .delete("userID", 2)
                .then()
                .statusCode(204)
                .log()
                .ifValidationFails();
    }

    @Test(description = "This test is for 'DELAYED RESPONSE' with path endpoint")
    public void delayResponse() {
        given()
                .spec(requestSpec)
                .when()
                .get("?delay=3")
                .then()
                .time(lessThan(6000L))
                .and()
                .statusCode(200);
    }
}
