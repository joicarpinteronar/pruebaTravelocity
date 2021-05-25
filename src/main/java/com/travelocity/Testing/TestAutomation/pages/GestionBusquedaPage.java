package com.travelocity.Testing.TestAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.StaticWait;

public class GestionBusquedaPage extends BasePage {
	
	@FindBy(xpath = "//ul[@id='uitk-tabs-button-container']/li[2]/a/span")
	private WebElement cardVuelos;
	@FindBy(xpath = "//a[contains(@href, '?flightType=oneway')]")
	private WebElement btnViajeSencillo;
	@FindBy(xpath = "(//button[@type='button'])[11]")
	private WebElement btnOrigen;
	@FindBy(id = "location-field-leg1-origin")
	private WebElement txtOrigen;
	@FindBy(xpath = "//div[@id='location-field-leg1-origin-menu']/div[2]/ul/li/button/div/div[2]")
	private WebElement selCiudadOrigen;
	
	@FindBy(css = "#location-field-leg1-destination-menu .uitk-faux-input")
	private WebElement btnDestino;
	@FindBy(id = "location-field-leg1-destination")
	private WebElement txtDestino;
	@FindBy(xpath = "//div[@id='location-field-leg1-destination-menu']/div[2]/ul/li/button/div/div/span/strong")
	private WebElement selCiudadDestino;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnBuscar;
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement btnDestinoHospedaje;
	@FindBy(id = "location-field-destination")
	private WebElement txtDestinoHospedaje;
	@FindBy(xpath = "//div[@id='location-field-destination-menu']/div[2]/ul/li/button/div/div/span/strong")
	private WebElement selDestinoHospedaje;
	@FindBy(id = "d1-btn")
	private WebElement btnFechas;
	@FindBy(xpath = "(//button[@type='button'])[35]")
	private WebElement selFechaIda;
	@FindBy(xpath = "(//button[@type='button'])[39]")
	private WebElement selFechaRegreso;
	@FindBy(xpath = "//div[3]/button/span")
	private WebElement btnListo;
	
	@FindBy(xpath = "//a[contains(@href, '?pwaLob=wizard-car-pwa')]")
	private WebElement cardAuto;
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement btnEntrega;
	@FindBy(id = "location-field-locn")
	private WebElement txtEntrega;
	@FindBy(xpath = "//div[@id='location-field-locn-menu']/div[2]/ul/li/button/div/div[2]")
	private WebElement selEntrega;
	@FindBy(xpath = "(//button[@type='button'])[16]")
	private WebElement btnDevolucion;
	@FindBy(id = "location-field-loc2")
	private WebElement txtDevolucion;
	@FindBy(xpath = "//div[@id='location-field-loc2-menu']/div[2]/ul/li/button/div/div/span/strong")
	private WebElement selDevolucion;
	
	@FindBy(xpath = "//ul[@id='uitk-tabs-button-container']/li[4]/a/span")
	private WebElement cardPaquete;
	@FindBy(xpath = "(//button[@type='button'])[12]")
	private WebElement btnPaqueteOrigen;
	@FindBy(id = "location-field-origin")
	private WebElement txtPaqueteOrigen;
	@FindBy(xpath = "//div[@id='location-field-origin-menu']/div[2]/ul/li/button/div/div/span/strong")
	private WebElement selPaqueteOrigen;
	@FindBy(xpath = "(//button[@type='button'])[21]")
	private WebElement btnPaqueteDestino;
	@FindBy(id = "location-field-destination")
	private WebElement txtPaqueteDestino;
	@FindBy(xpath = "//div[@id='location-field-destination-menu']/div[2]/ul/li/button/div/div[2]")
	private WebElement selPaqueteDestino;
	
	@FindBy(xpath = "//ul[@id='uitk-tabs-button-container']/li[5]/a/span")
	private WebElement cardActividades;
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement btnActividadesEn;
	@FindBy(id = "location-field-location")
	private WebElement txtActividadesEn;
	@FindBy(xpath = "//div[@id='location-field-location-menu']/div[2]/ul/li/button/div/div[2]")
	private WebElement selActividadesEn;

