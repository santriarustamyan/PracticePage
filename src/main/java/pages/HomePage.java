package pages;

import org.openqa.selenium.*;

public class HomePage {
    private WebDriver driver;

    private final By radioButtonExample = By.xpath("//input[@value='radio2']");
    private final By dropDownExample = By.id("dropdown-class-example");
    private final By chooseDropdown = By.xpath("//option[@value = 'option3']");
    private final By checkboxExample = By.xpath("//input[@value = 'option2']");
    private final By table = By.cssSelector("fieldset .tableFixHead");
    private final By mouseHover = By.cssSelector("button#mousehover");
    private final By mouseHoverReload = By.cssSelector(".mouse-hover-content a[href='']");
    private final By registerButton = By.cssSelector("div .login-btn a ");
    private final By iFrame = By.cssSelector("fieldset #courses-iframe");
    private final By alertInput = By.cssSelector("fieldset #name");
    private final By alertButton = By.cssSelector("fieldset #alertbtn");
    private final By openWindow =By.id("openwindow");
    private final By openTab =  By.id("opentab");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectRadioButtonExample() {
        driver.findElement(radioButtonExample).click();
    }

    public void selectDropDownExample(){
        driver.findElement(dropDownExample).click();
        driver.findElement(chooseDropdown).click();
    }

    public void selectCheckboxExample(){
        driver.findElement(checkboxExample).click();
    }

    public void switchWindowExample(){
        driver.findElement(openWindow).click();

        driver.switchTo().window(driver.getWindowHandle());
    }

    public void switchTabExample(){
        driver.findElement(openTab).click();
        driver.switchTo().window(driver.getWindowHandle());
    }

    public void switchToAlertExample(){
        driver.findElement(alertInput).sendKeys("Santri");
        driver.findElement(alertButton).click();
        driver.switchTo().alert().accept();
    }

     public void scrollTable() {
        WebElement tableElm = driver.findElement(table);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tableElm);
        }

    public void iFrameScroll() {
            ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
            WebElement iFrames = driver.findElement(iFrame);
            driver.switchTo().frame(iFrames);
            driver.findElement(registerButton).click();
        }

    public void mouseHoverReload() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        driver.findElement(mouseHover).click();
        driver.findElement(mouseHoverReload).click();
    }

}


