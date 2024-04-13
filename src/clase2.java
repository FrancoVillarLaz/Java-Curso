import java.util.Scanner;

public class clase2 {
    public static void main(String[] args) {
        //Ejercicio 1
        double peso, altura, imc;
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese su peso en Ej: 70");
        peso = leer.nextDouble();
        System.out.println("ingrese su altura Ej: 1,70");
        altura = leer.nextDouble();

        imc = peso / Math.pow(altura, 2);

        if (imc < 18) {
            System.out.println("bajo peso");
        } else if (imc < 25 && imc > 18) {
            System.out.println("normal");
        } else if (imc > 25 && imc < 30) {
            System.out.println("sobre peso");
        } else if (imc > 30) {
            System.out.println("sobre peso");
        }

        //ejercicio 2

        double ars, usd;
        System.out.println("ingrese monto en pesos");
        ars = leer.nextDouble();
        usd = ars * 0.0012;
        System.out.println("su pesos equivalen a " + usd + " dolares");

        //Ejercicio 3
        String contraseña, contraseña2;
        System.out.println("ingresa una contraseña de por lo menos 5 caracteres");
        contraseña = leer.next();
        System.out.println("repite la contraseña");
        contraseña2 = leer.next();


        if (contraseña.length() > 5 && contraseña.equals(contraseña2)) {
            System.out.println("Contraseña creada");
        } else if (contraseña.length() < 5) {
            System.out.println("La contraseña es demaciado corta");
        } else if (!contraseña.equals(contraseña2)) {
            System.out.println("las ocntraseña son distintas");
        }

        int num1, num2, num3;
        System.out.println("ingrese su primer numero");
        num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = leer.nextInt();
        System.out.println("ingrese el tercer numero");
        num3 = leer.nextInt();
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else if (num3 > num2 && num3 > num1) {
            if (num2 > num1) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else {
                System.out.println(num3 + " " + num1 + " " + num2);
            }
        }
    }
}
