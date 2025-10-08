/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12tablas.de.multiplicar;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class EVA2_12tablasDeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int tabla;
        int resultado;
         System.out.println("dame un numero y yo lo multiplicare por la tabla");
          tabla = captu.nextInt();
        for (int i = 1; i <=10; i += 1) {
         resultado=tabla*i;  
    System.out.println("resultado de multiplicar el numero "+ tabla+  " seria " + resultado);
            
        }

    }
    
}
