package com.webmotors.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.webmotors.maps.FiltrarPorLojaMaps;

public class FiltrarPorLojaPage {
	private WebDriver driver;
	FiltrarPorLojaMaps filtrarPorLojaMaps;
	
	public FiltrarPorLojaPage(WebDriver driver) {
		this.driver = driver;
		filtrarPorLojaMaps = new FiltrarPorLojaMaps();
		PageFactory.initElements(driver, filtrarPorLojaMaps);
	}
	
	public String getLojaComponentText() {
		return filtrarPorLojaMaps.lojaComponent.getText();
	}
}
