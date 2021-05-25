package com.travelocity.Testing.TestAutomation.validationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.travelocity.Testing.TestAutomation.pages.BasePage;

public class BusquedaValidate extends BasePage {

	@FindBy(xpath = "//li/div/div/div/button")
	private WebElement listaVuelos;
	@FindBy(xpath = "//li[2]/div/div[2]/a")
	private WebElement listaHospedajes;
	@FindBy(xpath = "//div[2]/div/div/div[2]/div/h3")
	private WebElement listaAutos;
	@FindBy(xpath = "//li[2]/div/div[2]/a")
	private WebElement listaPaquetes;
	@FindBy(xpath = "//section/div/a")
	private WebElement listaActividades;
	
	public BusquedaValidate(WebDriver driver) {
		super(driver);
	}

	public String validateLogin() {
		return exists(listaVuelos);
	}
	
	public String validarListaBusqueda() {
		return exists(listaVuelos);
	}
	
	public String validarListaHospedajes() {
		return exists(listaHospedajes);
	}
	
	public String validarListaAutos() {
		return exists(listaAutos);
	}
	
	public String validarListaPaquetes() {
		return exists(listaPaquetes);
	}
	
	public String validarListaActividades() {
		return exists(listaActividades);
	}
	
	

}
