import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Capabilities;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class SuccessRegMain {
	
  public static final String USERNAME = "earlwillis1";
  public static final String AUTOMATE_KEY = "XsPyFTirN4mH8aCLMB9A";
  public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

  static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

  @Test
  public void TestRun() throws Exception {
	  

    
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("build", "version1");
    caps.setCapability("project", "CoffeeMate Performance");
    caps.setCapability("browser", "IE");
    caps.setCapability("browser_version", "11.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "8.1");
    caps.setCapability("resolution", "1024x768");
    caps.setCapability("browserstack.debug", "true");
    
    //DesiredCapabilities caps1 = new DesiredCapabilities();
   // caps1.setCapability("browserName", "iPhone");
   // caps1.setPlatform(Platform.MAC);
   // caps1.setCapability("device", "iPhone 5");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    //driver.get("http://stage.coffee-mate.com");
	Thread.sleep(4000);
    // This script will a User withRegister with: 
    // a. At least 1 Upper case character AND
    // b. At least 1 Lower case character AND
    // c. At least 1 number OR a special character 
    
    driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
    driver.findElement(By.id("ctl00_ucJoinNowMain_txtJoinNowEmail")).clear();
   // driver.findElement(By.id("ctl00_ucJoinNowMain_txtJoinNowEmail")).sendKeys("user2@pkt.com");
   // driver.findElement(By.id("ctl00_ucJoinNowMain_btnJoinNow")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtFirstName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtFirstName")).sendKeys("UserOneFirst");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtLastName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtLastName")).sendKeys("UserOneLast");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtPassword")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtPassword")).sendKeys("Password#$");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtConfirmPassword")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtConfirmPassword")).sendKeys("Password#$");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtAddress")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtAddress")).sendKeys("3510 Test Lane");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtAddress2")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtAddress2")).sendKeys("Apt. 3B");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtCity")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtCity")).sendKeys("New York");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_ddlStates"))).selectByVisibleText("New York");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtZipCode")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtZipCode")).sendKeys("10075");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_chkEmailCommunication")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_btnRegister")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    //assertEquals("You're almost done!", driver.findElement(By.cssSelector("p.intro")).getText());
    
    
	 	new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_lvQuestions_ctrl0_ucSurveyQuestion_ddlAnswers"))).selectByVisibleText("0");
	    driver.findElement(By.cssSelector("option[value=\"1E4C6A78-1980-459F-BE01-049AB4CB432C\"]")).click();
		Thread.sleep(3000);
	    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_lvQuestions_ctrl1_ucSurveyQuestion_ddlAnswers"))).selectByVisibleText("0");
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector("option[value=\"138A6025-F98D-4A64-B36C-4A08DAB4F075\"]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSubmit")).click();

	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    driver.findElement(By.id("ctl00_ucProfilePanelMain_btnLogout")).click();
    

   

  

    driver.quit();

  }



private static void assertEquals(String string, String text) {
	// TODO Auto-generated method stub
	
}
}
