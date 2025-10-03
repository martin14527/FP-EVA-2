/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_arreglos_strings;

import java.util.Scanner;
public class EVA2_4_ARREGLOS_STRINGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner captu =new Scanner(System.in);
     String diasemana[]=new String[7];
     int dia;
     diasemana[0]="domingo";
     diasemana[1]="lunes";
      diasemana[2]="martes";
      diasemana[3]="miercoles";
       diasemana[4]="jueves";
        diasemana[5]="viernes";
         diasemana[6]="sabado";
      System.out.println("introduce el dia en numero (0 - 6) :");
      dia=captu.nextInt();
    }
    
}
