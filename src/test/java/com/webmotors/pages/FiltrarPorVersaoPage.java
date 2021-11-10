package com.webmotors.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.webmotors.maps.FiltrarPorVersaoMaps;

public class FiltrarPorVersaoPage {
	private WebDriver driver;
	FiltrarPorVersaoMaps filtrarPorVersaoMaps;
	
	public FiltrarPorVersaoPage(WebDriver driver) {
		this.driver = driver;
		filtrarPorVersaoMaps = new FiltrarPorVersaoMaps();
		PageFactory.initElements(driver, filtrarPorVersaoMaps);
	}
	
	public String getSearchResultTitle() {
		return filtrarPorVersaoMaps.searchResultTitle.getText().toString();
	}
}
