package ObjectsPath;

// Import necessary classes from Selenium
import org.openqa.selenium.By;


// Define the TestHome class
public class TestHome {

    // Locator for the login button in the home page
    public static final By checkEnglishButton = By.xpath("/html/body/main/div/nav[2]/div[2]/button[1]");
    public static final By clickOnBootCampButton = By.xpath("/html/body/main/div/nav[2]/div[1]/div/div/ul/li[2]/a");
    public static final By clickOnfilterButton = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[1]/button");
    public static final By clickOnSearchFaild = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");
    public static final By clickOnRaginDropDown = By.xpath("//*[@id='regionSelect']");
    public static final By selectFromRaginDropDown = By.xpath("//*[@id='regionSelect']/option[2]");
    public static final By selectProgram = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[2]/button[2]");
    // Locator for the email address input field in the login form
  /*  public static final By searchInputBar = By.xpath("//*[@id='app-header']/div[1]/div[2]/div[2]/div/button");

    // Locator for the password input field in the login form
    public static final By clickOnTab = By.xpath("//*[@id='popover-trigger-:R1l669l5t6H1:']");

    // Locator for the sign in button in the login form
    public static final By signInBtn = By.xpath("//*[@id='login']/div[4]/form/div/input[13]");

    // Locator for an element to assert upon successful login
    public static final By assertionUponLogin = By.xpath("//*[@id='dashboard']/div/feed-container/div[1]/div/a");
*/
}
