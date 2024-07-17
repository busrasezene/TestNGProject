import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGClass2 {

    WebDriver driver;

    @BeforeTest
    public void prepare(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    //tarayıcı kapatma
    @AfterTest
    public void teardown(){
        driver.quit();
    }

    //tarayıcıyı açma//
    @Test (priority=-2)
    public void openwebsite() {
        System.out.println("Let's open the browser");
        driver.navigate().to("https://www.google.com");
    }

    //kayıt olmak
    @Test (priority=1)
    public void signUp(){
        System.out.println("Signing up");
    }

    //oturum açmak
    @Test  (priority=2)
    public void login(){
        System.out.println("Logging in");
    }

    //sepete ürün eklemek
    @Test  (priority=3)
    public void addToCart(){
        System.out.println("Add items to cart");
    }

    //oturum kapatmak
    @Test (priority=4)
    public void logOut(){
        System.out.println("Logging out");
    }

}
