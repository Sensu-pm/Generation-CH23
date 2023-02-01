let miVariable = 34;


 
let miArreglo02 = [31,32,33,34];
console.log("dato de miArreglo en el indice 0 - " + miArreglo02[0]);
console.log("dato de miArreglo en el indice 1 - " + miArreglo02[1]);
console.log("dato de miArreglo en el indice 2 - " + miArreglo02[2]);
console.log("dato de miArreglo en el indice 3 - " + miArreglo02[3]);
console.log("el numero de elementos del arreglo es: " + miArreglo02.length);


let miArreglo03 = ["Hola" , "que" , "tal"];
console.log(miArreglo03[0]);
console.log(miArreglo03[1]);
console.log(miArreglo03[2]);
console.log("el numero de elementos del arreglo es: " + miArreglo03.length);

let miArreglo04 = [{nombre: "Sensual"},{apellido: "Dominguez"},{edad: 25}];
console.log("elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[0].nombre);
console.log("elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[1].apellido);
console.log("elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[2].edad);

console.log("el numero de elementos del arreglo es: " + miArreglo04.length);

let nuevoArreglo00 = [3,6,1,4];
console.log("Orden de mi arreglo nuevo con Sort: "+ nuevoArreglo00.sort());
console.log("metodo pop: "+ nuevoArreglo00.pop());
console.log("metodo push: "+ nuevoArreglo00.push(10));
console.log("Orden de mi arreglo nuevo metodo reverse: "+ nuevoArreglo00.reverse());

let otroArreglo = ["que ","Hola ","tal ","como "];
console.log("Orden de mi arreglo nuevo con Sort: "+ otroArreglo.sort());
console.log("metodo pop: "+ otroArreglo.pop());
console.log("metodo push: "+ otroArreglo.push("estas"));
console.log("Orden de mi arreglo nuevo con reverse: "+ otroArreglo.sort());

console.log("javascript"[2]); //llama el caracter en esa posicion, este caso 0,1,2 es v
console.log("javascript".length); // cuantos caracteres tiene

let matriz = [[1,2,3],
              [4,5,6],
              [7,8,9]
            ];
console.log("tamaño "+ matriz.length);
console.log(matriz.[1][1]);