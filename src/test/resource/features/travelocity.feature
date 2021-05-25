#Author: Ivan Carpintero
Feature: Gestionar busquedas de vuelos, Hospedaje en la pagina de Travelocity

  Scenario: Buscar vuelos sencillos en la seccion de Vuelos
    Given Que un usuario ingresa a la pagina de Travelocity
    When  Selecciona la opcion Vuelos y Viaje Sencillo e ingresa el origen'Bogota' y el destino'Medellin'
    Then Se valida que la lista de vuelos no sea nula 'null'
  
  Scenario: Buscar Hospedaje para una fecha definida y mostrar la lista de hoteles
    Given Que un usuario ingresa a la pagina de Travelocity
    When  Selecciona la opcion Hospedaje e ingresa la ciudad destino'Medellin' y las fechas de ida y regreso
    Then Se valida que la lista de Hoteles no sea nula 'null'
  
  Scenario: Buscar Autos indicando la ciudad de entrega y devolucion
    Given Que un usuario ingresa a la pagina de Travelocity
    When  Selecciona la opcion Autos e ingresa la ciudad entrega'Medellin' y devolucion'Medellin'
    Then Se valida que la lista de Autos no sea nula 'null'
   
  Scenario: Buscar Paquetes indicando el origen y el destino del paquete
    Given Que un usuario ingresa a la pagina de Travelocity
    When  Selecciona la opcion Paquetes e ingresa el origen'Medellin' y el destino'Bogota' del paquete
    Then Se valida que la lista de Paquetes no sea nula 'null' 
  
   Scenario: Buscar Actividades para una fecha definida y mostrar la lista de activdades
    Given Que un usuario ingresa a la pagina de Travelocity
    When  Selecciona la opcion Actividades e ingresa el lugar de la actividad'Medellin' y selecciona las fechas indicadas
    Then Se valida que la lista de Actividades no sea nula 'null' 