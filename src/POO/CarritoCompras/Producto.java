package POO.CarritoCompras;

public abstract class Producto implements Vendible {
    protected String nombre;
    protected double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }


}
