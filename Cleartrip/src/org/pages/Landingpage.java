package org.pages;

import org.openqa.selenium.WebDriver;

public class Landingpage {
	WebDriver driver;

    public void LandingPage(WebDriver driver){
        this.driver = driver;
    }



    public FlightsSearchPage goToFlightsSearchPage() {
        driver.findElement(By.linkText("Flights")).click();
        return new FlightsSearchPage(driver);
    }
}


