package POO.calculadora;

import java.util.Scanner;

public class menuCalculadora {
    static Scanner leer =new Scanner(System.in);
    public static void showMenu(){
        int a;
        int b;
        int op;
        Calculadora calculadora = new Calculadora();
        do {
            System.out.println("Ingresa 1-Sumar, 2-Restar, 3-Multiplicar");
            System.out.println("ingrese el valor: ");
            op = leer.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingrese primer valor");
                    a= leer.nextInt();
                    System.out.println("Ingrese segundo valor");
                    b= leer.nextInt();
                    int suma=calculadora.sumar(a,b);
                    System.out.println("el resultado es: "+suma);

                    break;
                case 2:
                    System.out.println("Ingrese primer valor");
                    a= leer.nextInt();
                    System.out.println("Ingrese segundo valor");
                    b= leer.nextInt();
                    int resta=calculadora.restar(a,b);
                    System.out.println("el resultado es: "+resta);

                    break;
                case 3:
                    System.out.println("Ingrese primer valor");
                    a= leer.nextInt();
                    System.out.println("Ingrese segundo valor");
                    b= leer.nextInt();
                    int multiplicacion=calculadora.multiplicar(a,b);
                    System.out.println("el resultado es: "+multiplicacion);

                    break;
                default:
                    System.out.println("Ingresa una opcion correcta");
            }
        }while (op != 1 && op != 2 && op != 3);{

        }
    }
}
