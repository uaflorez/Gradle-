package Ejercicio_2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Tablero t1;
        int x,y,opcion,incremento=0 ;

        System.out.println("Digite la coordenada inicial de X: ");
        x = entrada.nextInt();
        System.out.println("Digite la cooredenada inicial de Y: ");
        y = entrada.nextInt();

        // Posición inicial del objeto

        t1= new Tablero(x,y);

        do{
            System.out.println("\n\t.:Menu:.");
            System.out.println("1. Mover hacia Arriba");
            System.out.println("2. Mover hacia Abajo");
            System.out.println("3. Mover a la Derecha");
            System.out.println("4. Mover a la Izquierda");
            System.out.println("5. salir");
            System.out.print("Digite la opcion: ");
            opcion = entrada.nextInt();

            if(opcion !=5){
                System.out.println("\nDigite la cantidad de espacios a moverse: ");
                incremento = entrada.nextInt();
            }

            switch (opcion){
                case 1: t1.moverArriba(incremento);break;
                case 2: t1.moverAbajo(incremento);break;
                case 3: t1.moverDerecha(incremento);break;
                case 4: t1.moverIzquierda(incremento);break;
                case 5: break;
                default: System.out.println("Error, se equivoco de opcion de menú");break;
            }

            System.out.println("\nPosicion Actual (x,y): ("+t1.getX()+" , "+t1.getY()+")");

        }while(opcion != 5);
    }
}
