package POO.CarritoCompras;

public  class Ropa extends Producto {
    String[] tallas={"XS","S","M","L","XL","XXL","XXXL"};
    double[] precios={0.3,0.4,0.5,0.6,0.7,0.8,0.9};
    String talle;

    public Ropa(String nombre, double precioBase, String talle) {
        super(nombre, precioBase);
        this.talle=talle;

    }

    @Override
    public double calcularPrecio() {
        for (int i = 0; i < tallas.length; i++) {
            if (talle.equalsIgnoreCase(tallas[i])){
                precioBase *=precios[i];
            }else{
                 
            }
        }
        return precioBase;
    }
}
