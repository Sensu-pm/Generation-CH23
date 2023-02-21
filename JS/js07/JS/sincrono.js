//JavaScript sincrono
alert("Cohorte 23");
console.log("Hola, buen dia");
alert("Dia del michi");
console.log("Adios");

setTimeout(
    function (){
        console.log("Hola mundo, con retraso");
    }, 1000
)


const myCallBack = () => console.log("Hola mundo con retraso");
setTimeout(myCallBack);
console.log("Surprise MF");