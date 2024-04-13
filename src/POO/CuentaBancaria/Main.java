package POO.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(13,1000);

        cuenta.consultarSaldo();
        cuenta.retirar(100);
        cuenta.consultarSaldo();
        cuenta.depositar(200);
        cuenta.consultarSaldo();
        cuenta.retirar(1100);
        cuenta.consultarSaldo();
        cuenta.retirar(-100);
        cuenta.consultarSaldo();



    }
}
