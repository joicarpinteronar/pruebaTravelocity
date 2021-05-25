# Prueba Travelocity

La prueba se desarrollo usando framework de Automatizacion de Pruebas Serenity

El patron implementado es el patron POM con SerenityBDD

Para la ejecucion de proyecto se realiza lo siguiente:

1) Clonar el proyecto desde el repositorio
URL: https://github.com/joicarpinteronar/pruebaTravelocity.git 

2) Abrir el proyecto con un IDE, puede ser eclipse y dirigirse a la siguiente ruta:
src\test\java\com\travelocity\Testing\TestAutomation\runner\TravelocityRunner.java
desde esa clase con la herraienta de JUnit se puede ejecutar el robot de Automatizacion, donde se va a ejecutar toda la suite de pruebas

3) Tambien se puede ejecutar desde la raiz abriendo la consola y ejecutando el comando mvn test

Los Casos de Pruebas Automatizados son los siguientes:
en total 5 casos para la aplicacion web de Travelocity

1) Buscar vuelos sencillos en la seccion de Vuelos
2) Buscar Hospedaje para una fecha definida y mostrar la lista de hoteles
3) Buscar Autos indicando la ciudad de entrega y devolucion
4) Buscar Paquetes indicando el origen y el destino del paquete
5) Buscar Actividades para una fecha definida y mostrar la lista de activdades

Todos automatizados y codificados en lenguaje Gherkin

Los otros 15 casos funcionales son los siguientes:

6) Validar que la busqueda de Hospedajes pueda agregar mas personas.
7) Validar en la seccion de Hospedaje los check de agregar un vuelo.
8) Validar en la lista de Hospedajes pueda seleccionar el hotel de mi preferencia y se redirigido al portal de las especificaciones del Hotel.
9) Validar que un usuario pueda seleccionar la opcion de vuelo redondo indicando el origen y el destino.
10) Validar la opcion de seleccionar vuelos a diferentes destinos.
11) Validar en la opcion de vuelo redondo me permita agregar un auto.
12) Validar que en la renta de autos pueda seleccionar la fecha y hora de entrega del vehiculo.
13) Validar la opcion de alquiler de autos me permita el traslado al aereopuerto.
14) Validar la opcion de check de reservar ida y vuelta.
15) Validar la lista de paquetes y filtrarlos por orden de precio.
16) Validar los filtros por zona y atracciones.
17) Validar los detalles especificos del paquete.
18) Validar la persintencia de las actividades ya registradas.
19) Validar que el campo de Actividades cuando este vacio no permita continuar con la busqueda
20) Validar las lista de actividades con sus respectivos detalle y precios.

