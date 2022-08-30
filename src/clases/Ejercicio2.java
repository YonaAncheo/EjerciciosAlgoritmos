package clases;

import java.util.Scanner;

public class Ejercicio2 {

//    Determine el Impuesto a pagar de un trabajador, considerando que si la persona gana menos de $10.000, no paga impuesto 
//    y que en los siguientes casos si pagará impuesto, el cual será en base al sueldo
    //metodo sueldo entre 10000 y 30000, 10% impuesto
    public float PrimerImpuesto(float sueldoUsuario) {

        float impuestoAplicado;
        impuestoAplicado = sueldoUsuario * 0.1f;
        return impuestoAplicado;
    }

    //metodo sueldo entre 30000 y 50000, 20% impuesto
    public float SegundoImpuesto(float sueldoUsuario) {

        float impuestoAplicado;
        impuestoAplicado = sueldoUsuario * 0.2f;
        return impuestoAplicado;
    }

    //metodo sueldo mas de 50000, 35% impuesto
    public float TercerImpuesto(float sueldoUsuario) {

        float impuestoAplicado;
        impuestoAplicado = sueldoUsuario * 0.35f;
        return impuestoAplicado;
    }

    //metodo para que realizará el algorito
    public void Impuestos(float sueldoUsuario) {
        float impuesto;

        if (sueldoUsuario <= 10000) {
            System.out.println("El sueldo final es: " + sueldoUsuario);
            System.out.println("No corresponde impuesto");

        } else if (sueldoUsuario > 10000 && sueldoUsuario <= 30000) {
            impuesto = PrimerImpuesto(sueldoUsuario);
            System.out.println("El sueldo final es: " + (sueldoUsuario - impuesto));
            System.out.println("El impuesto aplicado es: " + impuesto);

        } else if (sueldoUsuario > 30000 && sueldoUsuario <= 50000) {
            impuesto = SegundoImpuesto(sueldoUsuario);
            System.out.println("El sueldo final es: " + (sueldoUsuario - impuesto));
            System.out.println("El impuesto aplicado es: " + impuesto);

        } else if (sueldoUsuario > 50000) {
            impuesto = TercerImpuesto(sueldoUsuario);
            System.out.println("El sueldo final es: " + (sueldoUsuario - impuesto));
            System.out.println("El impuesto aplicado es: " + impuesto);

        }

    }

    //metodo para finalizar programa
    public boolean Finalizar(int flag) {

        if (flag == 1) {
            return true;
        } else {
            return false;

        }

    }

    public static void main(String[] args) {
        float sueldo;
        int finalizar;
        Scanner in = new Scanner(System.in);
        Ejercicio2 robot = new Ejercicio2();

        do {
            System.out.print("Ingrese su sueldo: ");
            sueldo = in.nextFloat();
            System.out.println("---------------------------------------------");

            robot.Impuestos(sueldo);
            System.out.println("Desea finalizar el progroma?");
            System.out.println("1 para no / 2 para si finalizar");
            finalizar = in.nextInt();
            
            System.out.println("---------------------------------------------");

        } while (robot.Finalizar(finalizar) == true);

    }
}
