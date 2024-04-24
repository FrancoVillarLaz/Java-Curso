package POO.CarritoCompras;

public class Electronico extends Producto{
    String talle;

    public Electronico(String nombre, double precioBase, String talle) {
        super(nombre, precioBase);
        this.talle=talle;
    }

    @Override
    public double calcularPrecio() {

        return precioBase *1.5;
    }
}
