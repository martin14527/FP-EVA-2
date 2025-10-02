package eva2_1_switch;

import java.util.Scanner;

public class EVA2_1_SWITCH {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opc;

        System.out.println("Menú de opciones:");
        System.out.println("1. Imprimir");
        System.out.println("2. Retirar saldo");
        System.out.println("3. Depositar");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");

        opc = captu.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Elegiste imprimir ");
                break;
            case 2:
                System.out.println("Elegiste retirar saldo ");
                break;
            case 3:
                System.out.println("Elegiste depositar ");
                break;
            case 4:
                System.out.println("Elegiste salir ");
                break;
            default:
                System.out.println("Operación incorrecta ");
        }
    }
}

    

    
    

