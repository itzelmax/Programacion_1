
public class Ejercicio_09_if_else {

    public static void main(String[] args) {
        var numero = 5;
        var numeroTexto = "Número desconocido";
        if (numero == 1) {
            numeroTexto = "Número uno";
        } else if (numero == 2) {
            numeroTexto = "Número dos";
        } else if (numero == 3) {
            numeroTexto = "Número tres";
        } else if (numero == 4) {
            numeroTexto = "Número cuatro";
        } else {
            numeroTexto = "Número no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }

}
