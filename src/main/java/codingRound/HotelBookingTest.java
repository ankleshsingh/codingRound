package codingRound;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.PageClearTrip;
import util.BaseUtilClass;

public class HotelBookingTest extends BaseUtilClass {
	private static final String TRAVELLER = "1 room, 2 adults";
	private static final String LOCALITY = "Indiranagar, Bangalore";
	private static final String URL = "https://www.cleartrip.com/";
	@Test
	public void shouldBeAbleToSearchForHotels() {
		PageClearTrip pgClearTrip=new PageClearTrip(driver);
		navigateTo(URL);
		clickOn(pgClearTrip.hotelLink);
		setText(pgClearTrip.localityTextBox,LOCALITY);
		new Select(pgClearTrip.travellerSelection).selectByVisibleText(TRAVELLER);
		clickOn(pgClearTrip.searchButton);

	}
}
