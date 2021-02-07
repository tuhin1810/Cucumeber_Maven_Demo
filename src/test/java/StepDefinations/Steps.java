package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    WebDriver driver;
    @Given("^Open the chrome and lunch the application$")
    public void open_the_google_chrome_and_lunch_the_application(){

       System.out.println("This step open the google chrome and lunch the application");
        System.setProperty("webdriver.chrome.driver", "G:/Driver1/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php ");
    }
    @When("^Enter the username and password$")
    public void enter_the_username_and_password(){

        System.out.println("Enter the username and password");
        //driver.findElement(By.name("email")).sendKeys("username12");
        //driver.findElement(By.name("passwd")).sendKeys("password12");

    }
    @Then("^Reset the credential$")
    public void reset_the_credential(){
        System.out.println("Reset the credential");
        //  driver.findElement(By.name("SubmitLogin")).click();
    }
}
