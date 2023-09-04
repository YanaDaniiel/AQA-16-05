package com.rest;

import com.rest.dto.User;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.assertj.core.api.Assertions.assertThat;

public class RestTest {
    private static RequestSpecification requestSpecification;

    @BeforeClass
    public static void init() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType(ContentType.JSON)
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    @Test
    public void registerSuccessful() {
        User expected = new User();
        expected.setEmail("eve.holt@reqres.in");
        expected.setPassword("pistol");
        expected.setId("4");
        expected.setToken("QpwL5tke4Pnpja7X4");
        User user = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .body(expected)
                .post("/api/register")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .as(User.class);

        assertThat(user).isEqualToIgnoringGivenFields(expected, "email", "password", "error");
        assertThat(user).hasFieldOrPropertyWithValue("email", null);
        assertThat(user).hasFieldOrPropertyWithValue("password", null);
        assertThat(user).hasNoNullFieldsOrPropertiesExcept("email", "password", "error");
        assertThat(user).hasFieldOrProperty("id");
        assertThat(user).hasFieldOrProperty("token");

        Assert.assertEquals(user.getId(), expected.getId());
        Assert.assertEquals(user.getToken(), expected.getToken());
    }

    @Test
    public void registerUnsuccessful() {

        User expected = new User();
        expected.setEmail("sydney@fife");
        expected.setError("Missing password");

        User user1 = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .body(expected)
                .post("/api/register")
                .then()
                .assertThat()
                .statusCode(400)
                .contentType(ContentType.JSON)
                .extract()
                .as(User.class);

        assertThat(user1).isEqualToIgnoringGivenFields(expected, "email", "error");
        assertThat(user1).hasNoNullFieldsOrPropertiesExcept("email", "password", "id", "token");

        Assert.assertEquals(user1.getError(), expected.getError());
    }

    @Test
    public void getDelayedResponse() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .param("delay", 3)
                .get("api/users")
                .thenReturn();
        response.then().statusCode(200);
        assertThat(response).hasNoNullFieldsOrProperties();
    }

    @Test
    public void getDelayedResponseData() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .param("delay", 3)
                .get("api/users")
                .thenReturn();
        response.then().statusCode(200);
        String data = response.then()
                .extract()
                .body()
                .jsonPath()
                .getString("data");
        String id = response.then()
                .extract()
                .body()
                .jsonPath()
                .getString("data[5].id");
        assertThat(response).hasNoNullFieldsOrProperties();
        System.out.println(data);
        System.out.println(id);
        Assert.assertEquals(id, "6");
    }
}
