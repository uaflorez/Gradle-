/*
    Ejercico 1: Construir un programa que calcule el área y el perimetro
    de un cuadrilátero dada la longitud de sus dos lados.
    Los valores de la longitud deberan introducirse por linea de ordenes.
    Si es un cuadrado, solo se proporcionará la longitud de uno de los
    lados al constructor.
 */
package Ejercicio_1;

public class Cuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;

    //Métodos

    // Método constructor 1 (Cuadrilatero)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Método constructor 2 (cuadrado)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }

    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }
}
