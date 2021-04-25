package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class UITest{
	
	WebDriver driver;
	
	@Given("open the bbc url {string} and {int}")
	public void navigateurl(String url,int opt) {
		
		try {
					
			String date = LocalDate.now().toString();
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathish\\Downloads\\chromedriver\\chromedriver.exe");
			Thread.sleep(5000);
			
			driver = new ChromeDriver();
			
			if (opt == 1) {
				driver.get(url + "/" + date);
			}
			else {
				driver.get(url);
			}
						
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
						
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
 	}
	
	@When("record all the teams playing today")
	public void gettodayteam() {
		int i =0;String strval; 
				
		WebElement keyele= driver.findElement(By.name("search"));
		  
		WebDriverWait drvwait = new WebDriverWait(driver, 20);
		drvwait.until(ExpectedConditions.visibilityOf(keyele));
		
		List<WebElement> allweb = driver.findElements(By.className("qa-match-block"));
				
		System.out.println(allweb.size());
			
		for(WebElement ele: allweb) {
			
			i++;
									
			System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[3]/div/div/span/div/div[" + i + "]/h3")).getText());					
			
			List<WebElement> subele = ele.findElements(By.className("sp-c-fixture"));
								
			for(WebElement divele: subele) {
				List<WebElement> match = divele.findElements(By.className("sp-c-fixture__wrapper"));				
										
				strval = "";
								
				for(WebElement childele: match) {
					strval = childele.getText().trim();		
					System.out.println(strval);
				}
				
				System.out.println(" ");
			}
								
		}
	}
			
	@When("get sports article")
	public void getsportsarticle() {
		try {
			WebElement keyele= driver.findElement(By.id("orb-search-q"));
			
			WebDriverWait drvwait = new WebDriverWait(driver, 20);
			drvwait.until(ExpectedConditions.elementToBeClickable(keyele));
			Thread.sleep(500);
			
			keyele.sendKeys("Sports",Keys.ENTER);			
			Thread.sleep(5000);					
			
			List<WebElement> alist = driver.findElements(By.xpath("html/body/div/div/main/div[1]/div[3]/div/div/ul/li"));
									
			System.out.println(alist.size());
						
			for(WebElement link: alist) {
				//System.out.println(link.getText());
				
				List<WebElement> sublist = link.findElements(By.tagName("a"));						
				
				for(WebElement listele: sublist) {
					System.out.println(listele.getText());
				}
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
			
	@When("Enter wrong user name")
	public void enter_wrong_user_name() {
		
		try {
			
			driver.findElement(By.id("idcta-username")).click();
			
			WebElement user = driver.findElement(By.id("user-identifier-input"));
			
			while(user.isDisplayed() == false) {
				Thread.sleep(1000);
			}
			
			user.sendKeys("sathish@gmail.com");		
			Thread.sleep(500);
			
			driver.findElement(By.id("submit-button")).click();
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@When("Enter wrong short password")
	public void enter_wrong_password() {
		try {
			driver.findElement(By.id("user-identifier-input")).clear();
			Thread.sleep(500);
			
			driver.findElement(By.id("user-identifier-input")).sendKeys("sathish@gmail.com");		
			Thread.sleep(500);
			
			driver.findElement(By.id("password-input")).sendKeys("abcd123");	
			
			driver.findElement(By.id("submit-button")).click();		
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("Enter wrong user and password")
	public void enter_wrong_userpassword() {
		try {
			driver.findElement(By.id("user-identifier-input")).clear();
			Thread.sleep(500);
			
			driver.findElement(By.id("user-identifier-input")).sendKeys("sathish@gmail.com");		
			Thread.sleep(500);
			
			driver.findElement(By.id("password-input")).clear();
			Thread.sleep(500);
			
			driver.findElement(By.id("password-input")).sendKeys("abcd123456");	
			
			driver.findElement(By.id("submit-button")).click();		
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("verify the user message")
	public void verifyusermessage() {
		String strmsg = "";String strexpmsg = "";
		
		strexpmsg = "Sorry, those details don't match. Check you've typed them correctly.";		
		
		strmsg = driver.findElement(By.id("form-message-general")).getText();
			
		assertEquals(strexpmsg, strmsg);
		
	}
	
	@Then("verify the password message")
	public void verifypassmessage() {
		String strmsg = "";String strexpmsg = "";	
			
		strexpmsg = "Sorry, that password is too short. It needs to be eight characters or more.";
		strmsg = driver.findElement(By.id("form-message-password")).getText();
		
		assertEquals(strexpmsg, strmsg);
	}
	
	@Then("verify the user signin message")
	public void verifyusersignmessage() {		
		String strmsg = "";String strexpmsg = "";
		
		strexpmsg = "Sorry, we can’t find an account with that email. You can register for a new account or get help here.";
		
		strmsg = driver.findElement(By.id("form-message-username")).getText();
		
		assertEquals(strexpmsg, strmsg);			

	}
	
	@Then("close the browser")
	public void closebrowser() {
		driver.quit();
	}
}