package POO.Mascota;

public class MascotaVirtual {
    //Atributos
    private String Nombre;
    private int energia, humor, cantComer;
    private double peso;
    private boolean dormido;

    private final double maxEnergia = 100;
    private final double minEnergia = 0;

    public MascotaVirtual(String nombre, int energia, int humor, int cantComer, double peso, boolean dormido) {
        Nombre = nombre;
        this.energia = energia;
        this.humor = humor;
        this.cantComer = cantComer;
        this.peso = peso;
        this.dormido = dormido;
    }
    public String getNombre() {
        return Nombre;
    }

    public int getHumor() {
        return humor;
    }

    public int getCantComer() {
        return cantComer;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isDormido() {
        return dormido;
    }

    public double getMaxEnergia() {
        return maxEnergia;
    }

    public double getMinEnergia() {
        return minEnergia;
    }
    public void comer() {
        energia++;
        peso++;
    }

    public boolean dormir() {

        return dormido = true;
    }

    public boolean despertar() {
        return dormido = false;
    }



    public void caminar() {
        energia--;
        peso--;
        humor++;
    }

    public void correr() {
        energia--;
        peso--;
        humor++;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean estaVivo() {
        if (energia > minEnergia) {
            return true;
        }
        return false;

    }
}
