var gradosCelsius = prompt("Ingresa tu temperatura en °C");

var gradosFahrenheit = gradosCelsius * 1.8 + 32;
var gradosKelvin = (gradosCelsius) + 273.15;

document.write("grados Fahrenheit"+ gradosFahrenheit);
document.write("grados Kelvin"+ gradosKelvin);