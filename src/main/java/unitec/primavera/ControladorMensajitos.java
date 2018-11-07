/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/api")

//Dejando entrar el dominio de stackblitz, para solo lectura (select)
@CrossOrigin(origins={"https://angular-bqjzew.stackblitz.io"})
public class ControladorMensajitos {
    //Mi primer hola mundo desde REST API con spring
    @Autowired RepositorioMensajes mensa;
   
    @GetMapping(path="/hola") 
    //construccion de la primer api, la primer URI
    //no se pueden duplicar
    //servicio mapeado con el metodo get en mongoDB
    public String hola()
    {
        return "Hola mundo";
        
        //localhost:9000/api/hola y veriamos el Hola Mundo EN POSTMAN :)
        //con el metodo GET
    }
    
    
    
    // BUSCAMOS TODOS
     @GetMapping(path="/mensaje") //Metoodo qu eva a mostrat todos los mensajes
     public List<Mensajito> todos() //List es el papa de ArrayList, es generico
     {
         //el tipo de retorno sera de tipo mensaje, todos los que ecunetre
         //hace un arreglo tipo JSON.
         return mensa.findAll(); //para que muestre todo :)
     }
     
     
     //BUSCAMOS POR ID
     
     @GetMapping(path="/mensaje/{id}") //conservamos la entidad mensaje
     //las llaves quieren decir que el id que nos regresa es el
     //QUE NOSOTROS LE VAMOS A PROPORCIONAR, EL USUARIO LO ELIGE
     //si no existe el id, nos regresa el objeto vacio
     public Mensajito buscarPorId(@PathVariable String id)
             //pathvariable es que es un id de ruta, es String, por que como
             //vimos la clase anterior, el id es string, por eso es igual
             //el siguiente id, es el mismo id que escribimos arriba entre {}
             
             //es public Mensajito, por que va a regresarnos UN SOLO ID
             //pues son unicos, no arrays, no list, es 1 solo Mensaje
     {
         return mensa.findById(id).get();
     }
     
     //tiene que estar abierto el postman :)
     //para guardar se ocupa S I E M P R E EL POST 
     @PostMapping(path="/mensaje", consumes="application/json")
     
     //son 2 argumentos, la< entidad del mensaje y el consumes
     //por que estamos consumiendo un json, en las apps se consume y se da
     public Status guardar(@RequestBody String json) throws Exception 
     {
          
     //throws exception por si el json que mandamos va mal formado...
     
     //con eso se quita el error de abajo del mapper 
         //Status es el tipo de retorno
         //request body es el "cuerpo" de lo que nosottos enviamos al servidor
         //por ejemplo en un login, nosotros enviamos ese request al autenticarnos
         //es de tipo json, es de fromato string json
         
         //recibimos a json con los brazos abiertos !!!
         ObjectMapper maper=new ObjectMapper();
         
         //la clase ObjectMapper es normal en estas apps.
         //es un objeto mapeador que convierte de json a java y de java a json
         Mensajito mensajito = maper.readValue(json, Mensajito.class);
         
         //tiene 2 argumentos
         //el primero que es el string de json
         //el segundo es el que lo convierte a un objeto de tipo e la clase Mensajito
         //la excepcion que saldria seria el bad Request....
         System.out.println (mensajito);
         Status status=new Status();
         status.setSuccess(true);
         status.setMensaje("Mensajito guardado con exitoo!!:)");
         return status;
     }
    }




