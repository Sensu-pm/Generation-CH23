/*

Que encontramos en el arbol del DOM?

 - Node: Es la unidad mas basica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta o un comentario, etc. 

    <title> NODO
        Manipualacion DOM //Es un nodo, pero es hijo del title
    </title>


 - Document: Tambien es un nodo, del tipo documento, es el nodo raiz a partir del cual se desarrollan o generan todos los demas nodos.

 - Element: son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

 - Attributes: Nodos que dan informacion asociada al tipo de elemento

 - Comentario: Comentarios y otros elementos que estan dentro del HTML, son considerados nodos.


*/

/* Como leer nodos de mi Document Object Model (DOM)

Metodos tradicionales (que se usan en versiones antiguas de javascript)

    - document.getElementById (botonSuma)
    - document.getElementByTagName (<button>)
    - document.getElementByClassName (botones)


*/
/*
var elementoID= document.getElementById("botonSuma");
console.log(elementoID);

var elementoEtiqueta= document.getElementsByTagName("button");
console.log(elementoEtiqueta);
console.log("Estes es el primer elemento de mi coleccion de botones: ", elementoEtiqueta[0]);

var elementoClassName= document.getElementsByClassName("botones");
console.log(elementoClassName);

/*

Metodos recientes

    - document.querySelector(#botones)
    - document.querySelectorAll(.botones)


*/
/*

var unElemento= document.querySelector("#input1");
console.log(unElemento);

var variosElementos= document.querySelectorAll(".botones");
console.log(variosElementos);
*/



/** 
 Creacion de Nodos

    - document.creatElement(tipoNodo)
 */

//Creacion de una etiqueta del tipo imagen

var imagenPerrito = document.createElement("img");

// Creamos atributos a la etiqueta
imagenPerrito.src ="https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg"
imagenPerrito.alt ="Foto del perrito"
imagenPerrito.style.width = "150px";
imagenPerrito.style.borderRadius = "50px";

var textoPerrito = document.createElement("P");
textoPerrito = "Este es mi perrito";

//Poner elementos o nodos en el html
document.body.append(imagenPerrito);

//********Buscar parentElementBefore,   appendChild*********** *
//Actualizar Nodos
//1er paso: Identificar el nodo que cambiare(outer)
//2do paso: Modificar el nodo (inner)

var resultadoQueCambia= document.getElementById("resultado");
resultadoQueCambia.innerHTML = "All we need is LOVE";

//Construir calculadora

var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");

var resultado = document.getElementById("resultado");

//Construir las funciones de la calculadora
function suma(){
    let valor1 = parseInt(input1.value);  //<input>
    let valor2 = parseInt(input2.value);  //8
    let suma = valor1 + valor2 ; //calculo la suma
    resultado.innerHTML = suma;  //pongo el resultado en su lugar
}
function resta(){
    let valor1 = parseInt(input1.value);  //<input>
    let valor2 = parseInt(input2.value);  //8
    let resta = valor1 - valor2 ; //calculo la suma
    resultado.innerHTML = resta;  //pongo el resultado en su lugar

}
function multiplicacion(){
    let valor1 = parseInt(input1.value);  //<input>
    let valor2 = parseInt(input2.value);  //8
    let multiplicacion = valor1 * valor2 ; //calculo la suma
    resultado.innerHTML = multiplicacion;  //pongo el resultado en su lugar

}
function division(){
    let valor1 = parseInt(input1.value);  //<input>
    let valor2 = parseInt(input2.value);  //8
    let division = valor1 / valor2 ; //calculo la suma
    resultado.innerHTML = division;  //pongo el resultado en su lugar

}

/*Como se crea un evento (addEventlistener)
        - node.addEventListener ("evento a escuchar", lo que quiero que haga cuando se escuche)

*/
botonSuma.addEventListener("click", suma);
botonResta.addEventListener("click", resta);
botonMultiplicacion.addEventListener("click", multiplicacion);
botonDivision.addEventListener("click", division);


/*

Manipulacion del DOM


    - Metodos para acceder a elementos 

        - document.getElementById
        - document.getElementsByTagName
        - document.getElementosByClassName


    - Metodos para crear elementos  

        - document.createElement(etiqueta)
        - document.createTextNode(texto) - Investigar


    - Metodos para insertar elementos

        - parentElement.append
        - parentElement.insertBefore
        - parentElement.insertAdjacentElement


    - Metodos para modificar elementos

        - node.outerHTML (leer o referenciar el elemento)
        - node.innerHTML (modificar el elemento)


*/

const textoAModificar = document.querySelector("#h1")

function cambiarColor(color){
textoAModificar.style.color =color;
}