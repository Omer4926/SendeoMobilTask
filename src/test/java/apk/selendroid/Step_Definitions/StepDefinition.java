package apk.selendroid.Step_Definitions;

import apk.selendroid.Utilities.MobilUtils;
import apk.selendroid.Pages.*;

import apk.selendroid.Utilities.TestData;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class StepDefinition {
    OnboardingScreen onboardingScreen = new OnboardingScreen();
    MainPageObject mainPage = new MainPageObject();
    RegistrationPageObject registrationPageObject = new RegistrationPageObject();


    @Given("^User should pass onboarding screens$")
    public void user_should_pass_onboarding_screens() throws Throwable {
        MobilUtils.setUp("android");
        Thread.sleep(3000);
        onboardingScreen.clickOKButton();
    }
    @When("^I navigate to Registration Page$")
    public void ıNavigateToRegistrationPage() {
        mainPage.clickRegistrationButton();
    }

    @And("^I entered the information$")
    public void ıEnteredTheInformation() throws InterruptedException {
        registrationPageObject.fillUsernameInput(TestData.username);
        registrationPageObject.fillEmailInput(TestData.email);
        registrationPageObject.fillPasswordInput(TestData.password);
        registrationPageObject.fillNameInput(TestData.name);
        registrationPageObject.clickProgrammingLanguage();
        registrationPageObject.clickTandCCheckbox();
    }

    @And("^Click register user button$")
    public void clickRegisterUserButton() {
        registrationPageObject.clickTheRegisterUserButton();
    }

    @Then("^verify user seen successfully$")
    public void verifyUserSeenSuccessfully() {
        Assert.assertTrue(registrationPageObject.getVerifyUserText().contains("Verify user"));
    }

    @Then("^verify button is display or not$")
    public void verifyButtonIsDisplayOrNot() {
        Assert.assertTrue(mainPage.isDisplayButton());
    }

    @And("^Click I accept adds checkbox button$")
    public void clickIAcceptAddsCheckboxButton() {
        mainPage.clickAddsCheckboxButton();
    }

    @Then("^Verify checkbox button selected or not$")
    public void verifyCheckboxButtonSelectedOrNot() {
        Assert.assertFalse(mainPage.isSelectedCheckboxButton());
    }

    @And("^Click display text view button$")
    public void clickDisplayTextViewButton() {
        mainPage.clickDisplayTextViewButton();
    }

    @Then("^Verify text must be appear$")
    public void verifyTextMustBeAppear() {
        Assert.assertTrue(mainPage.getTextDisplayTextViewButton().contains("Text is sometimes displayed"));
    }
}

