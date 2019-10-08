package task_RestAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasKey;

public class Unknown {
    RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri("https://reqres.in/")
            .setContentType(ContentType.JSON)
            .setBasePath("api/unknown")
            .build();

    RequestSpecification requestSpecWithId = new RequestSpecBuilder()
            .setBaseUri("https://reqres.in/")
            .setContentType(ContentType.JSON)
            .setBasePath("api/unknown/{id}")
            .build();

    ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectBody("$", hasKey("data"))
            .build();

    @Test(description = "This test is for 'LIST <RESOURCE>' endpoint")
    public void getListResource() {
        given()
                .spec(requestSpec)
                .when()
                .get()
                .then()
                .body("total", equalTo(12))
                .and()
                .body("total_pages", equalTo(2))
                .statusCode(200);
    }

    @Test(description = "This test is for SINGLE <RESOURCE> endpoint")
    public void getSingleResourse() {
        given()
                .spec(requestSpecWithId)
                .pathParam("id", 5)
                .when()
                .get()
                .then()
                .spec(responseSpecification)
                .body("data.name", equalTo("tigerlily"))
                .and()
                .statusCode(200)
                .log()
                .all();
    }
}

