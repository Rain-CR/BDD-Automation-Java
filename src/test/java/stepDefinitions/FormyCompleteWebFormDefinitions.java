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

public class FormyCompleteWebFormDefinitions {
    public FormyCompleteWebFormPage formyCompleteWebFormPage = new FormyCompleteWebFormPage();

    @Given("The user is on the main page")
    public void theUserOpensTheApplication() {
        formyCompleteWebFormPage.getDriver().navigate().to("https://formy-project.herokuapp.com/");

    }
    @When("The user clicks on 'complete web form button'")
    public void userClicksWebFormButton() {
        formyCompleteWebFormPage.getCompleteWebForm().click();
        TestBase.getWait().until(ExpectedConditions.visibilityOf(formyCompleteWebFormPage.getFirstName()));
    }
    @When("The user enters first name")
    public void userEntersFirstName(){
        formyCompleteWebFormPage.getFirstName().sendKeys("Ciuciuca");
    }
    @When("The user enters last name")
    public  void userEntersLastName(){
        formyCompleteWebFormPage.getLastName().sendKeys("Armand");
    }
    @When("The user enters job title")
    public void userEntersJobTitle(){formyCompleteWebFormPage.getJobTitle().sendKeys("QA Tester");}
    @When("The user selects college")
    public void userSelectsCollege(){formyCompleteWebFormPage.getCollegeRadioButton().click();}
    @When("The user selects the sex option")
    public void userSelectsSexOption(){formyCompleteWebFormPage.getMaleCheckboxButton().click();}
    @When("The user selects years of experience")
    public void userSelectsYearsOfExperience(){
        formyCompleteWebFormPage.getExperienteDropDownSelect().click();
        formyCompleteWebFormPage.getYearsExperienceSelectMenu().click();
    }
    @When("The user selects the date")
    public void userSelectsDate(){formyCompleteWebFormPage.getDatePicker().sendKeys("05/22/2023");}
    @When("The user clicks on the submit button")
    public void userClicksSubmitButton(){formyCompleteWebFormPage.getSubmitButton().click();
    TestBase.getWait().until(ExpectedConditions.visibilityOf(formyCompleteWebFormPage.getSubmitMessage()));
    }
    @Then("The user receives submit message")
    public void userReceivesSubmitMessage(){
        Assertions.assertEquals(formyCompleteWebFormPage.getSubmitMessage().getText(),  "The form was successfully submitted!");}
}
