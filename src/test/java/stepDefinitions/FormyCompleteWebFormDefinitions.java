package stepDefinitions;

import config.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FormyCompleteWebFormPage;

public class FormyCompleteWebFormDefinitions extends TestBase{
    public FormyCompleteWebFormPage formyCompleteWebFormPage = new FormyCompleteWebFormPage(getDriver());

    @Given("The user is on the main page")
    public void theUserOpensTheApplication() {
        getDriver().navigate().to("https://formy-project.herokuapp.com/");

    }
    @When("The user clicks on 'complete web form button'")
    public void userClicksWebFormButton() {
        formyCompleteWebFormPage.getCompleteWebForm().click();
        TestBase.getWait().until(ExpectedConditions.visibilityOf(formyCompleteWebFormPage.getFirstName()));
    }
    @When("The user enters first name {string}")
    public void userEntersFirstName(String firstname){
        formyCompleteWebFormPage.getFirstName().sendKeys(firstname);
    }
    @When("The user enters last name {string}")
    public  void userEntersLastName(String lastname){
        formyCompleteWebFormPage.getLastName().sendKeys(lastname);}
    @When("The user enters job title {string}")
    public void userEntersJobTitle(String jobtitle){formyCompleteWebFormPage.getJobTitle().sendKeys(jobtitle);}
    @When("The user selects college")
    public void userSelectsCollege(){formyCompleteWebFormPage.getCollegeRadioButton().click();}
    @When("The user selects the sex option")
    public void userSelectsSexOption(){formyCompleteWebFormPage.getMaleCheckboxButton().click();}
    @When("The user selects years of experience")
    public void userSelectsYearsOfExperience(){
        formyCompleteWebFormPage.getExperienteDropDownSelect().click();
        formyCompleteWebFormPage.getYearsExperienceSelectMenu().click();
    }
    @When("The user selects the date {string}")
    public void userSelectsDate(String date){formyCompleteWebFormPage.getDatePicker().sendKeys(date);}
    @When("The user clicks on the submit button")
    public void userClicksSubmitButton(){formyCompleteWebFormPage.getSubmitButton().click();
    TestBase.getWait().until(ExpectedConditions.visibilityOf(formyCompleteWebFormPage.getSubmitMessage()));
    }
    @Then("The user receives submit message {string}")
    public void userReceivesSubmitMessage(String message){
        Assertions.assertEquals(formyCompleteWebFormPage.getSubmitMessage().getText(), message);}

}
