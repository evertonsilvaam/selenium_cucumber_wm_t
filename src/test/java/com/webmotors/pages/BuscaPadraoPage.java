package com.webmotors.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.webmotors.maps.BuscaPadraoMaps;

public class BuscaPadraoPage {
	private WebDriver driver;
	BuscaPadraoMaps buscaPadraoMaps;
	
	public BuscaPadraoPage(WebDriver driver) {
		this.driver = driver;
		buscaPadraoMaps = new BuscaPadraoMaps();
		PageFactory.initElements(driver, buscaPadraoMaps);
	}
	
	public String getSearchResult() {
		return buscaPadraoMaps.searchResult.getText().toString();
	}

}
