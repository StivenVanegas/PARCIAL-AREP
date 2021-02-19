## PARCIAL 1 AREP


### VISIÓN GENERAL
Construir un servicio WEB (puede usar Spark o Sockets) que reciba un número y una cadena de tres caracteres. La cadena puede ser una de tres opciones: "cos", "sin", "tan". El servicio asume que el número que recibe está en radianes y retorna una estructura JSON con el valor de la función trigonométrica correspondiente.

### APP WEB
Aqui puede acceder a la aplicacion web para este proyecto.

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://safe-dawn-84917.herokuapp.com/calculator?value=90&op=sin)


### EXAMPLES

https://safe-dawn-84917.herokuapp.com/calculator?value=90&op=sin

https://safe-dawn-84917.herokuapp.com/calculator?value=90&op=cos

https://safe-dawn-84917.herokuapp.com/calculator?value=90&op=tan

### REQUISITOS
* Java
* Maven
* Git
* Heroku

### JAVADOC

Para generar la documentacion java del proyecto ejecute las siguientes instrucciones.

`mvn javadoc:javadoc`

`mvn site`

`mvn site:run`

Y a continuación ir a la siguiente direccion web

`http://localhost:8080/apidocs/index.html`

### AUTOR
* Janer Stiven Vanegas Trujillo
