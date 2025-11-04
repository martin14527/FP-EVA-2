package eva2_25_for_piramide_doble;

import java.util.Scanner;

public class EVA2_25_FOR_PIRAMIDE_DOBLE {

    public static void SegundoForAnidado(Scanner datos) {
        System.out.println(".");
        int filas1;
        System.out.print("Di un número y te daré una escalera: ");
        filas1 = datos.nextInt();

        for (int G = filas1; G >= 1; G--) {
            for (int K = 1; K <= G; K++) {
                System.out.print( " *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SegundoForAnidado(entrada);
    }
}


