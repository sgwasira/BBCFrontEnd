package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class FormulaOnePage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='ssrcss-1mstwv3-LinkTextContainer eis6szr1'][contains(.,'Results')]")
    WebElement results_xpath;

    @FindBy(xpath = "//h1[contains(@id,'main-heading')]")
    WebElement formulaOnePAgeHeading_xpath;

    public FormulaOnePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyPageHeading(){
        new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(formulaOnePAgeHeading_xpath));
        String pageHeading = formulaOnePAgeHeading_xpath.getText();

        Assert.assertEquals(pageHeading,"Formula 1");

    }
}
