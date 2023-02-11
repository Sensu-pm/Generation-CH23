/*division(14, 5)

//Función Anónima

let funcionAnonima = function(){
    let valor1 = 5;
    let valor2 = 7;
    let suma = valor1 + valor2;
    console.log("Esta función anónima: ", suma);
}


//Hoisting
console.log(edad)
let edad= "30";


/*Cuando no hemos declarado en la funcion anonima detecta error
Son convenientes cuando la usaras dos o tres veces. Si tendra un uso constante es mejor tenerla separada de la variable.*/

/*Ejemplo de funciones que despues desarrollariamos
agregarCarritoCompra();
borrarCarrito();
agregarProduco();
Pagar();
*/

//Funciones

function suma(a,b){
    let sum1 = a + b
    console.log(sum1);
}


/*
Por que son importantes las funciones?
    - Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
    - Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
    - Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
    - Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)

*/
/*Cosas importantes a tener en cuenta para crear funciones
-Nombre descriptivo que evoque al funcionamiento de ese bloque de codigo.
-Datos de entrada(parámetros).
-Procesos o instrucciones a ejecutar.
-Salida(return).

*/

//Función directa
/*
function agregarCarritoCompra(){
    //Lo que hace mi función
}

//Invocar funcion
agregarCarritoCompra();



funcionAnonima();

//Funcion
/*
function division (parametro1 , parametro2){
    let resultado = parametro1 / parametro2;
    console.log(resultado);
}


division(88, 10);


/*
Tipos de Funciones:
    -Funciones directas  - nombre (comunes).
    -Funciones anonimas  - viven pegadas a una variable o constante.
    -Funciones como metódos (para especificar que hace mi objeto).
    -Funciones como constructores(para construir o crear un objeto).
*/ 

//REFACTORIZAR para ver mas tarde



//Funciones Flecha
/*Funciones Flecha
Una expresión de función flecha es una alternativa compacta a una expresión de función tradicional, pero es limitada y no se puede utilizar en todas las situaciones.

Diferencias y limitaciones:

No tiene sus propios enlaces a this o super y no se debe usar como métodos.
No tiene argumentos o palabras clave new.target.
No apta para los métodos call, apply y bind, que generalmente se basan en establecer un ámbito o alcance
No se puede utilizar como constructor.
No se puede utilizar yield dentro de su cuerpo.*/


//Funcion directa o normal
/*
function suma(a,b){
    let sum1 = a + b
    console.log(sum1);
}
//Funcion Flecha
/*
const suma = (a , b) => a + b;

/*Funcion flecha con mas lineas de codigo
const sumarYMultiplicar = (a , b) => {
    const sum= a + b;
    const result = sum * 2;
    console.log(result);
}
/*

Return

La sentencia return finaliza la ejecucion de la funcion, y especifica un valor para ser devuelto a quien llama a la funcion. O lo que es lo mismo, usamos return para finalizar y tambien para poder asignar el resultado a una variable.
*/

/*La sentencia return finaliza la ejecucion de la funcion, y especifica un valor */

function areaCuadrado(){
    let lado = 5;
    let area = lado * lado;
    console.log("El area de mi cuadrado es : " , area); //25
    return area;

}

areaCuadrado();

let resultadoDeMiFuncion = areaCuadrado();

console.log("El resultado de mi funcion cuadrado es>", resultadoDeMiFuncion);

