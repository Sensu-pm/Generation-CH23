let miVariable = 5;
let miArray = [2,3,4,5,6,7];
// let miArray  = new Array();
console.log("miArray"+ miArray[0]);
console.log("miArray"+ miArray[1]);

let miArray1 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

console.log("miArray1 "+ miArray1[0][1]);
console.log("miArray1 "+ miArray1[0][2]);
console.log("miArray1 "+ miArray1[2][1]);
console.log("miArray1 "+ miArray1[1][2]);
console.log("miArray1 "+ miArray1[1][0]);

console.log("Todo el indice "+ miArray1[0]);
console.log("Todo el indice "+ miArray1[1]);
console.log("Todo el indice "+ miArray1[2]);


/**********************************CICLÍCO FOR************/
/*for(let i=10; i>= 0; i--) {
    console.log("Imprimiendo i "+ i);
}*/
let miArray3 = [2,3,4,5,6,7];
for(let i=0; i<= 5; i++) {
    console.log("Imprimiendo miArray -> "+ miArray3[4]);
} 
 
//el ciclo for necesia 3 parametros: el valor inicial, la prueba logica o fin y el incremento
let miArray4 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
];
for (let i=0; i< 3; i++){
    for(let j=0; j< 3; j++)
    console.log("Imprimiendo la matriz 1 -> "+ miArray4[i][j]);

console.log("*******************************************")
}
let miArray6 = [2,3,4,5,6,7];
let miArray5 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
];
let matrizR= [
    [],[],[]
]

for (let i=0; i< 3; i++){
    for(let j=0; j< 3; j++){
        matrizR[i][j]= miArray5[i][j] * miArray6[i][j];
    }
    console.log("*******************************************");
    console.log("Imprimiendo la matriz R -> "+ matrizR);


}

//************  While *************/
/*
let variable inicio

while(condition){

}
*/

let contador = 0;
while(contador < 10){
    console.log(contador);
    contador++;

}
//el while no necesita 3 parametros, solo 2
