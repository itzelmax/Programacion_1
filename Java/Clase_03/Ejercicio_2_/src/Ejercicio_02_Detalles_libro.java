
import java.util.Scanner;


public class Ejercicio_02_Detalles_libro {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del libro: ");
        String nombreLibro = entrada.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String nombreAutor = entrada.nextLine();

        System.out.println("El libro "+ nombreLibro + " fue escrito por " + nombreAutor);

        entrada.close();
    }
}
