package codingRound;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.PageClearTrip;
import util.BaseUtilClass;

public class SignInTest extends BaseUtilClass {
    private static final String URL = "https://www.cleartrip.com/";

	@Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
    	PageClearTrip pgClearTrip=new PageClearTrip(driver);
    	navigateTo(URL);
        waitFor(2000);
        clickOn(pgClearTrip.YourtripsLink);
        clickOn(pgClearTrip.SignInButton);
        waitFor(5000);
        driver.switchTo().frame(pgClearTrip.iframeFrame.size()-1);
        clickOn(pgClearTrip.signInButton);
        String errors1 = pgClearTrip.errorsText.getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));       
    }

}
