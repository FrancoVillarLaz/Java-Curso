package POO.CuentaBancaria;

public class CuentaBancaria {
//    Ejercicio 1: Clase "Cuenta Bancaria"
/*    Diseña una clase "CuentaBancaria" que contenga atributos como el número de cuenta y el saldo. Implementa métodos para depositar,
retirar y consultar saldo.
En el método main, crea una instancia de "CuentaBancaria", realiza depósitos y retiros, y muestra el saldo actual.
 */
    int numCuenta;
    float saldo;

    public CuentaBancaria(int numCuenta, float saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public void depositar (float monto){
        if (monto>0) {
            this.saldo = this.saldo + monto;
        }
    }
    public void retirar (float monto){
        if (monto<=saldo && monto>0) {
            this.saldo = this.saldo - monto;
        } else{
            System.out.println("saldo insuficiente");
        }
    }
    public void consultarSaldo (){
        System.out.println("saldo:"+ this.saldo);
    }

    public void transferencia(CuentaBancaria destino, int monto){
        if (monto<=saldo && monto>0) {
            this.saldo = this.saldo - monto;
            destino.depositar(monto);
            System.out.println("Transferiste "+monto+" a la cuenta"+destino.getClass().getSimpleName()+" desde la cuenta: "+this.numCuenta);
        } else{
            System.out.println("saldo insuficiente");
        }

    }
}
