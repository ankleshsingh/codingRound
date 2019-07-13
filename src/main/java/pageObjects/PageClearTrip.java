package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClearTrip {
	WebDriver driver;	

    @FindBy(linkText = "Hotels")
    public WebElement hotelLink;
    
	@FindBy(id = "Tags")
	public WebElement localityTextBox;

	@FindBy(id = "SearchHotelsButton")
	public WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	public WebElement travellerSelection;

	public PageClearTrip(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
}
