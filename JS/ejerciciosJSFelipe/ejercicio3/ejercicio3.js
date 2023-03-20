/**
 *Solicitar al usuario un numero y guardar
 Calcular el factorial del numero recibido
 Imprimir el resultado
 identificar datos
 */
 let num = parseInt(prompt("Dame un numero "));
 let fac = 1;
 if(!isNaN(num)){
     for (let i = 2; i <= num; i++) {
           fac = fac * i;
     }
     console.log(fac);
 }else console.log("No es un numero");