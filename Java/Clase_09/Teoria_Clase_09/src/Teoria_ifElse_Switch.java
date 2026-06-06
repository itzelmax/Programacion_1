
import java.util.Scanner;

public class Teoria_ifElse_Switch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        var condicion = false;
//        if(condicion){
//            System.out.println("Condición Verdadera"); //Condicional simple
//        }
//        else{
//            System.out.println("Condición Falsa"); //Condicional doble
//        }
//      
        System.out.println("Digite un número del 1 al 4: ");
        var numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "Valor desconocido";
        switch(numero) {
            case 1:
                numeroTexto = "Número uno";
                break;
            case 2:
                numeroTexto = "Número dos";
                break;
            case 3:
                numeroTexto = "Número tres";
                break;
            case 4:
                numeroTexto = "Número cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);

    }

}
