import java.util.Scanner;

public class Ejercicio3 {

    static Scanner value = new Scanner(System.in);

    public static void main(String[] args) {
        double valor1, valor2;
        System.out.println("Introduce un valor: ");
        valor1 = value.nextDouble();

        System.out.println("Introduce otro valor distinto: ");
        valor2 = value.nextDouble();

        valor1 = valor2;
        valor2 = valor1;

        System.out.println("valor1 = " + valor1 + "; valor2 = " + valor2);
    }
}
