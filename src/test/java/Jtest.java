import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Jtest {


    @BeforeClass
    public void runDriver() {
        System.out.println("@BeforeClass");
        Assert.assertTrue(true);
    }



    @Test(description = "Login functionality", groups = {"highPriority"})
    public void TestLogin() throws InterruptedException {
        System.out.println("@BTest");
        Assert.assertTrue(true);
    }

    @AfterClass
    public void finishDriver() {
        System.out.println("@AfterClass");
        Assert.assertTrue(true);
    }
}