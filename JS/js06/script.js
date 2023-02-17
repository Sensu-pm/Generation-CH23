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
resultadoQueCambia.innerHTML = "Saludos, cambio el resultado Juas Juas";



var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");

var resultado = document.getElementById("resultado");
