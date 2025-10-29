/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while;

import java.util.Scanner;

/**
 *
 * @author anoni
 */
public class EVA2_19_DO_WHILE {
final static String PWD = "2007";
    final static String USUARIO = "memo";
    public static void main(String[] args) {
     String usuario, contra;
        Scanner input = new Scanner(System.in);
    do{
        System.out.println("bienvenido");
        System.out.println("cual es tu Usuario ");
        usuario = input.nextLine();

        System.out.print("ingresar Contraseña");
        contra = input.nextLine();
    }while(!(usuario.equals(USUARIO)&& contra.equals(PWD))); //manera mas eficiente 
        if (usuario.equals(USUARIO)) {
            if(contra.equals(PWD)) {
                System.out.println("ACCESO PERMITIDO");
            } else {
                System.out.println("ACCESO NEGADO");
            }
        } else {
  
        }
    }
}