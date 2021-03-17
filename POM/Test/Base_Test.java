package Test;

import Resource.Driver_Resource;

import Pages.Login_Page;
import Pages.Search_Page;

public class Base_Test extends Driver_Resource {
    Login_Page loginPage = new Login_Page(driver);
    Search_Page searchPage = new Search_Page(driver);
}
