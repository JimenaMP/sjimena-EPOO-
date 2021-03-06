/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;


/**
 *
 * @author jimenameloplaza
 */
public class Mensajito {
    
    /*ESTA ES UNA CLASE TIPO ENTIDAD,
    GENERA UNA ENTIDAD DE TIPO MONGO :)
    */
    @Id
    String id;
    String titulo;
    String cuerpo;
    LocalDate fecha;
    
    //Actualizar la de mongo DB

    public Mensajito(String id, String titulo, String cuerpo, LocalDate fecha) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    //con ESTO : ya nos va a mostrar lo que contienen los mensajes, no la
    //direccion de memoria en mongo DB
    @Override
    public String toString() {
        return "Mensajito{" + "id=" + id + ", titulo=" + titulo + ", cuerpo=" + cuerpo + ", fecha=" + fecha + '}';
    }
    
    public Mensajito() {
    }

    public Mensajito(String titulo, String cuerpo, LocalDate fecha) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
    


