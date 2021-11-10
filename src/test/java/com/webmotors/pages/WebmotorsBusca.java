package com.webmotors.pages;

import com.webmotors.core.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


public class WebmotorsBusca {
    static WebDriver driver;
    static Driver driverWeb;
    
    public static void waitDocumentReady(WebDriver driver) {
        new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }

    @BeforeClass
    public static void inicializaTeste(){
        driverWeb = new Driver("firefox");
        driver = driverWeb.getDriver();
        driver.get("https://www.webmotors.com.br");
        waitDocumentReady(driver);
    }
    
    @After
    public void finalizaTeste(){
        driver.quit();
    }
}
