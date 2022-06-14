package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;

public class PracticePageTests {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeSuite
    public void  setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeClass
    public void navigateHomePage(){
// 1. Navigate to the page: https://www.rahulshettyacademy.com/AutomationPractice/
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void practicePageTest(){

       // Select the radio button
       homePage.selectRadioButtonExample();

        // Select an item from the static dropdown
        homePage.selectDropDownExample();

        // Select an item from the dynamic dropdown



        // Select checkbox
        homePage.selectCheckboxExample();

        // Work with multiple windows and tabs
        homePage.switchWindowExample();
        homePage.switchTabExample();

        // Handle alerts
        homePage.switchToAlertExample();

        // Work with the hide and show elements section and use assertions



        // Scroll the table
        homePage.scrollTable();

        // Mouse hover on the element
        homePage.mouseHoverReload();

        // Work with iframes
        homePage.iFrameScroll();


    }

}





