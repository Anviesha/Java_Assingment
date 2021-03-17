package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Test extends Base_Test {

    @Test
    public void verifyLogin()
    {
        loginPage.login_Spree("vapasi@gmail.com", "Movies@25");
        //Assert.assertEquals();
    }
}