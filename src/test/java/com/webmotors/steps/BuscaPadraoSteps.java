package com.webmotors.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.webmotors.core.Driver;
import com.webmotors.pages.BuscaPadraoPage;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class BuscaPadraoSteps {
	static WebDriver driver;
	static Driver driverWeb;
	BuscaPadraoPage buscaPadraoPage = new BuscaPadraoPage(driver);
	
	@Dado("que a modal esteja sendo exibida")
	public void que_a_modal_esteja_sendo_exibida() {
		driverWeb = new Driver("firefox");
        driver = driverWeb.getDriver();
        driver.get("https://www.webmotors.com.br");
	}
	
	@Quando("o campo de busca sejam preenchidos da seguinte forma")
	public void o_campo_de_busca_sejam_preenchidos_da_seguinte_forma(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.id("searchBar")).sendKeys(
				dataTable.column(1).toString()
				+ " "
				+ dataTable.column(2).toString()
				);
	}

	@Quando("for realizado o busca")
	public void for_realizado_o_busca() {
		driver.findElement(By.xpath("//a/div[2]")).click();
	}

	@Então("deve ser mostrado os modelos de carro Honda City")
	public void deve_ser_mostrado_os_modelos_de_carro_honda_city() {
		assertEquals("Honda City Novos e Usados", buscaPadraoPage.getSearchResult());
	}
}
