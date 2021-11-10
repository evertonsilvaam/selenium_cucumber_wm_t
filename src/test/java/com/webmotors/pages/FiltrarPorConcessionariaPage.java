package com.webmotors.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.webmotors.maps.FiltrarPorConcessionariaMaps;

public class FiltrarPorConcessionariaPage {
	private WebDriver driver;
	FiltrarPorConcessionariaMaps filtrarPorConcessionariaMaps;
	
	public FiltrarPorConcessionariaPage(WebDriver driver) {
		this.driver = driver;
		filtrarPorConcessionariaMaps = new FiltrarPorConcessionariaMaps();
		PageFactory.initElements(driver, filtrarPorConcessionariaMaps);
	}
	
	public String getConcessionariaText() {
		return filtrarPorConcessionariaMaps.concessionariaComponent.getText().toString();
	}
	
}
