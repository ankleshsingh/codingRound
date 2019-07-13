package codingRound;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.PageClearTrip;
import util.BaseUtilClass;

public class SignInTest extends BaseUtilClass {

    //WebDriver driver = null;

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
    	PageClearTrip pgClearTrip=new PageClearTrip(driver);
    	navigateTo("https://www.cleartrip.com/");
        waitFor(2000);
        clickOn(pgClearTrip.Yourtrips);
        clickOn(pgClearTrip.SignIn);
        waitFor(5000);
        driver.switchTo().frame(pgClearTrip.iframe.size()-1);
        clickOn(pgClearTrip.signInButton);
        String errors1 = pgClearTrip.errors1.getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));       
    }

}
