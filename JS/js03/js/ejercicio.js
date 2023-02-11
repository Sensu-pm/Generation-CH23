

let diaNumero= Number(prompt("Que numero de dia de la semana es?"));

if(diaNumero === 0){
    document.write("<h2>Hoy es Domingo de Resurrección papá</h2>");
} else if(diaNumero ===1){
    document.write("<h2>Lunes, inicio de semana, No tengo muchas  ganas, NO VOY A TRABAJAA</h2>");
    

}
else if(diaNumero===2) {
    document.write("<h2>Apenas es Martes, Cinco minutitos más....</h2>");
} 
else if(diaNumero===3){
    document.write("<h2Miercoles, pero a que costo?</h2>");
} 
else if(diaNumero===4) {
    document.write("<h2>Ya es JUEBEBES!!!!!</h2>");
} 
else if(diaNumero===5) {
    document.write("<h2>Es VIERNES, Saquen el plan, trago $22.50 MXN</h2>");
} 
else if(diaNumero===6) {
    document.write("<h2>SABADO de fiesta! SABADO de fiesta! <br>Amos a la Lupita o quesos?</h2>");
} 


else {
    document.write("<h2>Los dias son un constructo social.</h2>");
}

let q= false;
let p= true;
if (q && p) console.log("true");

if(q || p) console.log("False");

if(!q || p) console.log("true");

// and &&
// or  ||
// not !
