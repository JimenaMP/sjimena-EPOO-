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
public interface RepositorioClientes extends MongoRepository <Cliente, String>{
    ArrayList<Cliente>findByNombre(String nombre);
    
}
