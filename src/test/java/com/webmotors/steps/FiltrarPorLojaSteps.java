package com.webmotors.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.webmotors.core.Driver;
import com.webmotors.pages.FiltrarPorLojaPage;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class FiltrarPorLojaSteps {
	static WebDriver driver;
	static Driver driverWeb;
	FiltrarPorLojaPage filtrarPorLojaPage = new FiltrarPorLojaPage(driver);
	
	@Quando("o vendedor selecionado é uma loja")
	public void o_vendedor_selecionado_é_selecionado_uma_loja() {
		driver.findElement(By.id("Loja")).click();
	}

	@Então("deve ser possível ver a lista de carros “Honda City” no estoque de Brasília com a versão selecionada somente inseridas por lojas.")
	public void deve_ser_possível_ver_a_lista_de_carros_honda_city_no_estoque_de_brasília_com_a_versão_selecionada_somente_inseridas_por_lojas() {
		assertEquals("loja", filtrarPorLojaPage.getLojaComponentText().toString());
	}
	
}
