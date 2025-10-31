import java.util.Scanner;

public class EVA2_23_BUSQUEDA {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int valor;
        int pos1 = -1;
        int datos[] = new int[10];
        
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random() * 100);
        }

        System.out.println("Valores del arreglo:");
        for (int i = 0; i < datos.length; i++) {
            System.out.print("(" + datos[i] + ") ");
        }
        System.out.println("Valor a buscar: ");
        valor = captura.nextInt();
        for (int i = 0; i < datos.length; i++) {
            if (valor == datos[i]) {
                pos1 = i;                break;   //ROMPE LA INSTRUCCION
            }
        }
            System.out.println("El valor se encuentra en la posición: " + pos1);
    }
}

