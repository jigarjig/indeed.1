package com.indeed.uk.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.indeed.uk.utility.Utility;

public class MainHomePage extends Utility {
    private static final Logger log = LogManager.getLogger(MainHomePage.class.getName());
    public MainHomePage() { PageFactory.initElements(driver, this);}

        @CacheLookup
        @FindBy(id = "onetrust-reject-all-handler")
        WebElement reject;
    public void clickOnReject(){
        clickOnElement(reject);
    }

    }
