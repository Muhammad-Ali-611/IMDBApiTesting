package employeeinfo;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class AllEmployeeResourcesAPI {

    String baseUrl = "https://imdb-api.com/en/API/Title/k_89oskd64/tt1375666";
//    https://imdb-api.com/en/API/Title/k_89oskd64/tt1375666/FullActor,Posters
    public void getAllEmployeeResources(){
       Response response =  RestAssured.given().when().get(baseUrl+"/FullActor.Posters").then().statusCode(200).extract().response();
        String statusCode = String.valueOf(response.getStatusCode());
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusLine,statusCode);
        Assert.assertEquals(statusCode,200);

   }
}
