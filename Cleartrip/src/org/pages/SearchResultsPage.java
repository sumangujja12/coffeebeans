package org.pages;

import java.util.NoSuchElementException;

public class SearchResultsPage {
	WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean resultsAppearForInboundJourney() {
        waitForSearchResultsToAppear();
        return isElementPresent(By.id("return"));
    }

    public boolean resultsAppearForOutboundJourney() {
        waitForSearchResultsToAppear();
        return isElementPresent(By.id("outbound"));
    }


    private void waitForSearchResultsToAppear() {
        //Conditional wait for one of the elements on the search results page to be present
        new WaitFor(driver).presenceOfTheElement(By.id("mod_link"));
    }


    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}

