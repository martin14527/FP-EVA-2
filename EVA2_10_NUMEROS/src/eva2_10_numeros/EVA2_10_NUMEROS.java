/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_numeros;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_NUMEROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double NUMEROP;
    double Numeroseg;
    double Multi, Multi2,resul;
    int tabla;      
    for(int i = 1; i <=20; i++)
        System.out.println(i + "-");
    //impriir numeros pares
    //incrementate de 2 en 2 
      for(int i = 0; i <=100; i+=2 )
          System.out.print(i + "-");
      //al revez
      for(int i = 100; i >=0; i-=2 )
          System.out.println(i + "-");
    //imprimir la lista de numero entre cualquier valor que el usuario quiera
       Scanner captu = new Scanner(System.in);
       System.out.println("este programa lanza valores intermedios entre 2 numeros");
       System.out.println("dame el primer valor");
       NUMEROP =captu.nextDouble();
       System.out.println("dame el segundo valor");
       Numeroseg =captu.nextInt();
       for(double i =NUMEROP ; i <Numeroseg; i+=1 )
          System.out.print(i + "-");
        for(double i =Numeroseg ; i <NUMEROP; i-=1 )
          System.out.println(i + "-");
       //dame un numero y te dare la tabla de multiplica (1*10)
       System.out.println("este programa te pide 1  valor y te da su tabla de multiplicar");
       tabla =captu.nextInt();
        for(double i =tabla ; i <0; i+=1)
          System.out.print(i + "-");
    }
}
