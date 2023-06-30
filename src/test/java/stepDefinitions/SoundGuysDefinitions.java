package stepDefinitions;

import config.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.SoundGuysPage;

import java.util.ArrayList;

import static org.openqa.selenium.Keys.CONTROL;
import static org.openqa.selenium.Keys.TAB;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class SoundGuysDefinitions extends TestBase {
    public SoundGuysPage soundGuysPage = new SoundGuysPage(getDriver());
    @Given("The user is on the main page for sound guys")
    public void theUserIsOnMainPage(){
        getDriver().navigate().to("https://www.soundguys.com/sony-wh-1000xm5-vs-sony-wh-1000xm4-71945/");
        TestBase.getWait().until(ExpectedConditions.visibilityOf(soundGuysPage.getMoreOptionsButton()));
    }
    @When("The user clicks on the 'more options' button")
    public void theUserClicksMoreOptions(){soundGuysPage.getMoreOptionsButton().click();}
    @When("The user clicks on reject all")
    public void theUserClicksOnRejectAllButton(){soundGuysPage.getRejectAllButton().click();}
    @When("The user clicks on 'save and exit' button")
    public void theUserClicksOnSaveAndExitButton(){soundGuysPage.getSaveAndExitButton().click();}
    @When("The user clicks the 'here' button")
    public void theUserClicksOnHereButton(){

        Actions actions = new Actions(getDriver());
        soundGuysPage.getExpandField().click();
        actions.moveToElement(soundGuysPage.getHereButton());
        actions.perform();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", soundGuysPage.getExpandField());
        soundGuysPage.clickOnHereButton();
        TestBase.getWait().until(WebDriver::getCurrentUrl);


        String originalWindow = getDriver().getWindowHandle();
        ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));

    }
    @Then("The user is redirected to")
    public void userIsRedirected(){


        Assertions.assertEquals(TestBase.geturl(),"https://www.soundguys.com/bluetooth-le-audio-lc3-explained-28192/");
    }
}
