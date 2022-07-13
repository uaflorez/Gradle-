package Ejercicio_5;

import java.util.Scanner;

public class Principal {

    public  static double mayorArea(Triangulos triangulosIso[]){
        double area;

        area = triangulosIso[0].obtenerArea();
        for(int i=1;i< triangulosIso.length;i++){
            if(triangulosIso[i].obtenerArea()>area){
                area =  triangulosIso[i].obtenerArea();
            }
        }
        return area;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int numTriangulos;

        System.out.println("Digite el número de triangulos a ingresar: ");
        numTriangulos = entrada.nextInt();

        // llenamos los objetos de las clases
        Triangulos trianguloIso[] = new Triangulos[numTriangulos];
        for(int i=0; i<trianguloIso.length;i++){
            System.out.println("\nDigite los valores del triangulo"+(i+1)+":");
            System.out.print("Introduzca la base: ");
            base = entrada.nextDouble();
            System.out.print("Introduzca el lado: ");
            lado = entrada.nextDouble();

            trianguloIso[i] = new Triangulos(base, lado);

            System.out.println("\nEl perimetro del triangulo es: "+trianguloIso[i].obtenerPerimetro());
            System.out.println("El área del triangulo es : "+ trianguloIso[i].obtenerArea());


        }
        System.out.println("\nEl area del triangulo de mayor superficie es : "+mayorArea(trianguloIso));

    }
}
