import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shop {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "/Users/user/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		
		WebElement book = driver.findElement(By.cssSelector("#search"));
		book.sendKeys("the great gatsby book");
		book.sendKeys(Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.id("addToCartButtonOrTextIdFor11341157")));
		add.click();
		
		WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test='content-wrapper']")));
		WebElement shipping = driver.findElement(By.xpath("//button[@data-test='fulfillment-cell-shipping']"));
		shipping.click();
		
		WebElement addtocart = popup.findElement(By.id("addToCartButtonOrTextIdFor11341157"));
		addtocart.click();
		

	}

}
