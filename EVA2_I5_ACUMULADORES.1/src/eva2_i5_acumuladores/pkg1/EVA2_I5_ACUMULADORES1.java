package eva2_i5_acumuladores.pkg1;

import java.util.Scanner;

public class EVA2_I5_ACUMULADORES1 {

    public static void main(String[] args) {
        int cuenta = 0;
        System.out.println("Tu cuenta es ---> " + cuenta);
        
        cuenta += 1000;
        System.out.println("Tu cuenta es ---> " + cuenta);
        
        cuenta -= 800;
        System.out.println("Tu cuenta es ---> " + cuenta);
        
        cuenta += 300;
        System.out.println("Tu cuenta es ---> " + cuenta);

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones deseas ingresar? ");
        int n = scanner.nextInt();

        double[] calificaciones = new double[n];
        double suma = 0; // Acumulador para la suma de calificaciones

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la calificación #" + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
            suma += calificaciones[i]; 
        }

        System.out.println("Calificaciones registradas:");
        for (int i = 0; i < n; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }

        double promedio = suma / n; // Cálculo del promedio

        System.out.println("Promedio de calificaciones: " + promedio);
    }
}

