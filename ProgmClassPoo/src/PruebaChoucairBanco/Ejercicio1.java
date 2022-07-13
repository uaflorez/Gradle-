package PruebaChoucairBanco;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("ingrese el valor: ");
        n = entrada.nextInt();
        int cola = n;
        int punta = 0;
        if(n== 0){
            System.out.println("Error");
        }else {
            for(int i=0;i<n; i++){
                for(int j=0;j<n;j++){
                    if(j==cola-1 || j==punta){
                        System.out.print('X');
                    }else {
                        System.out.print('_');
                    }
                }
                System.out.println();
                cola--;
                punta++;
            }
        }



    }
}
