
package eva2_5_arreglo_switch_2;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class EVA2_5_ARREGLO_SWITCH_2 {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String diasemana[] = {"DOMINGO","LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO"};
        
        int dia;
        System.out.println("Introduce el día en número (0 - 6): ");
        dia = captu.nextInt();
        
        if (dia >= 0 && dia <= 6) {
            System.out.println("El día es: " + diasemana[dia]);
        } else {
            System.out.println("Número inválido, debe ser entre 0 y 6.");
        }
    }
}
