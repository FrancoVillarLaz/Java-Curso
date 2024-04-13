package POO.Mascota;

import java.util.Scanner;

public class Menu {
    public static void showMenu(MascotaVirtual nombre){
        Scanner leer = new Scanner(System.in);
        int op;
        do {
            System.out.println("eliga opcion 1-Comer, 2-Dormir, 3-Despertar, 4-caminar, 5-correr, 6-energia, 7-Esta viva?, 8-Salir,");
            System.out.println("ingrese el valor: ");
            op = leer.nextInt();
            switch (op){
                case 1:
                    leer.nextLine();
                    System.out.println("");
                    break;
                case 2:
                    leer.nextLine();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("...");
                    break;
                case 5:
                    leer.nextLine();
                    System.out.println("");
                    break;
                case 6:
                    leer.nextLine();
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("...");
                    break;
                default:
                    System.out.println("Ingresa una opcion correcta");
            }
        }while (op != 8);{
            leer.close();
        }
    }
}
