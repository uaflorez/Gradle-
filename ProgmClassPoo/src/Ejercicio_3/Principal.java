/*
    Construir un programa que dada una serie de vehículos
    caracterizados por su marca, modelo y precio, imprima
    las propiedades del vehículo mas barato.
    para ello, se deberan leer por teclado las caracteristicas
    de cada vehiculo y crear una clase que represente a cada
    uno de ellos.
 */
package Ejercicio_3;

import java.util.Scanner;

public class Principal {

    public static int indiceCocheMBarato( Vehiculo coches[]){
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for(int i=1;i<coches.length;i++){
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;

        System.out.println("Digite la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();

        // creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        // Para llenar los datos de nuestros objetos
        for(int i=0; i<coches.length;i++){
            entrada.nextLine();
            System.out.println( "\nDigite las caracteristicas del coche "+(i+1)+":");
            System.out.print("Introduzca la Marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca el Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca el Precio: ");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculo(marca,modelo,precio);
        }
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
