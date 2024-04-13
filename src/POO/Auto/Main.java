package POO.Auto;

public class Main {
    public static void main(String[] args) {
        Auto autoUno = new Auto("uno", "fiat", "rojo", 1998);

//        autoUno.marca = "fiat";
//        autoUno.modelo = "uno";
//        autoUno.año= 1998;
//        autoUno.color = "rojo";

        System.out.println(autoUno.marca);
        System.out.println(autoUno.modelo);
        System.out.println(autoUno.año);
        System.out.println(autoUno.color);

        autoUno.acelerar();

        System.out.println(autoUno.velocidadActual);

        autoUno.frenar();

        System.out.println(autoUno.velocidadActual);

        autoUno.cargarCombustible();
        autoUno.cargarCombustible();
    }
}
