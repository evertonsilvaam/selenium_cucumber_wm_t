package com.webmotors.steps;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.webmotors.core.Driver;
import com.webmotors.pages.FiltrarPorVersaoPage;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class FiltrarPorVersaoSteps {
	static WebDriver driver;
	static Driver driverWeb;
	FiltrarPorVersaoPage filtrarPorVersaoPage = new FiltrarPorVersaoPage(driver);
	
	@Quando("é selecionado uma <versao>")
	public void é_selecionado_uma_versao(io.cucumber.datatable.DataTable dataTable) {
	    driver.findElement(By.xpath("//form/div[5]/div[2]/div[2]/div[3]")).click();
	    driver.findElement(By.xpath("//div[4]/a[1]")).click();
	}

	@Então("deve ser possível ver a lista de carros “Honda City” no estoque de Brasília com a versão selecionada.")
	public void deve_ser_possível_ver_a_lista_de_carros_honda_city_no_estoque_de_brasília_com_a_versão_selecionada() {
		assertEquals("Honda City 1.5 Dx 16v Flex 4p Automático em Brasília/DF - Novos e Usados", filtrarPorVersaoPage.getSearchResultTitle());
	}

}
