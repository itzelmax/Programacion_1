
import java.util.Scanner;


public class Ejercicio_13_sist_calif_switch {
    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la calificación: ");
        var calificacion = Integer.parseInt(entrada.nextLine());
        var califiNum = "Calificación desconocida";
        switch(calificacion){
            case 9: case 10:
                califiNum = "A";
                break;
            case 7: case 8:
                califiNum = "B";
                break;
            case 6:
                califiNum = "C";
                break;
            case 5:
                califiNum = "D";
                break;
            default:
                califiNum = "F";
        }
        System.out.println("La calificacion es: " + califiNum);
    }
}

