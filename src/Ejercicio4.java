import java.util.Scanner;

public class Ejercicio4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double distancia, tiempo, velocidad;
        System.out.println("Introduce la distancia recorrida (km).");
        distancia = sc.nextDouble();

        System.out.println("Introduce el tiempo del recorrido (min).");
        tiempo = sc.nextDouble();

        tiempo = tiempo / 60;
        velocidad = distancia / tiempo;
        System.out.println("Se ha desplazado a una velocidad de " + velocidad + " km/h.");
    }
}
