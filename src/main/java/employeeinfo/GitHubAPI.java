package employeeinfo;


import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class GitHubAPI {
    String baseUrl = "https://api.github.com/users/MuhammadAli611 ";
     public void getfirstUser(){
      Response response =   given().when().get(baseUrl).then().statusCode(200).extract().response();
        response.then().
                body("id", equalTo(44851048)).
                body("login",equalTo("MuhammadAli611")).
                body("url" , equalTo("https://api.github.com/users/MuhammadAli611")).
                body("html_url" , equalTo("https://github.com/MuhammadAli611")).
                body("received_events_url" , equalTo("https://api.github.com/users/MuhammadAli611/received_events"));
         response.getBody().prettyPrint();
    }
    String getBaseUrl1 = "https://api.github.com/users/haseebuchiha";
     public void getSeconduser(){
        Response response1 =   given().when().get(getBaseUrl1).then().statusCode(200).extract().response();
        response1.then().
                body("id", equalTo(19784907)).
                body("login",equalTo("haseebuchiha")).
                body("url" , equalTo("https://api.github.com/users/haseebuchiha")).
                body("html_url" , equalTo("https://github.com/haseebuchiha")).
                body("received_events_url" , equalTo("https://api.github.com/users/haseebuchiha/received_events"));
        response1.getBody().prettyPrint();
    }


    String ApiUser = "https://api.github.com/users/shahid";
     public void GetThirdUser(){
         Response response = given().when().get(ApiUser).then().extract().response();
         response.then().
                 body("id", equalTo(71684) ).
                 body("avatar_url", equalTo("https://avatars.githubusercontent.com/u/71684?v=4")).
                 body("name", equalTo("Shahid PA"));
         response.getBody().prettyPrint();
      }
}
