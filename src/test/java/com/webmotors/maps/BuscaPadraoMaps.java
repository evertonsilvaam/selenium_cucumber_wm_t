package com.webmotors.maps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuscaPadraoMaps {
	@FindBy (xpath = "//div[1]/div[3]/h1")
	public WebElement searchResult;
}