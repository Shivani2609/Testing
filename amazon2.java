package TestExercise;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
public class SeleniumMiniProject{
public static void main(String[] args) throws InterruptedException{
System.setProperty("Webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver_win32\\
chromedriver.exe");
WebDriver driver=new ChromeDriver();
//Launch Amazon browser
driver.get("http://www.amazon.in/");
String Exception1 = driver.getTitle();
System.out.println(driver.getTitle());
//Login to Amazon page
driver.findElement(By.id("nav-link-accountList")).click();
driver.findElement(By.id("ap_email")).sendKeys("shivanibhoite2621@gmail.com");
driver.findElement(By.className("a-button-input")).click();
driver.findElement(By.id("ap_password")).sendKeys("shiv2126");
driver.findElement(By.id("signInSubmit")).click();
System.out.println("Successfully Login");
//Search bar
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("neck band");
driver.findElement(By.id("nav-search-submit-button")).click();
System.out.println("Done the searchbar");
driver.findElement(By.linkText("boAt Rockerz 255 Pro+ in-Ear Bluetooth Neckband with Upto 
40 Hours Playback, ASAP™Charge, IPX7, Dual Pairing, BT v5.0, with Mic (Active 
Black)")).click();
//Add cart
Set<String> ids = driver.getWindowHandles();
Iterator<String> it = ids.iterator();
String parentId = it.next();
String childId = it.next();
driver.switchTo().window(childId);
driver.findElement(By.id("add-to-cart-button")).click();
driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[3]/div/a[5]/div[1]/span[1]
.click();
System.out.println("successfully Add the cart");
Thread.sleep(5000);
driver.quit();}}
