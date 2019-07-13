package codingRound;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.PageClearTrip;
import util.BaseUtilClass;

public class FlightBookingTest extends BaseUtilClass{
	private static final String TO = "Delhi";
	private static final String FROM = "Bangalore";
	private static final String URL = "https://www.cleartrip.com/";
    @Test
    public void testThatResultsAppearForAOneWayJourney() {
    	PageClearTrip pgClearTrip=new PageClearTrip(driver);
    	navigateTo(URL);
        waitFor(2000);
        clickOn(pgClearTrip.OneWayRadio);
        setText(pgClearTrip.FromTagTextBox,FROM);
        pgClearTrip.FromTagTextBox.sendKeys(Keys.ARROW_DOWN);
        //wait for the auto complete options to appear for the origin
        waitFor(10000);
        clickOn(pgClearTrip.originOptionsList.get(0));
        setText(pgClearTrip.ToTagTextBox,TO);
        pgClearTrip.ToTagTextBox.sendKeys(Keys.ARROW_DOWN);
        //wait for the auto complete options to appear for the origin
        waitFor(10000);
        //select the first item from the destination auto complete list
        clickOn(pgClearTrip.destinationOptionsList.get(0));

        clickOn(pgClearTrip.dtPickerLink);

        //all fields filled in. Now click on search
        clickOn(pgClearTrip.SearchButton);

        waitFor(5000);
        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent(By.className("searchSummary")));


    }
}
