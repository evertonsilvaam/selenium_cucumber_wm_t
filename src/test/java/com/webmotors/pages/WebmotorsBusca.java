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
//        driver.get("https://www.webmotors.com.br/carros/estoque/honda/city?tipoveiculo=carros&marca1=HONDA&modelo1=CITY");
        waitDocumentReady(driver);
    }
    
    @Test
    public void preRequestValidarBuscaPorHondaCity(){
//    	driver.get("https://www.webmotors.com.br/carros/estoque/honda/city?tipoveiculo=carros&marca1=HONDA&modelo1=CITY");
//    	WebElement firstField = driver.findElement(By.xpath("//div[@id='WhiteBox']/div/div[2]/div/div/a"));
    	
//        firstField.sendKeys("Honda City");
//        firstField.sendKeys(Keys.TAB);
//        firstField.sendKeys(Keys.ENTER);
    	
    	
    	driver.findElement(By.id("searchBar")).sendKeys("Honda City");
    	waitDocumentReady(driver);
    	System.out.println("wait");
        driver.findElement(By.xpath("//html/body/div[1]/header/div[2]/div/div/div/a/div[2]")).click();
//        driver.findElement(By.xpath("//div[2]/div/div[1]/div[2]//a")).click();
    }
    
    @Test
    public void tc_wm_001_FiltrarPorCidadeBrasilia(){
//    	driver.get("https://www.webmotors.com.br/carros/estoque/honda/city?tipoveiculo=carros&marca1=HONDA&modelo1=CITY");
        driver.findElement(By.id("locationAutoComplete")).sendKeys("Brasilia");
        driver.findElement(By.cssSelector("css=.AutoComplete-result-name > strong")).click();
    }
    
    @Test
    public void tc_wm_002_FiltrarPorVersao(){
//    	driver.get("https://www.webmotors.com.br/carros/estoque/honda/city?tipoveiculo=carros&marca1=HONDA&modelo1=CITY");
        driver.findElement(By.cssSelector("css=.Filters__line--gray")).click();
        driver.findElement(By.xpath("linkText=1.5 DX 16V FLEX 4P AUTOMÁTICO")).click();
    }
    
    @Test
    public void tc_wm_003_FiltrarPorLoja(){
        driver.findElement(By.cssSelector("css=.Filters__container__group:nth-child(5) > .Form__InputRow:nth-child(2) > .Checkbox")).click();
    }

    @After
    public void finalizaTeste(){
//        driver.quit();
    }
}
