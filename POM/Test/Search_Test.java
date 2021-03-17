package Test;

import Pages.Search_Page;
import org.testng.annotations.Test;

public class Search_Test extends Base_Test{

    @Test
    public void search()
    {
        searchPage.searchAllElements("Ruby");
        searchPage.searchAllElements("Apache");
    }
}