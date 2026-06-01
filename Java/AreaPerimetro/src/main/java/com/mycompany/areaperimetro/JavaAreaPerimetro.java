import java.util.Scanner;

public class JavaAreaPerimetro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double base, altura, area, perimetro;

        System.out.println("Ingrese la base:");
        base = entrada.nextDouble();

        System.out.println("Ingrese la altura:");
        altura = entrada.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }
}
