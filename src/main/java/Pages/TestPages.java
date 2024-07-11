package Pages;

// Import necessary classes from Selenium and TestNG
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    // Method to open GitHub homepage
    public void OpenUrl (){
        driver.get("https://tuwaiq.edu.sa/"); // Navigate to GitHub URL
    }

    public void CheckEnglishButtonMethod() {
        WebElement english = driver.findElement(checkEnglishButton); // Find login button element
        english.click(); // Click on the login button

    }

    public void clickOnBootCampButtonMethod() {
        WebElement bootcamp = driver.findElement(clickOnBootCampButton); // Find login button element
        bootcamp.click(); // Click on the login button

    }

    public void clickOnfilterButtonMethod() {
        WebElement filter = driver.findElement(clickOnfilterButton); // Find login button element
        filter.click(); // Click on the login button

    }
    public void clickOnSearchFaildMethod() {
        WebElement search = driver.findElement(clickOnSearchFaild); // Find login button element
        search.click(); // Click on the login button
        driver.findElement(clickOnSearchFaild).sendKeys("data");
    }

    public void clickOnRaginDropDownMethod() {
        WebElement DropDown = driver.findElement(clickOnRaginDropDown); // Find login button element
        DropDown.click(); // Click on the login button
    }

    public void selectFromRaginDropDownMethod() {
        WebElement selectDropDown = driver.findElement(selectFromRaginDropDown); // Find login button element
        selectDropDown.click(); // Click on the login button
    }

    public void SelectProgramMethod() {
        WebElement select = driver.findElement(selectProgram); // Find login button element
        select.click(); // Click on the login button
    }

    public void GoToElementMethod(int x,int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0],arguments[1]);",x,y);
    }








    // Method to click on the login button on the home page
 /*   public void SearchBarMethod() {
        WebElement searchItem = driver.findElement(searchBarElement); // Find login button element
        searchItem.click(); // Click on the login button
    }
    public void TestTabBarMethod() {
        WebElement searchItem = driver.findElement(clickOnTab); // Find login button element
        searchItem.click(); // Click on the login button
    }
    // Method to enter login credentials and verify login
    public void SearchData () throws InterruptedException {
        driver.findElement(searchInputBar).sendKeys("data"); // Find email address field and enter email
        Thread.sleep(3000); // Pause execution for 3000 milliseconds (not recommended; use explicit waits instead)
        driver.findElement(searchInputBar).sendKeys(Keys.ENTER);
//        driver.findElement(passwordLogin).sendKeys(""); // Find password field and enter password
//        driver.findElement(signInBtn).click(); // Click on sign-in button

       boolean passwordLogin = driver.findElement(assertionUponLogin).isDisplayed(); // Check if assertion element is displayed
       Assert.assertTrue(passwordLogin, "home page is not displayed!"); // Assert that homepageview is true
    }*/
}
