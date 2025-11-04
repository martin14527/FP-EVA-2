/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_for_piramide;

import java.util.Scanner;

/**
 *
 * @author anoni
 */
public class EVA2_24_FOR_PIRAMIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //24. Solicite un valor al usuario y con ese valor imprima el siguiente patrón usando ciclos:
//Ejemplo: el usuario captura 5
/*
**
***
****
*****/
int filas;
Scanner datos = new Scanner(System.in);
        System.out.print("Di un número y haré una pirámide: ");
        filas = datos.nextInt();
 for(int A=1; A<=filas; A++){ 
 for(int B=1; B<=A; B++){                           // for (inicialización; condición; actualización) {
     System.out.print( " x");
    }
  System.out.println("");
 
    }
}
}