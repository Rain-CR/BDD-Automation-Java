package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;

public class LoginStepDefinitions {
    private LoginPage loginPage = new LoginPage();

    @Given("the user opens the Login application")
    public void theUserOpensTheApplication() {
        loginPage.getDriver().navigate().to("https://the-internet.herokuapp.com/login");
    }

    @When("the user enters a username {string}")
    public void enterUsername(String username) {
        loginPage.getUsernameField().sendKeys(username);
    }

    @And("the user enters a valid password {string}")
    public void enterValidPassword(String password) {
        loginPage.getPasswordField().sendKeys(password);
    }

    @And("the user clicks on the Login button")
    public void clickOnTheLoginButton() {
        loginPage.getLoginButton().click();
    }

    @Then("the user receives the following message {string}")
    public void userIsLoggedIn(String popUpMessage) {
        Assertions.assertEquals(popUpMessage, loginPage.getMessage().getText());
    }
}
