package bankguru.user;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class user_01_new_customer {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver.get("https://google.com.vn");

    }

    @Test
    public void New_Customer_01_validate_name(){

    }

    @Test
    public void New_Customer_02_validate_phone(){

    }

    @Test
    public void New_Customer_03_validate_city(){

    }

    @Test
    public void New_Customer_04_validate_state(){

    }
    @AfterClass
    public void afterClass() {

    }
}
