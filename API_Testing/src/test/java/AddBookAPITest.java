import RequestModel.AddBookRequest;
import ResponceModel.AddBookRespose;
import ResponceModel.DeleteBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class AddBookAPITest {

    AddBookRequest addBook = new AddBookRequest("1984","QW23","324","Boxom");

    @BeforeMethod
    public void getURI() {
        RestAssured.baseURI = "http://216.10.245.166";
    }

    // positive - adding a new book
    @Test(priority=1)
    // @Parameter("addBook")
    public void addBookRequest() {

        Response addBookResponse = given().log().all().header("Content-Type", "application/json")
                .body(addBook)
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();

        AddBookRespose abookResponse = addBookResponse.body().as(AddBookRespose.class);

        // Test case assertion
        Assert.assertEquals(abookResponse.getMsg(),"successfully added");

    }

    // Negative scenario - Get 404 error
    @Test
    //(priority = 2)
    public void DuplicateBook()
    {

        Response duplicateBookResponse = given().log().all().header("Content-Type", "application/json")
                .body(addBook)
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(404).extract().response();

        AddBookRespose duBookResponse = duplicateBookResponse.body().as(AddBookRespose.class);

        //Assertion of test case
        Assert.assertEquals(duBookResponse.getMsg(),"Add Book operation failed, looks like the book already exists");

        //Get the book by id
        Response AuthorResponse = given().log().all().queryParam("ID","324QW23")
                .when()
                .get("/Library/GetBook.php")
                .then().log()
                .all()
                .statusCode(200)
                .extract().response();

        String bookToBeDeleted = AuthorResponse.jsonPath().getString("ID[0]");
        System.out.println("Book Id is: " +bookToBeDeleted);

        deleteBook(bookToBeDeleted);
    }

    public static void deleteBook(String bookToBeDeleted){

        Response deleteResponse = given().log().all().queryParam("ID",bookToBeDeleted)
                                    .header("Content-Type", "application/json")
                                    .when()
                                    .delete("/Library/DeleteBook.php")
                                    .then()
                                    .extract().response();

        System.out.println("Deleted Response:"+ deleteResponse.asString());

        DeleteBookResponse deleteBookResponse = deleteResponse.body().as(DeleteBookResponse.class);

        Assert.assertEquals(deleteBookResponse.getMsg(),"book is successfully deleted");
    }
}