package POO.CarritoCompras;
import java.util.*;
public class CarritoCompra {

    private List<Vendible> productos;

    public CarritoCompra() {
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Vendible producto){
       productos.add(producto);
    }
    public double calcularTotal(Cliente cliente){
        double total=0;
        for (Vendible producto : productos){
            total += producto.calcularPrecio();
        }
        if (cliente.esPremium()){
            return total *= 0.1;
        }
        return total;
    }
}
