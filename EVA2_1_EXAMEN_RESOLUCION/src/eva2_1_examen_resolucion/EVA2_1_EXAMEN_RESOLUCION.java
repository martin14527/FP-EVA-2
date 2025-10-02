/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_examen_resolucion;

import java.util.Scanner;

 
public class EVA2_1_EXAMEN_RESOLUCION {
    final static String PWD = "1234";
    public static void main(String[] args) {
    String usuario,contra,leer;
    int opciones,retirar;
    double depositar;
    Scanner input = new Scanner (System.in);
   
    System.out.println("bienvenido");
    System.out.print("ingresar pin de acceso");
    contra = input.nextLine();
    if(contra.equals(PWD)) {
        System.out.println("consultar saldo");
        System.out.println("retirar dinero");
        System.out.println("depositar dinero");
        System.out.println("cual opcion quieres?");
        opciones= input.nextInt();
          if(opciones == 1){
         System.out.println("impimir el saldo---> tu saldo es 5000");
    }else if(opciones == 2){
         System.out.println("cual es tu monto a retirar?");
         retirar= input.nextInt();
    if (retirar > 5000) {
    System.out.println("saldo insuficiente");
} else {
    retirar = 5000 - retirar;
    System.out.println("toma tu dinero, tu saldo actual es " + retirar);
         }}else if(opciones == 3){
         System.out.println("cual es tu monto a depositar");    
         depositar= input.nextDouble();
         System.out.println("tu monto a depositar es" + depositar);
         depositar=depositar + 5000;
         System.out.println("tu saldo total es---> " + depositar);
    }else{
        System.out.println("opcion no valida");
    }
    } else {
        System.out.println("ACCESO NEGADO, LAS CRDENCIALES SON INCORRECTAS");
    }
    }}
    
    

