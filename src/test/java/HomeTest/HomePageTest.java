package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTest extends BaseClass {


    @Test
    public void HomePageLoginMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();

        homepage.CheckEnglishButtonMethod();
        Thread.sleep(5000);
//        homepage.SearchBarMethod();
//        Thread.sleep(1000);
//        homepage.SearchData();

    }

    @Test
    public void TuwaiqTestMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.CheckEnglishButtonMethod();
        Thread.sleep(5000);
        homepage.clickOnBootCampButtonMethod();
        Thread.sleep(3000);
        homepage.clickOnfilterButtonMethod();
        Thread.sleep(3000);
        homepage.clickOnSearchFaildMethod();
        Thread.sleep(3000);
        homepage.clickOnRaginDropDownMethod();
        Thread.sleep(3000);
        homepage.selectFromRaginDropDownMethod();
        Thread.sleep(3000);
        homepage.SelectProgramMethod();
        Thread.sleep(3000);



    }

    @Test
    public void BootCampMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.CheckEnglishButtonMethod();
        Thread.sleep(2000);
        homepage.clickOnBootCampButtonMethod();
        homepage.GoToElementMethod(0,600);
        Thread.sleep(5000);



    }
}




