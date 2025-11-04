/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27cuenta;

import java.util.Scanner;

/**
 *
 * @author anoni
 */
public class EVA2_27CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner captu=new Scanner(System.in);
          int val;
          double cuenta=1000000;
          do{
          System.out.println("tu saldo es " + cuenta + "   cuanto dinero quieres tu retirar?");
          val=captu.nextInt();
          cuenta= cuenta-val;
          
          }while(cuenta > 0) ;
          System.out.println("tu saldo es " + cuenta );
          
    }
    
}
