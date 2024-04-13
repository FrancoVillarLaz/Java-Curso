package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class analisisDeDatos {
    /*
    **Programa de Análisis de Datos**

    Diseña un programa en Java que permita a un usuario ingresar una serie de números y
    realice un análisis de esos datos.

    El programa debe incluir las siguientes funciones:

    1. **`encontrarMaximo`**: Esta función debe tomar un arreglo de números como
          entrada y encontrar el número máximo en el conjunto. Devuelve el número máximo encontrado.
    2. **`encontrarMinimo`**: Esta función debe tomar un arreglo de números como
          entrada y encontrar el número mínimo en el conjunto. Devuelve el número mínimo encontrado.
    3. **`calcularPromedio`**: Esta función debe calcular y devolver el promedio
          de los números en el conjunto.
    4. **`contarNumerosPares`**: Esta función debe contar la cantidad de números pares
          en el conjunto y devolver ese número.

    El programa principal debe realizar lo siguiente:

    - Solicitar al usuario la cantidad de números que desea ingresar.
    - Pedir al usuario que ingrese los números uno por uno y almacenarlos en un arreglo.
    - Utilizar las funciones mencionadas para calcular y mostrar lo siguiente:
        - El número máximo en el conjunto.
        - El número mínimo en el conjunto.
        - El promedio de los números en el conjunto.
        - La cantidad de números pares en el conjunto.

    El programa debe ser modular y utilizar las funciones mencionadas para llevar a cabo
    estas tareas. Asegúrate de manejar adecuadamente las entradas de usuario y proporcionar
    salidas claras y comprensibles.
     */

    public static void main(String[] Args){


        int[] numeros = ingresarNumeros();
        int numeroMayor= numeroMayor(numeros);
        int numeroMenor= numeroMenor(numeros);
        int promedio = promedio(numeros);
        int contarNumerosPares = contarNumerosPares(numeros);
        System.out.println("El numero mayor es: "+numeroMayor);
        System.out.println("El numero menor es: "+numeroMenor);
        System.out.println("El promedio de los numeros es "+promedio);
        System.out.println("La cantidad de numeros pares es de "+contarNumerosPares);


    }

    public static int[] ingresarNumeros(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese cantidad de numeros que desea ingresar");

        int cant=leer.nextInt();

        int [] numeros=new int[cant];

        System.out.println("ingrese sus numeros un por uno:");

        for (int i = 0; i < cant; i++) {

            int numero=leer.nextInt();

            numeros[i]=numero;

        }

        return numeros;
    }
    public static int numeroMayor(int[] numeros){
        Arrays.sort(numeros);
        int numeroMayor = numeros[numeros.length-1];
        System.out.println(numeroMayor);
        return numeroMayor;
    }
    public static int numeroMenor(int[] numeros){
        Arrays.sort(numeros);
        int numeroMenor = numeros[0];
        System.out.println(numeroMenor);
        return numeroMenor;
    }
   public static int promedio(int[] numeros) {
       int suma = 0;
       for (int i = 0; i < numeros.length; i++) {
           suma+=numeros[i];
       }
       int promedio = suma / numeros.length;
       return promedio;
   }
   public static int contarNumerosPares(int[] numeros){
        int cantidadPares=0;
        for (int i = 0; i < numeros.length; i++) {
           if (numeros[i]%2 == 0){
               cantidadPares ++;
           }
       }

    return cantidadPares;
   }
}