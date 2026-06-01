//Tipos de Datos en JavaScript
/*
La sintaxis en lo que es comentarios
es muy similar a la de java
realmente diriamos que es identica
*/

var nombre = "Maxiximiliano";//Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre)
//Tipo numerico
var numero = 3000; // Tipo Numérico
console.log(numero);

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

//Tipo de dato undefined
var x;
console.log(typeof x);

x = undefined;
console.log(typeof x);

//null: significa aussencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

// Clase 5 faltaria