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
    	navigateTo("https://www.cleartrip.com/");
        waitFor(2000);
        clickOn(pgClearTrip.OneWay);
        clickOn(pgClearTrip.FromTag);
        setText(pgClearTrip.FromTag,"Bangalore");
        clickOn(pgClearTrip.FromTag);
        pgClearTrip.FromTag.sendKeys(Keys.ARROW_DOWN);
        //wait for the auto complete options to appear for the origin
        waitFor(10000);
        clickOn(pgClearTrip.originOptions.get(0));
        setText(pgClearTrip.ToTag,"Delhi");
        clickOn(pgClearTrip.ToTag);
        pgClearTrip.ToTag.sendKeys(Keys.ARROW_DOWN);
        //wait for the auto complete options to appear for the origin
        waitFor(10000);
        //select the first item from the destination auto complete list
        clickOn(pgClearTrip.destinationOptions.get(0));

        clickOn(pgClearTrip.dtPicker);

        //all fields filled in. Now click on search
        clickOn(pgClearTrip.SearchBtn);

        waitFor(5000);
        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent(By.className("searchSummary")));


    }
}
