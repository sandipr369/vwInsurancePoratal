package vwfsInsurancePortal;

import org.openqa.selenium.By;

public class CoverCheckPage extends Utils {
    private By _enterVehicleRegistration = By.id("vehicleReg");
    private By _findVehicle = By.xpath("//span[contains(text(),'Find vehicle')]");
    private By _resultFor = By.className("result");


    //enter Vehicle registration number
    public void enterVehicleRegistrationNumber(){
        enterText(_enterVehicleRegistration,"OV12UYY");
    }
    //click on find vehicle
public void clickOnFindVehicle(){
        clickOnElement(_findVehicle);
}



}
