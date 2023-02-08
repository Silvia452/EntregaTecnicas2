import java.util.Scanner;

public class Ejercicio3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double valor1, valor2;
        System.out.println("Introduce un valor: ");
        valor1 = sc.nextDouble();
        System.out.println("Introduce otro valor distinto: ");

        valor2 = sc.nextDouble();
        // tratamiento
        valor1 = valor2;
        valor2 = valor1;
        System.out.println("valor1 = " + valor1 + "; valor2 = " + valor2);
    }
}