	public GestionBusquedaPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void buscarVueloSencillo(String origen, String destino) {
		waitVisibility(cardVuelos);
		click(cardVuelos);
		waitVisibility(btnViajeSencillo);
		click(btnViajeSencillo);
		waitVisibility(btnOrigen);
		click(btnOrigen);
		StaticWait.WaitForSeconds(2);
		waitVisibility(txtOrigen);
		writeText(txtOrigen, origen);
		waitVisibility(selCiudadOrigen);
		click(selCiudadOrigen);
		
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnDestino);
		click(btnDestino);
		waitVisibility(txtDestino);
		writeText(txtDestino, destino);
		waitVisibility(selCiudadDestino);
		click(selCiudadDestino);
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnBuscar);
		click(btnBuscar);
		StaticWait.WaitForSeconds(4);		
	}
	
	public void buscarDestinoHospedaje(String destinoHospedaje) {
		waitVisibility(btnDestinoHospedaje);
		click(btnDestinoHospedaje);		
		waitVisibility(txtDestinoHospedaje);
		writeText(txtDestinoHospedaje, destinoHospedaje);
		waitVisibility(selDestinoHospedaje);
		click(selDestinoHospedaje);		
		StaticWait.WaitForSeconds(2);		
		waitVisibility(btnFechas);
		click(btnFechas);		
		waitVisibility(selFechaIda);
		click(selFechaIda);		
		waitVisibility(selFechaRegreso);
		click(selFechaRegreso);
		waitVisibility(btnListo);
		click(btnListo);
		
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnBuscar);
		click(btnBuscar);
		StaticWait.WaitForSeconds(4);		
	}
	
	public void buscarAutos(String entrega, String devolucion) {
		waitVisibility(cardAuto);
		click(cardAuto);
		waitVisibility(btnEntrega);
		click(btnEntrega);		
		StaticWait.WaitForSeconds(2);
		waitVisibility(txtEntrega);
		writeText(txtEntrega, entrega);
		waitVisibility(selEntrega);
		click(selEntrega);
		
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnDevolucion);
		click(btnDevolucion);
		waitVisibility(txtDevolucion);
		writeText(txtDevolucion, devolucion);
		waitVisibility(selDevolucion);
		click(selDevolucion);
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnBuscar);
		click(btnBuscar);
		StaticWait.WaitForSeconds(4);		
	}
	
	public void buscarPaquetes(String origen, String destino) {
		waitVisibility(cardPaquete);
		click(cardPaquete);
		waitVisibility(btnPaqueteOrigen);
		click(btnPaqueteOrigen);		
		StaticWait.WaitForSeconds(2);
		waitVisibility(txtPaqueteOrigen);
		writeText(txtPaqueteOrigen, origen);
		waitVisibility(selPaqueteOrigen);
		click(selPaqueteOrigen);
		
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnPaqueteDestino);
		click(btnPaqueteDestino);
		waitVisibility(txtPaqueteDestino);
		writeText(txtPaqueteDestino, destino);
		waitVisibility(selPaqueteDestino);
		click(selPaqueteDestino);
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnBuscar);
		click(btnBuscar);
		StaticWait.WaitForSeconds(4);		
	}
	
	public void buscarActividades(String actividadeEn) {
		waitVisibility(cardActividades);
		click(cardActividades);
		waitVisibility(btnActividadesEn);
		click(btnActividadesEn);
		waitVisibility(txtActividadesEn);
		writeText(txtActividadesEn, actividadeEn);
		waitVisibility(selActividadesEn);
		click(selActividadesEn);		
		StaticWait.WaitForSeconds(2);		
		waitVisibility(btnFechas);
		click(btnFechas);		
		waitVisibility(selFechaIda);
		click(selFechaIda);		
		waitVisibility(selFechaRegreso);
		click(selFechaRegreso);
		waitVisibility(btnListo);
		click(btnListo);
		
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnBuscar);
		click(btnBuscar);
		StaticWait.WaitForSeconds(4);		
	}

}
