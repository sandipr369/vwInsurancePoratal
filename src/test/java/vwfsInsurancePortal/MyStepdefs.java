package vwfsInsurancePortal;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;


public class MyStepdefs extends Utils {
    CoverCheckPage coverCheckPage = new CoverCheckPage();

    @Given("^User is on coverCheck page$")
    public void userIsOnCoverCheckPage() {
    }

    //enter vehicle registration number
    @When("^enter vehicle registration number$")
    public void enterVehicleRegistrationNumber() {
        coverCheckPage.enterVehicleRegistrationNumber();

    }

    @And("^click on Find vehicle$")
    public void clickOnFindVehicle() {
        coverCheckPage.clickOnFindVehicle();

    }
    // verify results

    @Then("^result for register vehicles cover start and end date along with time should display$")
    public void resultForRegisterVehiclesCoverStartAndEndDateAlongWithTimeShouldDisplay() {
        Utils.assertByGetText("Result for : OV12UYY", By.xpath("//div[contains(text(),'Result for : OV12UYY')]"), "Vehicle Registration Number is not correct");
        Utils.assertByGetText("09 FEB 2022 : 16 : 26", By.xpath("//*[@id=\"page-container\"]/div[4]/div[2]/span"), "Cover Start Date is not correct");
        Utils.assertByGetText("18 FEB 2022 : 23 : 59", By.xpath("//*[@id=\"page-container\"]/div[4]/div[3]/span"), "Cover End Date is not correct");

    }
}
