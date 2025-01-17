package Steps;

import Pages.FormulaOnePage;
import Pages.FormulaOneResultsPage;
import Pages.HomePage;
import Pages.SearchPage;
import Utils.BrowserFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class StepsDef {

    WebDriver driver;

    BrowserFactory browserFactory = new BrowserFactory();
    HomePage homePage;
    FormulaOnePage formulaOnePage;
    FormulaOneResultsPage formulaOneResultsPage;
    SearchPage searchPage;

    @Given("I am on the BBC Sport homepage")
    public void i_am_on_the_bbc_sport_homepage() {
        driver = browserFactory.startBrowser("https://www.bbc.com/sport", "chrome");
        homePage = new HomePage(driver);
        homePage.verifySportPage();
    }

    @Given("I am on the Formula One section of the website")
    public void i_am_on_the_formula_one_section_of_the_website() {
        homePage.clickFormulaLink();
    }

    @And("I click on the Results link")
    public void i_click_on_the_results_link() {

        formulaOnePage = new FormulaOnePage(driver);
        formulaOnePage.verifyPageHeading();
        formulaOnePage.clickResults();
    }

    @And("I select the Two Thousand and Twenty-Three tab")
    public void i_select_the_two_thousand_and_twenty_three_tab() {
        formulaOneResultsPage = new FormulaOneResultsPage(driver);
        formulaOneResultsPage.verifyFormulaOneResultsPage();
        formulaOneResultsPage.clickYearResults();
    }

    @When("I select the Las Vegas Grand Prix from the dropdown menu")
    public void i_select_the_las_vegas_grand_prix_from_the_dropdown_menu() {
        formulaOneResultsPage.clickLesVegasLink();
    }

    @Then("I must see the displayed results for the Las Vegas Grand Prix in the year two thousand and twenty-three")
    public void i_must_see_the_displayed_results_for_the_las_vegas_grand_prix_in_the_year_two_thousand_and_twenty_three() {
        formulaOneResultsPage.verifyFirstPlace();
        formulaOneResultsPage.verifySecondPlace();
        formulaOneResultsPage.verifyThirdPlace();
    }

    @Given("I enter Sport in the year two thousand and twenty-three in the search bar")
    public void i_enter_sport_in_the_year_two_thousand_and_twenty_three_in_the_search_bar() {
        homePage.clickSearchBar();
        searchPage = new SearchPage(driver);
        searchPage.enterSearchString("Sport in 2023");
    }
    @And("I click the search button")
    public void i_click_the_search_button() {
        searchPage.clickSearchButton();
    }
    @When("the search results page must be displayed")
    public void the_search_results_page_must_be_displayed() {
        searchPage.verifyResultsAreDisplayed();
    }
    @Then("there must be at least four relevant results related to Sport in the year two thousand and twenty-three")
    public void there_must_be_at_least_four_relevant_results_related_to_sport_in_the_year_two_thousand_and_twenty_three() {
        searchPage.verifySportIn2023AreDisplayed();
    }

}
