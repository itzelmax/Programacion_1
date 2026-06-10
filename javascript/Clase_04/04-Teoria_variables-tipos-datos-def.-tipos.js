var objeto = {
    nombre : "Gustavo",
    apellido : "Rios",
    telefono : "2604123789"
}
console.log(typeof objeto);

//Tipo de dato boolean
var bandera = true;
console.log(typeof bandera);
 
//Tipo de dato funcion

function miFuncion(){}
console.log(typeof miFuncion)

//Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);
///Clase 4