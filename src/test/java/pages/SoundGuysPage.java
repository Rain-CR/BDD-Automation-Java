package pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoundGuysPage {
    @FindBy(xpath = "//*[@class =' css-1hy2vtq']")
    private WebElement moreOptionsButton;
    @FindBy(xpath = "//*[@class =' css-8rroe4' and contains(text(), 'REJECT ALL')]")
    private WebElement rejectAllButton;
    @FindBy(xpath = "//*[@class = ' css-47sehv']")
    private WebElement saveAndExitButton;
    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[2]/div[6]/div/div[31]/button")
    private WebElement expandField;
    @FindBy(xpath = "//a[@href='https://www.soundguys.com/bluetooth-le-audio-lc3-explained-28192/']")
    private WebElement hereButton;


    public SoundGuysPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public WebElement getMoreOptionsButton(){return moreOptionsButton;}
    public WebElement getRejectAllButton(){return rejectAllButton;}
    public WebElement getSaveAndExitButton(){return saveAndExitButton;}
    public WebElement getHereButton(){return hereButton;}

    public void clickOnHereButton(){
        hereButton.click();
    }
    public WebElement getExpandField(){return expandField;}


}
