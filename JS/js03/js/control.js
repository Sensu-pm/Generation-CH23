//     if (condition){
//       Bloque código
//     }

let edad= parseInt(prompt("Escribe tu edad"));

if(edad <= 17){
    document.write("Ve con los pequeñines");
} else if(edad ===18){
    document.write("Eres mayor de edad");

}


else if(edad >18) {
    document.write("<h2>Pasa a la salpicadera de salty</h2>");
} else {
    document.write("<h2>Este numero no es valido</h2>");
}