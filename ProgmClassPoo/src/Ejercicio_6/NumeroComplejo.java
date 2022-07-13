/*
    Ejercicio 6: Construir un programa para trabjar con 2 numeros complejos,
    implemente el siguiente menú:
    1. Sumar dos numeros complejos.
    2. Multiplicar dos numeros complejos.
    3. Comparar 2 números complejos (igual o no).
    4. Multiplicar un número complejo por un entero.
 */

package Ejercicio_6;

public class NumeroComplejo {
    // numeros complejos 3 + 4i la primera parte es real la segunda es imaginaria
    private double a; // esta será la parte real
    private double b; // esta será la parte imaginaria

    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
