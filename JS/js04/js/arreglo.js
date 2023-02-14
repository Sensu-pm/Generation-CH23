let lista = [12,5,80,34,7];
//console.log(lista.length);
lista.sort(
    function(valor1,vlaor2){
        return valor1 > vlaor2;
    }
);
console.log(lista);

lista.sort();
console.log(lista);
/**El método sort() ordena los elementos de un arreglo (array) localmente y devuelve el arreglo ordenado. La ordenación no es necesariamente estable. El modo de ordenación por defecto responde a la posición del valor del string de acuerdo a su valor Unicode. */

lista.reverse();
console.log(lista);
/**El método reverse() invierte el orden de los elementos de un array in place. El primer elemento pasa a ser el último y el último pasa a ser el primero. */


let remover= lista.splice(1,2);
console.log(remover);
console.log(lista);
lista.splice(2,0,100,200,300);
console.log(lista);
/*El método splice() cambia el contenido de un array eliminando elementos existentes y/o agregando nuevos elementos.
 */

lista.shift();
console.log(lista);
/*El método shift() elimina el primer elemento del array y lo retorna. Este método modifica la longitud del array.*/


lista.pop();
console.log(lista);
/**El método pop() elimina el último elemento de un array y lo devuelve. Este método cambia la longitud del array. */

let masE = lista.concat(100,200,300);
console.log(masE);
/*Concat añade elementos al arreglo en mayor cantidad*/

lista.push(100);
console.log(lista);
/*Push añade un elemento al final del arreglo */

let msj= lista.join("-");
console.log("msj" + msj);
/*Join nos pone el elemento que digamos entre cada elemento. Si tenemos [4,5,6] y hacemos el .join("-"), quedaria como [4-5-6] */

let listaNueva= lista.slice(1, 4);
console.log("Slice" + listaNueva);
/**  El método slice() devuelve una copia de una parte del array dentro de un nuevo array empezando por inicio hasta fin (fin no incluido). El array original no se modificará.

El código fuente de esta demostración interactiva está alojado en un repositorio Github. Si desea contribuir con ella, por favor clone https://github.com/mdn/interactive-examples y envíenos un "pull request". */


for (let i= 0; i< lista.length; i++){
    console.log ( "--> " + lista[i]);
    console.log(lista);
}
/*.length nos indica que tan larga o cuantos elementos tiene nuestro arreglo*/