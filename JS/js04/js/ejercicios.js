const arrayPeople = ["Sofia", "David", "Juan"];

console.log("La fila es: "+ arrayPeople);

arrayPeople.shift();
arrayPeople.push("Sara","Augustin");

console.log(arrayPeople);

arrayPeople.splice(1,0,"Renata");
arrayPeople.push("Elena");
console.log(arrayPeople);

for(let i=1; i<=6; ++i){
    let resultado = '';

    for(let j=1; j<=1; ++j){
        resultado += '*';
        }
        console.log(resultado);
}

let a = "*";
let contador = 0;

while(contador <5){
    console.log(a);
    a +=  "*";
    contador+=1 ;
}

