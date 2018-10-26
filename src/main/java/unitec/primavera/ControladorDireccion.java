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
@RequestMapping("/api")
public class ControladorDireccion {
    //Verificando que esta marinola funciona... REST API con spring
    
    @Autowired RepositorioDireccion dir;
    
    @GetMapping(path="/addresses") 
    
    //construccion de la primer api, la primer URI
    //no se pueden duplicar
    //servicio mapeado con el metodo get en mongoDB
    
    public String porfaFunciona()
    {
        return "Si sirve we :v";
        
        //localhost:9000/api/addresses y veriamos el Hola Mundo EN POSTMAN :)
        //con el metodo GET
    }
    
    // BUSCAMOS TODOS
     @GetMapping(path="/address") //Metoodo qu eva a mostrat todas las direcciones
     public List<Direccion> todos() //List es el papa de ArrayList, es generico
     {
         //el tipo de retorno sera de tipo mensaje, todos los que ecunetre
         //hace un arreglo tipo JSON.
         return dir.findAll(); //para que muestre todo :)
     }
     
     
     //BUSCAMOS POR ID
     
     @GetMapping(path="/address/{id}") 
     /*conservamos la entidad address de la direccion,
     las llaves quieren decir que el id que nos regresa es el
     QUE NOSOTROS LE VAMOS A PROPORCIONAR, EL USUARIO LO ELIGE
     si no existe el id, nos regresa el objeto vacio*/
     
     public Direccion buscarPorId(@PathVariable String id)
             
             /*pathvariable es que es un id de ruta, es String, por que como
             vimos la clase anterior, el id es string, por eso es igual
             el siguiente id, es el mismo id que escribimos arriba entre {}
             
             es public Direccion, por que va a regresarnos UN SOLO ID
             pues son unicos, no arrays, no list, es 1 sola Direccion*/
     {
         return dir.findById(id).get();
     }
     
      @PostMapping(path="/address", consumes="application/json")
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
         Direccion direccion = maper.readValue(json, Direccion.class);
         
         //tiene 2 argumentos
         //el primero que es el string de json
         //el segundo es el que lo convierte a un objeto de tipo e la clase Mensajito
         //la excepcion que saldria seria el bad Request....
         System.out.println (direccion);
         Status status=new Status();
         status.setSuccess(true);
         status.setMensaje("Direccion guardada con exitoo!!:)");
         return status;
     }
}
