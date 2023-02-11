let hora = Number(prompt("Indica la hora: "));

if(hora >= 6 && hora <= 11){
    document.write("Buenos dias bebé");
} else if(hora>=12 && hora <=18){
    document.write("Buenas tardes guachin");
} else if(hora>=19 && hora <=23){
    document.write("Buenas noches bby");
} else if(hora >=0 && hora <=5){
    document.write("Que haces despierto?");
} else {
    document.write("Rompiste el tiempo y el espacio")
}
