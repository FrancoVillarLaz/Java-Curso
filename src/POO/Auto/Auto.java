package POO.Auto;

import java.util.Scanner;

public class Auto {
    String modelo;
    String marca;
    String color;

    int año;
    int velocidadActual;
    protected final int veloMax = 200;
    protected final int capacidadCombustible = 100;
    int combustibleActual;

    public Auto(String modelo, String marca, String color, int año) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.año = año;
    }
    public void cargarCombustible () {
        Scanner leer = new Scanner(System.in);
        System.out.println("tenes"+this.combustibleActual);
        System.out.println("cuanto conbustible vas a cargar");

        int combustible = leer.nextInt();

        if (combustibleActual == capacidadCombustible) {
            System.out.println("tanque lleno");
        } else if (combustibleActual + combustible  > capacidadCombustible) {
                combustible = capacidadCombustible;
                this.combustibleActual = combustible;

        } else {
            this.combustibleActual = combustible + combustibleActual;
        }
        System.out.println("tenes"+this.combustibleActual);

    }

    public void acelerar(){
        Scanner leer = new Scanner(System.in);
        System.out.println("seleccione que tanto apretas es acelerador (del 1 al 3)");
        int presionarPedal = leer.nextInt();
        switch(presionarPedal){
            case 1:
                for (int i = velocidadActual; i < veloMax; i++) {
                    velocidadActual += 1;
                }
                break;
            case 2:
                for (int i = velocidadActual; i < veloMax; i+=5) {
                    velocidadActual += 5;
                }
                break;
            case 3:
                for (int i = velocidadActual; i < veloMax; i+=10) {
                    velocidadActual += 10;
                }
                break;

        }
    }
    public void frenar(){
        Scanner leer = new Scanner(System.in);
        System.out.println("seleccione que tanto apretas el freno (del 1 al 3)");
        int presionarPedal = leer.nextInt();
        switch(presionarPedal){
            case 1:
                for (int i = velocidadActual; velocidadActual > 0; i--) {
                    velocidadActual -= 1;
                }
                break;
            case 2:
                for (int i = velocidadActual; velocidadActual > 0; i-=5) {
                    velocidadActual -= 5;
                }
                break;
            case 3:
                for (int i = velocidadActual; velocidadActual > 0; i-=10) {
                    velocidadActual -= 10;
                }
                break;

        }
    }
}
