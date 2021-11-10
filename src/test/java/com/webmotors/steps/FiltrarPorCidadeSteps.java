package com.webmotors.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.webmotors.core.Driver;
import com.webmotors.pages.FiltrarPorCidadePage;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class FiltrarPorCidadeSteps {
	
	//verificar retorno de driver, e utilizar o driver anterior
	static WebDriver driver;
	static Driver driverWeb;
	FiltrarPorCidadePage filtrarPorCidadePage = new FiltrarPorCidadePage(driver);

	@Dado("que o resultado da busca está sendo exibida")
	public void que_o_resultado_da_busca_está_sendo_exibida() {
		driverWeb = new Driver("firefox");
        driver = driverWeb.getDriver();
        driver.get("https://www.webmotors.com.br");
	}

	@Quando("é inserido o valor Brasília no campo Localização")
	public void é_inserido_o_valor_brasília_no_campo_localização() {
		driver.findElement(By.id("locationAutoComplete")).sendKeys("Brasilia");
		driver.findElement(By.xpath("//form/div[1]/div[2]/div[1]/div")).click();
	}

	@Então("deve ser possível ver a lista de carros “Honda City” no estoque de Brasília.")
	public void deve_ser_possível_ver_a_lista_de_carros_honda_city_no_estoque_de_brasília() {
		assertEquals("Honda City em Brasília/DF - Novos e Usados", filtrarPorCidadePage.getSearchResultTitle());
	}
	
}
