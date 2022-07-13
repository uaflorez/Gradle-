/*
    Crear y cargar un amatriz de tamaño 3x3, trasponerla y mostrarla.
 */
package matrices3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][]= new int[3][3];

        System.out.println("Digite la matriz");
        for(int i =0;i<3;i++){
            for(int m=0;m<3;m++){
                System.out.print("matriz ["+i+"]["+m+"]: ");
                matriz[i][m]= entrada.nextInt();
            }
        }
        System.out.println("\nMatriz original: ");
        for(int i=0;i<3;i++){
            for(int m=0;m<3;m++){
                System.out.print(matriz[i][m]+ " ");
            }
            System.out.println("");
        }
        //ahora transponemos
        int aux;
        for(int i=0;i<3;i++){
            for (int m=0;m<i;m++){
                aux = matriz[i][m];
                matriz[i][m] = matriz[m][i];
                matriz[m][i]= aux;
            }
        }
        System.out.println("\nlA MATRIZ TRANSPUESTA ES: ");
        for (int i=0;i<3;i++){
            for(int m=0;m<3;m++){
                System.out.print(matriz[i][m]+ " ");
            }
            System.out.println("");
        }
    }
}
