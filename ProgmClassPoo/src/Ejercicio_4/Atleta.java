package Ejercicio_4;

public class Atleta {
    //atributos
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    // método Constructor
    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostarDatosGanador(){
        return "Numero Atleta: "+numeroAtleta+"\nNombre: "+nombre+"\nTiempo Carrera: "+tiempoCarrera+"\n";
    }
}
