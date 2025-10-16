package eva2_14_arreglos;

import java.util.Scanner;

public class EVA2_14_ARREGLOS {
    public static void main(String[] args) {
        Scanner scanner;
        int cantidad;
        double[] calificaciones;

        scanner = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones vas a ingresar? ");
        cantidad = scanner.nextInt();

        calificaciones = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        System.out.println("Calificaciones ingresadas:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Calificación #" + (i + 1) + ": " + calificaciones[i]);
        }
    }
}
