/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

import org.springframework.data.annotation.Id;

/**
 *
 * @author jimenameloplaza
 */
public class Cliente {
    @Id
    private String Id;
    private String nombre;
    private String mail;
    private Direccion direccion;

    @Override
    public String toString() {
        return "Cliente{" + "Id=" + Id + ", nombre=" + nombre + ", mail=" + mail + ", direccion=" + direccion + '}';
    }
    
    

    public Cliente(String Id, String nombre, String mail, Direccion direccion) {
        this.Id = Id;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
    }
    
    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    
}
