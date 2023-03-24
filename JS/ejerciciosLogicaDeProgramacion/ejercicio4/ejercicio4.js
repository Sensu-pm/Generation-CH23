/**
 Solicitar al usuario un numero y guardarlo
 imprimir la serie de fibonacci del numero guardado
 imprimir el resultado 
 
 */
 let num = parseInt(prompt("Dame un numero "));
 let fib = [0,1];
 if(!isNaN(num)){
     for (let i = 2; i <= num; i++) {
           fib[i] = fib[i-1] + fib[i-2];
         }
         console.log(fib);
 }else console.log("No es un numero");