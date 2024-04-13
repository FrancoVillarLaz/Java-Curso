package POO.CarritoCompras;

public abstract class Producto {
    String nombre;
    double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    abstract double calcularPrecio(Producto producto, String t);
}
