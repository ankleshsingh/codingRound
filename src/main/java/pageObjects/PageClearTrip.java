package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClearTrip {
	WebDriver driver;
	// =======Hotel Booking===========
	@FindBy(linkText = "Hotels")
	public WebElement hotelLink;

	@FindBy(id = "Tags")
	public WebElement localityTextBox;

	@FindBy(id = "SearchHotelsButton")
	public WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	public WebElement travellerSelection;

	// =======Flight Booking===========
	@FindBy(id = "OneWay")
	public WebElement OneWayRadio;

	@FindBy(id = "FromTag")
	public WebElement FromTagTextBox;
	
	@FindBy(xpath = ".//ul[@id='ui-id-1']//li")
	public List<WebElement> originOptionsList;

	@FindBy(id = "ToTag")
	public WebElement ToTagTextBox;
	
	@FindBy(xpath = ".//ul[@id='ui-id-2']//li")
	public List<WebElement> destinationOptionsList;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
	public WebElement dtPickerLink;

	@FindBy(id = "SearchBtn")
	public WebElement SearchButton;
	//=======Sign In===========
	@FindBy(linkText = "Your trips")
	public WebElement YourtripsLink;
	
	@FindBy(id = "SignIn")
	public WebElement SignInButton;

	@FindBy(tagName = "iframe")
	public List<WebElement> iframeFrame;
	
	@FindBy(id = "signInButton")
	public WebElement signInButton;
	
	@FindBy(id = "errors1")
	public WebElement errorsText;
    		
	public PageClearTrip(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
