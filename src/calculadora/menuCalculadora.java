package calculadora;

import java.util.Scanner;

public class menuCalculadora {
    static Scanner leer =new Scanner(System.in);
    public static void showMenu(){
        int op;
        do {
            System.out.println("Ingresa 1-Sumar, 2-Restar, 3-Multiplicar");
            System.out.println("ingrese el valor: ");
            op = leer.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingrese primer valor");
                    int a= leer.nextInt();
                    System.out.println("Ingrese segundo valor");
                    int b= leer.nextInt();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ingresaste a ajustes");
                    break;
                case 3:
                    System.out.println("Saliste del juego");
                    break;
                default:
                    System.out.println("Ingresa una opcion correcta");
            }
        }while (op != 1 && op != 2 && op != 3);{

        }
    }
}
