package TestExercise; import java.util.Iterator; import java.util.Set;
import org.openqa.selenium.By; import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; import io.cucumber.java.en.And;
import io.cucumber.java.en.Then; public class SeleniumMiniProject{
public static void main(String[] args) throws InterruptedException{ System.setProperty("Webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver_win32\\ chromedriver.exe");
WebDriver driver=new ChromeDriver();

//Login to Amazon page
driver.findElement(By.id("nav-link-accountList")).click(); 
               driver.findElement(By.id("ap_email")).sendKeys("shivanibhoite2621gmail.com");
               driver.findElement(By.className("a-button-input")).click(); 
              driver.findElement(By.id("ap_password")).sendKeys("shivani123"); 
               driver.findElement(By.id("signInSubmit")).click(); System.out.println("Successfully Login");

System.out.println("successfully Add the cart"); Thread.sleep(5000);
driver.quit();
                                                                  
 }}
