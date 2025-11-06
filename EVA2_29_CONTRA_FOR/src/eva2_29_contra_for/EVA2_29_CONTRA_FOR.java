package eva2_29_contra_for;

import java.util.Scanner;

public class EVA2_29_CONTRA_FOR {
    final static String PDA = "NITROV15";
    final static String USUARIO = "DTS";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usuario, contra;

        System.out.println("Bienvenido");
        System.out.print("Ingresa tu Usuario: ");
        usuario = input.nextLine();

        if (usuario.equals(USUARIO)) {
            for (int i = 1; i <= 4; i++) {
                System.out.print("Ingresa Contraseña: ");
                contra = input.nextLine();

        if (contra.equals(PDA)) {
                    System.out.println("ACCESO PERMITIDO");
         break; 
        } else {
                    System.out.println("ACCESO NEGADO");
                }
            }
        } else {
            System.out.println("Usuario incorrecto. ACCESO DENEGADO.");
        }

        input.close();
    }
}


 