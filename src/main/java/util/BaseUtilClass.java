package util;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sun.javafx.PlatformUtil;

public class BaseUtilClass {
	public WebDriver driver = null;
	/**
	 * @author Anklesh Singh
	 * Setup up action which will be executed at the start of Test Case
	 */
	@BeforeClass
	private void setup() {
		if (PlatformUtil.isMac()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
		}
		if (PlatformUtil.isWindows()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		}
		if (PlatformUtil.isLinux()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
		}
		driver = new ChromeDriver();
	}
	/**
	 * @author Anklesh Singh
	 * Clean up action which will be executed at the end of Test Case
	 */
	@AfterClass
	private void tearDown() {
		driver.quit();
	}
	
    public void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
    /**
     * Clicks on WebElement
     * @author Anklesh Singh
     * @param weObject Webelement Object which needs to be clicked upon
     */
    public void clickOn(WebElement weObject) {
        try {
            weObject.click();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
    
    /**
     * Set texts in WebElement
     * @author Anklesh Singh
     * @param weObject Webelement Object which needs to be set
     * @param sText Text needs to be set
     */
    public void setText(WebElement weObject,String sText) {
        try {
        	weObject.click();
        	weObject.clear();
        	weObject.sendKeys(sText);
            weObject.click();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
    
    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    
    /**
     * Navigates to given URL
     * @author Anklesh Singh
     * @param sURL URL to be navigated
     */
    public void navigateTo(String sUrl) {
        try {
            driver.get(sUrl);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
