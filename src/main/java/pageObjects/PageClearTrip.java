package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	public WebElement OneWay;

	@FindBy(id = "FromTag")
	public WebElement FromTag;
	
	@FindBy(xpath = ".//ul[@id='ui-id-1']//li")
	public List<WebElement> originOptions;

	@FindBy(id = "ToTag")
	public WebElement ToTag;
	
	@FindBy(xpath = ".//ul[@id='ui-id-2']//li")
	public List<WebElement> destinationOptions;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
	public WebElement dtPicker;

	@FindBy(id = "SearchBtn")
	public WebElement SearchBtn;
	//=======Sign In===========
	@FindBy(linkText = "Your trips")
	public WebElement Yourtrips;
	
	@FindBy(id = "SignIn")
	public WebElement SignIn;

	@FindBy(tagName = "iframe")
	public List<WebElement> iframe;
	
	@FindBy(id = "signInButton")
	public WebElement signInButton;
	
	@FindBy(id = "errors1")
	public WebElement errors1;
    		
	public PageClearTrip(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
