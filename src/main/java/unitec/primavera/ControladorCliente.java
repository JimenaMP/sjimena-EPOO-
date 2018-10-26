/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jimenameloplaza
 */
@RestController
@RequestMapping ("/api")
public class ControladorCliente {
    @Autowired RepositorioClientes clientito;
    
    //buscar todos
    @GetMapping(path="/cliente")
    public List <Cliente> todos()
    {
        return clientito.findAll();
    }
    
    //buscar por id
    @GetMapping(path="/cliente{id}")
    public Cliente buscarPorId(@PathVariable String id)
    {
        return clientito.findById(id).get();
    }
    
    //guardar un cliente:
    @PostMapping(path="/cliente", consumes="application/json")
    public Status guardar (@RequestBody String json) throws Exception
    {
        ObjectMapper maper=new ObjectMapper();
        Cliente cliente=maper.readValue(json, Cliente.class);
        System.out.println(cliente);
        Status status=new Status();
        status.setSuccess(true);
        status.setMensaje("Cliente guardado con exito!!");
        return status;
    }
    
}
