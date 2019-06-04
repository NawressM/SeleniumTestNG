package tuto.eclipse.jal.selenium.pageObjects.avaiPage;

import org.openqa.selenium.By;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class AvaiPageActions {

	public void clickContinueButton() {
		
	MyDriver.driver.findElement(By.id(AvaiPageIDs.CONTIUNE_BUTTON_ID)).click();
	}
	}

