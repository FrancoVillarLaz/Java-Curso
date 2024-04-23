package POO.CarritoCompras;

public  class Ropa extends Producto {

    final String[] Talles= {"S","M","L","XL"};
    String talle;

    public Ropa(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecio(Producto producto, String t) {

        return precioBase;
    }
}
