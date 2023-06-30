package pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormyCompleteWebFormPage {
     @FindBy(linkText = "Complete Web Form")
    private WebElement completeWebForm;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "job-title")
    private  WebElement jobTitle;

    @FindBy(id = "radio-button-2")
    private WebElement collegeRadioButton;

    @FindBy(id = "checkbox-1")
    private WebElement maleCheckboxButton;

    @FindBy(id = "select-menu")
    private WebElement experienteDropDownSelect;

    @FindBy(css = "#select-menu > option:nth-child(2)")
    private WebElement yearsExperienceSelectMenu;

    @FindBy(id = "datepicker")
    private WebElement datePicker;

    @FindBy(linkText = "Submit")
    private WebElement submitButton;
    @FindBy(xpath = "//*[@class='alert alert-success']")
    private WebElement submitMessage;

    public FormyCompleteWebFormPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public WebElement getCompleteWebForm() {return completeWebForm ;}
    public WebElement getFirstName(){return firstName;}
    public WebElement getLastName(){return lastName;}
    public WebElement getJobTitle(){ return jobTitle;}
    public WebElement getCollegeRadioButton(){return collegeRadioButton;}
    public WebElement getMaleCheckboxButton(){return maleCheckboxButton;}
    public WebElement getExperienteDropDownSelect(){return experienteDropDownSelect;}
    public WebElement getYearsExperienceSelectMenu(){return yearsExperienceSelectMenu;}
    public WebElement getDatePicker(){return datePicker;}
    public WebElement getSubmitButton(){return submitButton;}
    public WebElement getSubmitMessage(){return submitMessage;}
}
