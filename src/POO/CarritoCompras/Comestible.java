package POO.CarritoCompras;

public class Comestible extends Producto{

    int diasvencimiento;

    public Comestible(String nombre, double precioBase, int diasvencimiento) {
        super(nombre, precioBase);
        this.diasvencimiento=diasvencimiento;
    }

    @Override
    public double calcularPrecio() {

        return precioBase *1.3;
    }
}
