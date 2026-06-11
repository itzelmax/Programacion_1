const console = require("node:console");

// Hoy ya no se usa var, se utiliza let y conts
let nombre = "Pedro";

const apellido2 = "Lepes";
//apellido2 = "Lepes"; una constante no puede ser modificada
console.log(apellido2);

let x, y; //Se pueden crear varias variables dentro de una misma linea.
x = 17, y = 21; // Se puede hacer asignacion de varias variables dentro de la misma linea 
let z = x + y; //Se asigna el valor de la operacion
console.log(z);

let _1num = 31; //El lenjuage no puede conmenzar con numeros, se le podria poner un simbolo permitido pero no es lo recomendable
let $break = "rompe";//Palabra reservadas tampoco se ultilza, se le podria agregar un simbolo permitido pero no es lo usual ni permitido.

console.log(_1num);
console.log($break);

//Ampliando el uso de var let conts
/*
Con var puedes reasignar en cualquir momento
esta forma parte del ambito digital
Un error es que se sobreescriba
*/

var nombre = 'Ariel';
nombre = 'Osvaldo';
console.log(nombre);

function saludar(){
    var nomvre = 'Natalia';
    console.log(nombre);
}
console.log(nombre);//Aqui no lee el dato en la funcion

if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad); //En la funcion funciono correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves
o dentro de una funcion
*/

function saludar2(){
    let nombre2 = 'Gustavo';
    console.log(nombre2);
}
console.log(nombre2);

if(true){
    let edad2 = 32;
    console.log(edad2);
}
console.log(edad2);

/*
const se utiliza para valores constatntes que no pueden ser reasignados
*/

const fechaNacimiento= 1993
console.log(fechaNacimiento);
fechaNacimiento = 2000;
console.log(fechaNacimiento); // Solo se ejecuta el console anterior

