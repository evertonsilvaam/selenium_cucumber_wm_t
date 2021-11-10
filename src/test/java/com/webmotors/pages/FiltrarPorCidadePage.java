package com.webmotors.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.webmotors.maps.FiltrarPorCidadeMaps;

public class FiltrarPorCidadePage {
	private WebDriver driver;
	FiltrarPorCidadeMaps filtrarPorCidadeMaps;
	
	public FiltrarPorCidadePage(WebDriver driver) {
		this.driver = driver;
		filtrarPorCidadeMaps = new FiltrarPorCidadeMaps();
		PageFactory.initElements(driver, filtrarPorCidadeMaps);
	}
	
	public String getSearchResultTitle() {
		return filtrarPorCidadeMaps.searchResultTitle.getText().toString();
	}
}
