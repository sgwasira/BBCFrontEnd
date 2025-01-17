package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='visually-hidden ssrcss-1f39n02-VisuallyHidden e16en2lz0'][contains(.,'BBC Sport')]")
    WebElement sportPageTitle_xpath;

    @FindBy(xpath = "//span[@class='ssrcss-1u47p8g-LinkTextContainer eis6szr1'][contains(.,'Formula 1')]")
    WebElement formulaLink_xpath;

    @FindBy(xpath = "//a[@href='https://www.bbc.co.uk/search?d=SPORT_GNL'][contains(.,'Search BBC')]")
    WebElement searchBar_xpath;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void verifySportPage() {
        new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(sportPageTitle_xpath));
        String pageTitle = sportPageTitle_xpath.getText();
        Assert.assertEquals(pageTitle, "BBC Sport");
    }

    public void clickFormulaLink() {
        formulaLink_xpath.click();
    }

    public void enterSearchString(String searchText){
        searchBar_xpath.sendKeys(searchText);
    }

    public void clickSearchBar(){
        searchBar_xpath.click();
    }

}
