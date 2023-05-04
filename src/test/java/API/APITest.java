package API;

import APIProducts.Product;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class APITest {

    @Test
    public void getProduct(){
        String endpoint = "http://localhost:8888/api_testing/product/read_one.php";
        given().queryParam("id",2).
                when().
                get(endpoint).
                then().assertThat().statusCode(200).
                body("id",equalTo("2")).
                body("name",equalTo("Cross-Back Training Tank")).
                body("description", equalTo("The most awesome phone of 2013")).
                body("category_id",equalTo("2")).
                body("category_name", equalTo("Active Wear - Women"));
    }
    @Test
    public void createSerializedProduct(){
        String endpoint = "http://localhost:8888/api_testing/product/create.php";
        Product product = new Product(
                "Water Bottle",
                "Blue Wate Bottle,",
                12,
                3

        );
        var response = given().body(product).when().then();
        response.log().body();
    }
    @Test
    public void createSweatBand(){
        String endpoint = "htt[://localhost:8888/api_testing/product/create.php";
        String body = """
    {
    "name" : "Sweatband",
    "description" : "White sweatband. One size fits all.",
    "price" : 5,
    "category_id" : 3

    }
    """;

    }
    @Test
    public void updateSweatBand(){
        String endpoint = "htt[://localhost:8888/api_testing/product/update.php";
        String body = """
               {
               "id" : 26,
               "price" : 6
               }
               """;
        var response = given().body(body).when().post(endpoint).then();
        response.log().body();
    }

    @Test
    public void getSweatBand(){
        String endpoint = "htt[://localhost:8888/api_testing/product/read_one.php";
        var response =
                given().
                        queryParam("id",26).
                        when().
                        get(endpoint).
                        then();
        response.log().body();
    }
    @Test
    public void deleteSweatband(){
        String endpoint = "htt[://localhost:8888/api_testing/product/delete.php";
        String body = """
                {
                "id" : 26
                }
                """;
        var response = given().body(body).when().delete(endpoint).then();
        response.log().body();
    }
    @Test
    public void getMultiVitamins(){
        String endpoint = "http://localhost:8888/api_testing/product/read_one.php";
        given().
                queryParam("id",18).
                when().
                get(endpoint).
                then().
                assertThat().
                statusCode(200).
                header("Content-Type", equalTo("application/json")).
                body("id",equalTo("18")).
                body("name",equalTo("Multi-Vitamin(90 capsules)")).
                body("description", equalTo(" A daily dose of our Multi-Vitamin")).
                body("price",equalTo("10.00"));

    }
}

