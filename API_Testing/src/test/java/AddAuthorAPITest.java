import RequestModel.AddBookRequest;
import ResponceModel.AddBookRespose;
import ResponceModel.DeleteBookResponse;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.*;
import static io.restassured.RestAssured.given;

public class AddAuthorAPITest {

    AddBookRequest[] noOfBookRequest = new AddBookRequest[]
            {new AddBookRequest("History", "004", "JKL", "Rohini"),
             new AddBookRequest("Geography", "005", "MNO", "Rohini"),
             new AddBookRequest("Science", "006", "STU", "Rohini")
            };

    @BeforeMethod
    public void getURI() {
        RestAssured.baseURI = "http://216.10.245.166";
    }

    // scenario 4 add three books
    @Test(priority = 1)
    public void setAddBook()
    {

        for(int i=0; i<3;i++) {
            Response addBook = given().log().all().header("Content-Type", "application/json")
                    .body(noOfBookRequest[i])
                    .when().post("/Library/Addbook.php")
                    .then().log().all().assertThat().statusCode(200).extract().response();

                AddBookRespose addBookResponse = addBook.body().as(AddBookRespose.class);
                Assert.assertEquals(addBookResponse.getMsg(),"successfully added");
        }

    }

    // scenario 4 Get Book by author name
    @Test
    public void getBookByAuthor(){

        Response AuthorResponse = given().log().all().queryParam("AuthorName","Rohini")
                .when()
                .get("/Library/GetBook.php")
                .then().log()
                .all()
                .statusCode(200)
                .extract().response();

        //JSON Parser
        RestAssured.defaultParser = Parser.JSON;

        // scenario 5: Validate no. of Books returned
        List<Object> jsonResponse = AuthorResponse.jsonPath().getList("$");
        System.out.println("Total Number of Records :"+jsonResponse.size());

        //scenario 6: Print Book name of all the 3 books added
        String bookName = AuthorResponse.jsonPath().getString("book_name");
        System.out.println("Book Names are : "+bookName);

        String dummyIsbn = AuthorResponse.jsonPath().getString("isbn[0]");
        String dummyAisle = AuthorResponse.jsonPath().getString("aisle[0]");
        String bookToBeDeleted = dummyIsbn.concat(dummyAisle);
        System.out.println(" ISBN "+ dummyIsbn + " Aisle "+ dummyAisle);
        System.out.println(" Id of book deleted is :"+ bookToBeDeleted);

       // deleteBookByAuthor(bookToBeDeleted);
    }

    @Test
    public void deleteBookByAuthor(){

        Response AuthorResponse = given().log().all().queryParam("AuthorName","Rohini")
                .when()
                .get("/Library/GetBook.php")
                .then().log()
                .all()
                .statusCode(200)
                .extract().response();

        //JSON Parser
        RestAssured.defaultParser = Parser.JSON;

        //Print Book name of all the 3 books added
        String bookName = AuthorResponse.jsonPath().getString("book_name");
        System.out.println("Book Names are : "+bookName);

        String dummyIsbn = AuthorResponse.jsonPath().getString("isbn[0]");
        String dummyAisle = AuthorResponse.jsonPath().getString("aisle[0]");
        String bookToBeDeleted = dummyIsbn.concat(dummyAisle);
        System.out.println(" ISBN "+ dummyIsbn + " Aisle "+ dummyAisle);
        System.out.println(" Id of book deleted is :"+ bookToBeDeleted);

        Response deleteResponse = given().log().all().queryParam("ID",bookToBeDeleted)
                .when()
                .post("/Library/DeleteBook.php")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();

        System.out.println("Deleted Response:"+ deleteResponse.toString());

        DeleteBookResponse deleteBookResponse = deleteResponse.body().as(DeleteBookResponse.class);

        Assert.assertEquals(deleteBookResponse.getMsg(),"book is successfully deleted");

        Response AuthorResponse1 = given().log().all().queryParam("AuthorName","Rohini")
                .when()
                .get("/Library/GetBook.php")
                .then().log()
                .all()
                .statusCode(200)
                .extract().response();

        //Validate no. of Books returned
        List<Object> jsonResponse1 = AuthorResponse1.jsonPath().getList("$");
        System.out.println("Total Number of Records :"+jsonResponse1.size());

    }
}
