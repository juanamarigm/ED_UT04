/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ed_ut04;

/**
 *
 * @author alumno
 */
public class Main {

    public static void main(String[] args) {
        CCuenta a;
        double saldoA;

        a = new CCuenta("Felipe Segundo","2222-2222-22-1230456789", 2222,0);
        saldoA = a.getSaldo();
        System.out.println("El saldo actual es"+ saldoA );

        Retirada(a, 2300);
        Ingreso(a, 300);
        toString(a);
    }

    /**
     *
     * @param a Cuenta Corriente de la que voy a mostrar los datos
     */
    public static void toString(CCuenta a) {
        System.out.println("Datos de la cuenta: "+ a.getNombre() + a.getCc() + a.getSaldo() + a.getTipoInteres());
    }

    /**
     *
     * @param a Cuenta Corriente
     * @param cantidad Cantidad a ingresar
     */
    public static void Ingreso(CCuenta a, double cantidad) {
        try {
            System.out.println("Ingreso en cuenta");
            a.ing(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    /**
     *
     * @param a Cuenta Corriente
     * @param cantidad Cantidad a retirar
     */
    public static void Retirada(CCuenta a, int cantidad) {
        try {
            a.ret(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
    }
}
