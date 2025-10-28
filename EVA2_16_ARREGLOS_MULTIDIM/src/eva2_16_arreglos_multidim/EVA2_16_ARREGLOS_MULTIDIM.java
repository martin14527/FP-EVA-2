
package eva2_16_arreglos_multidim;

public class EVA2_16_ARREGLOS_MULTIDIM {
   
 public static void main(String[] args) {
      //  matriz de 3 filas y 4 columnas
       int matriz[][]= new int [3][4];
       matriz [0][0] = 100;
       matriz [0][1] = 200;
       matriz [0][2] = 300;
       matriz [0][3] = 400;
        for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < 4; j++) { 

                matriz [i][j] = (int)(Math.random()*180);
                               
            }

            
        }
            
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 4; j++) { 
               System.out.print("[" + matriz [i][j] + "]");
                               
            }
            
            System.out.println("");
            
            
        }
        System.out.println(matriz.length); //FILAS 
        System.out.println(matriz[0].length); //COLUMNAS
        
    }
    
}