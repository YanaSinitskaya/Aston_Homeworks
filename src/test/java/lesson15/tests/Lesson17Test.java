package lesson15.tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Lesson17Test {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    public void postmanEchoGet() {
        baseURI = "https://postman-echo.com";
        given().log().all()
        .when().get("/get?foo1=bar1&foo2=bar2")
        .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void postmanEchoPost() {
        given().log().all()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
        .when().post("/post")
        .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }

    @Test
    public void postmanEchoPut() {
        String response = "This is expected to be sent back as part of response body.";
        given().log().all()
                .contentType("text/plain; charset=utf-8")
                .body(response)
                .when().put("/put")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo(response));
    }

    @Test
    public void postmanEchoPatch() {
        String response = "This is expected to be sent back";
        given().log().all()
                .contentType("text/plain; charset=utf-8")
               .body(response)
        .when().patch("/patch")
        .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo(response));
    }

    @Test
    public void postmanEchoDelete() {
        String response = "";
        given().log().all()
                .contentType("text/plain; charset=utf-8")
                .body(response)
        .when().delete("/delete")
        .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo(response));
    }
}