/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

/**
 *
 * @author jimenameloplaza
 */
public class TarjetaDebito extends Tarjeta implements Pagos{
    /*Para la herencia: lleva el EXTENDS*/
   
    /*@Override 
    Notacion, el override sobreeescribe, se pone como seguridad
    por que como tiene el metodo absttacto se pasa, si no le damos cuerpo nos
    manda error. Nos dice que tenemos que poner exactamente el mismo metodo
    ESTE NOS AYUDA A SABER QUE ESTAMOS ESCRIBIENDO TAL CUAL EL METODO
    */
    @Override
    public void pagar()
    {
        System.out.println("Pagando debito");
    }
}
