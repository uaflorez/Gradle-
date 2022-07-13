package Ejercicio_3;

public class Vehiculo {
    // Atributos
    private String marca;
    private String modelo;
    private float precio;

    // Metodos

    //constructor Para inicialkizar los valores

    public Vehiculo(String marca, String modelo, Float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public  String mostrarDatos(){
        return "Marca: " +marca+ "\nModelo: "+modelo+"\nPrecio: "+precio+"\n";
    }

}
