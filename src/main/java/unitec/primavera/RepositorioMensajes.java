/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

import java.util.ArrayList;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author jimenameloplaza
 */
public interface RepositorioMensajes extends MongoRepository<Mensajito, String> {
    
    
    //metodo para buscar pot titulo.
    /*Cuando buscamos por titulo, vamos a tener varias salidas
    si buscamos especificamnete de un titulo, necesitamos poner
    en el metodo le tipo de retorno que nosotros queremos...*/
    
    //CUANDO ES BUSQUEDA, ES CON LA PALABRA f i n d.
    
    //TENEMOS QUE PONER UN CAMPO QUE EXISTA, QUE TENGA LA ENTIDAD B y.
    
    //Y EL CAMPO A BUSACR, EMPEZANDO POR MAYUSCULA, SIEMPRE Y CUANDO EL ATRIBUTO
    
    //QUE ESCRIBIMOS EN LA CLASE ESTE EN MINUSCULA
    
    //Y EL TIPO DE DATO DEL ARGUMENTO QUE ESTAMOS BUSCANDO s t r i n g
    
    //NO LLEVA LOGICA, POR QUE ES UNA INTERFAZ.
    
    //LOS METODOS NO LLEVAN LOGICA
    
        ArrayList<Mensajito> findByTitulo(String titulo);
}
