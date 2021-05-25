package com.travelocity.Testing.TestAutomation.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.travelocity.Testing.TestAutomation.pages.GestionBusquedaPage;
import com.travelocity.Testing.TestAutomation.pages.Home;

import com.travelocity.Testing.TestAutomation.validationPage.BusquedaValidate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import utils.PageGenerator;

public class VuelosStepDefinitions {

	protected WebDriver driver = Hook.getDriver();

	@Given("^Que un usuario ingresa a la pagina de Travelocity$")
	public void thatIOpenedBrowserAtAutomationpracticePage() throws Throwable {

		PageGenerator.getInstance(Home.class, driver).goToThePage();
	}
		
	@When("^Selecciona la opcion Vuelos y Viaje Sencillo e ingresa el origen'(.*)' y el destino'(.*)'$")
	public void ienterCredential(String origen, String destino) throws Throwable {
		
		PageGenerator.getInstance(GestionBusquedaPage.class, driver).buscarVueloSencillo(origen, destino);	
	}
	@When("^Selecciona la opcion Hospedaje e ingresa la ciudad destino'(.*)' y las fechas de ida y regreso$")
	public void buscarCiudadHospedaje(String ciudad) throws Throwable {
		
		PageGenerator.getInstance(GestionBusquedaPage.class, driver).buscarDestinoHospedaje(ciudad);	
	}
	@When("^Selecciona la opcion Autos e ingresa la ciudad entrega'(.*)' y devolucion'(.*)'$")
	public void buscarAuto(String entrega, String devolucion) throws Throwable {
		
		PageGenerator.getInstance(GestionBusquedaPage.class, driver).buscarAutos(entrega, devolucion);	
	}
	@When("^Selecciona la opcion Paquetes e ingresa el origen'(.*)' y el destino'(.*)' del paquete$")
	public void buscarPaquete(String origen, String destino) throws Throwable {
		
		PageGenerator.getInstance(GestionBusquedaPage.class, driver).buscarPaquetes(origen, destino);	
	}	
	@When("^Selecciona la opcion Actividades e ingresa el lugar de la actividad'(.*)' y selecciona las fechas indicadas$")
	public void buscarActividad(String actividadEn) throws Throwable {
		
		PageGenerator.getInstance(GestionBusquedaPage.class, driver).buscarActividades(actividadEn);	
	}	
	
	@Then("^Se valida que la lista de vuelos no sea nula '(.*)'$")
	public void validatePurchaseSuccessfully(String result) throws Throwable {
		assertEquals(result, PageGenerator.getInstance(BusquedaValidate.class, driver).validarListaBusqueda());
	    
	}
	
	@Then("^Se valida que la lista de Hoteles no sea nula '(.*)'$")
	public void validarListaHoteles(String result) throws Throwable {
		assertEquals(result, PageGenerator.getInstance(BusquedaValidate.class, driver).validarListaHospedajes());
	    
	}
	
	@Then("^Se valida que la lista de Autos no sea nula '(.*)'$")
	public void validarListaAutos(String result) throws Throwable {
		assertEquals(result, PageGenerator.getInstance(BusquedaValidate.class, driver).validarListaAutos());
	    
	}
	
	@Then("^Se valida que la lista de Paquetes no sea nula '(.*)'$")
	public void validarListaPaquetes(String result) throws Throwable {
		assertEquals(result, PageGenerator.getInstance(BusquedaValidate.class, driver).validarListaPaquetes());
	    
	}
	
	@Then("^Se valida que la lista de Actividades no sea nula '(.*)'$")
	public void validarListaActividades(String result) throws Throwable {
		assertEquals(result, PageGenerator.getInstance(BusquedaValidate.class, driver).validarListaActividades());
	    
	}
}