//Calcular las estaciones del año

let mes = 7;

if (mes == 12 || mes == 1 || mes == 2) {
    console.log("Verano");
} else if (mes >= 3 && mes <= 5) {
    console.log("Otoño");
} else if (mes >= 6 && mes <= 8) {
    console.log("Invierno");
} else if (mes >= 9 && mes <= 11) {
    console.log("Primavera");
} else {
    console.log("Mes inválido");
}