package StepsLogin;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps extends BaseUtil {

    private  BaseUtil base;
    WebDriver driver;
    @Before
    @Given("user is open browser")
    public void user_is_open_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    @And("^user open using URL as ([^\"]*)$")
    public void userOpenUsingURLAsUrl(String url) {
       driver.get(url);
    }
    @When("^user enters valid credentials username as ([^\"]*) and password as ([^\"]*)$")
    public void userEntersValidCredentialsUsernameAsUnameAndPasswordAsPwd(String uname, String pwd) {
        driver.findElement(By.name("UserName")).sendKeys(uname);
        driver.findElement(By.name("Password")).sendKeys(pwd);
    }
    @And("user clicks login button")
    public void user_clicks_login_button() {
        driver.findElement(By.name("Login")).click();
    }
    @Then("user navigated to Home Page")
    public void user_navigated_to_home_page() {
        driver.getPageSource().contains("Execute Automation Selenium Test Site");
    }
    @After
    @And("user is closed browser")
    public void user_is_closed_browser() {
       driver.quit();

    }

}
