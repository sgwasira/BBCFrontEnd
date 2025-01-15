package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class FormulaOneResultsPage {

    WebDriver driver;

    @FindBy(xpath = "//div[@data-content='2023'][contains(.,'2023')]")
    WebElement yearResults_xpath;

    @FindBy(xpath = "//h1[contains(@id,'main-heading')]")
    WebElement pageHeading_xpath;

    @FindBy(xpath = "//span[@data-js-text='true'][contains(.,'Las Vegas Grand Prix, Las Vegas Street Circuit')]")
    WebElement lasVegasStreetCircuit_xpath;

    public FormulaOneResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyFormulaOneResultsPage() {
        new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(pageHeading_xpath));
        String pageHeading = pageHeading_xpath.getText();

        Assert.assertEquals(pageHeading, "Formula 1 Results");
    }

    public void clickYearResults() {
        yearResults_xpath.click();
    }

    public  void clickLesVegasLink(){
        lasVegasStreetCircuit_xpath.click();
    }
}
