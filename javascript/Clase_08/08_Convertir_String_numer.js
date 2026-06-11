let miNumero = '21'; //Es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero); //Esta es una funcion
console.log(typeof edad2);
//Funcion isNan
if(isNaN(edad2)){
    console.log("Esta variable no contienen solo numeros")
}
else{
    if(edad2 >= 18){
        console.log("Puede votar");
    }
    else{
        console.log("Muy joven para votar");
    }
}
//Operador ternario
let resultado3 = edad2 >= 18 ? "Pede votar" : "Muy joven para votar";
console.log(resultado3);

