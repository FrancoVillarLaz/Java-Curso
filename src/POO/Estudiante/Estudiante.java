package POO.Estudiante;

import java.util.Scanner;

public class Estudiante {
    String nombre;
    int edad;
    double[] calificaciones;

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad=edad;
        }
    public void setCalificaciones() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de notas de " + this.nombre);
        int cantidad = leer.nextInt();
        this.calificaciones = new double[cantidad];
        System.out.println("ingrese uno por uno las " + cantidad + " notas");
        for (int i = 0; i < this.calificaciones.length; i++) {
            this.calificaciones[i] = leer.nextInt();
        }
    }
    public void promedio(){
        double promedio=0;
        for (int i = 0; i < this.calificaciones.length; i++) {
            promedio += this.calificaciones[i];
        }
        System.out.println("el promedio de "+this.nombre+" es de "+promedio/this.calificaciones.length);

    }

}
