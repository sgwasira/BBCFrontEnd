package Steps;

import Pages.FormulaOnePage;
import Pages.FormulaOneResultsPage;
import Pages.HomePage;
import Utils.BrowserFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class StepsDef {

    WebDriver driver;

    BrowserFactory browserFactory = new BrowserFactory();
    HomePage homePage;
    FormulaOnePage formulaOnePage;
    FormulaOneResultsPage formulaOneResultsPage;

    @Given("I am use on the homepage of BBC Sport")
    public void i_am_use_on_the_homepage_of_bbc_sport() {
        driver = browserFactory.startBrowser("https://www.bbc.com/sport", "chrome");
        homePage = new HomePage(driver);
        homePage.verifySportPage();
    }


    @And("I on the Formula One link on the nav")
    public void i_on_the_formula_one_link_on_the_nav() {
        homePage.clickFormulaLink();
    }

    @And("I click on the results link")
    public void i_click_on_the_results_link() {

        formulaOnePage = new FormulaOnePage(driver);
        formulaOnePage.verifyPageHeading();
        formulaOnePage.clickResults();

    }

    @And("I click on the two thousand twenty-three tab")
    public void i_click_on_the_two_thousand_twenty_three_tab() {
        formulaOneResultsPage = new FormulaOneResultsPage(driver);
        formulaOneResultsPage.verifyFormulaOneResultsPage();
        formulaOneResultsPage.clickYearResults();

    }

    @When("I select theLas Vegas Grand Prix drop dropdown")
    public void i_select_the_las_vegas_grand_prix_drop_dropdown() {

    }

    @Then("I must see the displayed results of that Grand Prix")
    public void i_must_see_the_displayed_results_of_that_grand_prix() {

    }

}
