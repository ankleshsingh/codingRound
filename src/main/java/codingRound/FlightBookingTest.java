package codingRound;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.PageClearTrip;
import util.BaseUtilClass;

public class FlightBookingTest extends BaseUtilClass{
    @Test
    public void testThatResultsAppearForAOneWayJourney() {
    	PageClearTrip pgClearTrip=new PageClearTrip(driver);
		driver.get("https://www.cleartrip.com/");
        waitFor(2000);
        pgClearTrip.OneWay.click();
        pgClearTrip.FromTag.click();
        pgClearTrip.FromTag.clear();
        pgClearTrip.FromTag.sendKeys("Bangalore");
        pgClearTrip.FromTag.click();
        pgClearTrip.FromTag.sendKeys(Keys.ARROW_DOWN);
        //wait for the auto complete options to appear for the origin
        waitFor(5000);
        pgClearTrip.originOptions.get(0).click();
        pgClearTrip.ToTag.clear();
        pgClearTrip.ToTag.sendKeys("Delhi");
        pgClearTrip.ToTag.click();
        pgClearTrip.ToTag.sendKeys(Keys.ARROW_DOWN);
        //wait for the auto complete options to appear for the origin
        waitFor(5000);
        //select the first item from the destination auto complete list
        pgClearTrip.destinationOptions.get(0).click();

        pgClearTrip.dtPicker.click();

        //all fields filled in. Now click on search
        pgClearTrip.SearchBtn.click();

        waitFor(5000);
        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent(By.className("searchSummary")));


    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
