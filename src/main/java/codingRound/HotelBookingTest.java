package codingRound;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.PageClearTrip;
import util.BaseUtilClass;

public class HotelBookingTest extends BaseUtilClass {
	@Test
	public void shouldBeAbleToSearchForHotels() {
		PageClearTrip pgClearTrip=new PageClearTrip(driver);
		navigateTo("https://www.cleartrip.com/");
		clickOn(pgClearTrip.hotelLink);
		setText(pgClearTrip.localityTextBox,"Indiranagar, Bangalore");
		new Select(pgClearTrip.travellerSelection).selectByVisibleText("1 room, 2 adults");
		clickOn(pgClearTrip.searchButton);

	}
}
