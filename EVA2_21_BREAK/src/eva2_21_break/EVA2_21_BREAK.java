/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_break;

import java.util.Scanner;

/**
 *
 * @author anoni
 */
public class EVA2_21_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu =new Scanner(System.in);
        int valor, adivinar;
         adivinar = (int)(Math.random() * 5) + 1;

        while(true){
    
          System.out.println("adivina el numero, -1 para terminar");
          valor=captu.nextInt();
          if(valor ==-1){
          System.out.println("ganaste¡¡¡¡¡¡¡");
              break; //termina el ciclo
          } System.out.println("gracias por jugar");
    }
    }  
}
