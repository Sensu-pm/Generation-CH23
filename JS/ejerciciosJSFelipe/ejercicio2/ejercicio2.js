/*Solicitar con prompt una temperatura en celsius
convertir esa temperatura a Kelvin y Fahrenheit
imprimir ambos resultados por DOM
Identificar los datos de entrada por su tipo
*/ 

let temp = parseInt(prompt("Dame una temperatura en Celcius"));

if(!isNaN(temp)){
    console.log(`La temp en K es: ${temp+273.15}`);
    console.log(`La temp en F es: ${(temp * (9/5)) + 32}`);
   
}else console.log("No es un numero");
