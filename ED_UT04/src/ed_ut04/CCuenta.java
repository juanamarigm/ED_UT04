/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_ut04;

/**
 *
 * @author Juana María
 */
public class CCuenta {

    private String nombre; 
    private String cc;
    private String pass; //contraseña del acceso web
    private double saldo;
    private double tipoInteres;


    /**
     *
     * @param nom nombre del propietario de la cuenta
     * @param cue Cuenta Corriente
     * @param sal salario de la cuenta
     * @param tipo tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cc = cue;
        saldo = sal;
        tipoInteres=tipo;
    }

    /**
     *
     * @return saldo de la cuenta
     */
    public double sueldo() {
        return getSaldo();
    }

    /**
     *
     * @param cantidad Cantidad a ingresar
     * @throws Exception excepción en caso de que la cantidad a ingresar sea negativa
     */
    public void ing(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        this.saldo=(getSaldo() + cantidad);
    }

    /**
     *
     * @param cantidad Cantidad a ingresar
     * @throws Exception excepción en caso de que no haya suficiente saldo para retirar esa cantidad
     */
    public void ret(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (sueldo() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        this.saldo=(getSaldo() - cantidad);
    }

    /**
     *
     * @param tantoPorCiento Porcentaje que se desea calcular de ese saldo
     * @return saldo calculado
     */
    public double porcentaje(double tantoPorCiento) {
        return getSaldo() * tantoPorCiento / 100;
    }

    /**
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Nuevo nombre para el cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return nuestra el número de cuenta
     */
    public String getCc() {
        return cc;
    }

    /**
     * @return Muestra la contraseña de la cuenta
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param antigua contraseña antigua de la cuenta, para comprobarla
     * @param nueva nueva contraseña de la cuenta, para cambiarla
     */
    public void setPass(String antigua, String nueva) {
      int cont=1;
      boolean correcta=false;
      while (cont<3 && !correcta){
          if (antigua.equals(this.getPass())){
              correcta=true;
              this.pass=nueva;
          }else cont++;
      }
    }

    /**
     * @return muestra el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return muestra la cantidad de intereses de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }


    
    
}
