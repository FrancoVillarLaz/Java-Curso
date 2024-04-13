package Arrays;

import java.util.Scanner;

public class registroContactos {
    /*
    **Aplicación de Registro de Contactos**

    Diseña una aplicación que permita a un usuario administrar una lista de contactos.
    La aplicación deberá ser capaz de agregar nuevos contactos, buscar contactos existentes y
    mostrar la lista de todos los contactos almacenados. Utiliza dos arrays: uno para los nombres de los contactos y otro para los números de teléfono.

    La aplicación debe incluir las siguientes funciones:

    1. **`agregarContacto`**: Esta función debe permitir al usuario ingresar un nombre y un
          número de teléfono para un nuevo contacto y agregarlos a la lista de contactos.
    2. **`buscarContacto`**: Esta función debe permitir al usuario buscar un contacto por nombre y
          mostrar la información del contacto si se encuentra. De lo contrario, mostrar un mensaje indicando que el contacto no se encontró.
    3. **`mostrarContactos`**: Esta función debe mostrar la lista completa de contactos
          con sus nombres y números de teléfono.

    El programa principal debe proporcionar un menú interactivo que permita al usuario
    seleccionar estas opciones y realizar las operaciones deseadas. Asegúrate de
    gestionar adecuadamente la capacidad de almacenamiento de contactos y proporcionar
    salidas claras y comprensibles.
     */
    public static void main(String[] Args){
        Scanner leer = new Scanner(System.in);
        int op;
        do {
            System.out.println("eliga opcion 1-Agregar Contacto, 2-Buscar un contacto, 3-Mostrar contactos, 4-Salir");
            System.out.println("ingrese el valor: ");
            op = leer.nextInt();
            switch (op){
                case 1:
                    leer.nextLine();
                    System.out.println("Agregar contacto");
                    System.out.println("Ingrese el nombre: ");
                    String nombre=leer.nextLine();

                    System.out.println("Ingese el numero de telefono del contacto: ");
                    String telefono=leer.nextLine();
                    agregarContacto(nombre,telefono);
                    break;
                case 2:
                    leer.nextLine();
                    System.out.println("Buscar contacto");
                    System.out.println("Ingrese nombre del contacto");
                    String nombreBuscar=leer.nextLine();
                    buscarContacto(nombreBuscar);
                    break;
                case 3:
                    System.out.println("Mostrar contactos");
                    mostrarContactos();
                    break;
                case 4:
                    System.out.println("...");
                    break;
                default:
                    System.out.println("Ingresa una opcion correcta");
            }
        }while (op != 4);{

        }
    }
    private static String[] nombreContactos=new String[100];
    private static String[] telefonoContactos=new String[100];
    private static int cantidadContactos = 0;
    public static void agregarContacto(String nombre,String telefono){
        nombreContactos[cantidadContactos]=nombre;
        telefonoContactos[cantidadContactos]=telefono;
        cantidadContactos++;

        System.out.println("Contacto creado correctamente");
    }

    public static void buscarContacto(String nombre){
        boolean encontrado=false;
        for (int i = 0; i < cantidadContactos; i++) {
            if (nombreContactos[i].equalsIgnoreCase(nombre)){
                System.out.println("Nombre: "+nombreContactos[i]+" Telefono: "+telefonoContactos[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro el contacto");
        }
    }
    public static void mostrarContactos(){
        System.out.println("Lista de contactos");
        for (int i = 0; i < cantidadContactos; i++) {
            System.out.println(i+" - "+nombreContactos[i]+" - "+telefonoContactos[i]);
        }
    }
}