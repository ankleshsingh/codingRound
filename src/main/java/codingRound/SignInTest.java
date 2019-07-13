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
		driver.get("https://www.cleartrip.com/");
        waitFor(2000);

        pgClearTrip.Yourtrips.click();
        pgClearTrip.SignIn.click();
        waitFor(5000);
        driver.switchTo().frame(pgClearTrip.iframe.size()-1);
        pgClearTrip.signInButton.click();
        String errors1 = pgClearTrip.errors1.getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));       
    }

}
