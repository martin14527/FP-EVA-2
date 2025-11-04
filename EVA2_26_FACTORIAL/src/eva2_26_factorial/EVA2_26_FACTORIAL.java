/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author anoni
 */
public class EVA2_26_FACTORIAL {

    public static void main(String[] args) {
      Scanner captu=new Scanner(System.in);
      double valor, factoriales = 1;
      System.out.println("dame un numero");
      valor=captu.nextInt();
      for(double i=1; i<=valor; i++){
    factoriales= factoriales*i;
            }
        System.out.println("tu numero factorial es " + factoriales);
}
}
