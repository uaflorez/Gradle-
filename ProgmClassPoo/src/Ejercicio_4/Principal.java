/*
    Ejercicio 4: construir un programa para una competencia de atletismo,
    el programa debe gestionar una serie de atletas caracterizados por su
    numero de atleta, nombre y tiempo de la carrera, al final el programa debe mostrar
    los datos del atleta ganador de la carrera.
 */
package Ejercicio_4;

import java.util.Scanner;

public class Principal {

    public static int indiceGanador(Atleta corredor[]){
        float tiempoCarrera;
        int indice = 0;
        tiempoCarrera = corredor[indice].getTiempoCarrera();
        // Acá sacamos el menor tiempo obtenido por el atleta
        for (int i=0;i<corredor.length; i++){
            if (corredor[i].getTiempoCarrera()<tiempoCarrera){
                tiempoCarrera = corredor[i].getTiempoCarrera();
                indice = i;
            }
        }
        return indice;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAtleta, cantAtletas,indiceAtletaGanador;
        String nombre;
        float tiempoCarrera;

        // pedimos la cantidad de corredores
        System.out.print("Ingresa la cantidad de atletas para la carrera: ");
        cantAtletas = entrada.nextInt();

        // creamos el objeto de atletas para guardar la información del mismo
        Atleta corredor[] = new Atleta[cantAtletas];

        // Para llenar los datos en nuestro arreglo
        for (int i=0;i<corredor.length;i++){

            System.out.println("\nDigita los datos del corredor"+(i+1)+":");
            System.out.print("Introduzca el numero del corredor: ");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Introduzca el nombre del corredor: ");
            nombre = entrada.nextLine();
            System.out.print("introduzca el tiempo que gastro el atleta:");
            tiempoCarrera = entrada.nextFloat();

            corredor[i] = new Atleta(numeroAtleta,nombre,tiempoCarrera);

        }
        indiceAtletaGanador = indiceGanador(corredor);
        System.out.println("\nEl Ganador de la carrera es:  ");
        System.out.println(corredor[indiceAtletaGanador].mostarDatosGanador());
    }
}
