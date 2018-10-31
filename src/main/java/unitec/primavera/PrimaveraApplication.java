package unitec.primavera;


import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaveraApplication implements CommandLineRunner{

    @Autowired RepositorioPagos repoPagos;
    @Autowired RepositorioMensajes repoMensa;
    
    
    //E N T R E G A B L E 3 :
    
    @Autowired RepositorioClientes repoClientes;
    @Autowired RepositorioDireccion repoDir;
    
    
    public static void main(String[] args) {
		SpringApplication.run(PrimaveraApplication.class, args);
                
                
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola");
        //repoPagos.servicioPagar(); 
        /*la linea de abajo es la que va guardando los registros, el titulo es el
        primer valor, el segundo es el cuerpo del mensaje y el ultimo
        la fecha en tiempo real*/
        
        //esta linea guarda mensaje:
        //repoMensa.save(new Mensajito("malo","JimenaMalo", LocalDate.now()));
        
        
        //BUSCAR TODOS LOS MENSAJES
        //USANDO LIST, QUE VIMOS EN JAVA 2.
        //y el ciclo for mejorado, el tipo de dato que iteramos, 
        //todo lo que este en el arreglo findAll.
        //iteramos un objeto tipo mensa
        
       /* 
        for(Mensajito mensa: repoMensa.findAll())
        {
            System.out.println(mensa);
        }
        */
       
       //buscamos por ID
       
       //System.out.println( repoMensa.findById("5bb41eb1dd149203bac97b1c").get());
        
       
       //buscando por titulo.
       //System.out.println( repoMensa.findByTitulo("hola"));
       
       //actualizar:
       //repoMensa.save(new Mensajito ("Malito","titulo actualizado","jimena22",LocalDate.now()));
       //System.out.println( repoMensa.findByTitulo("titulo actualizado"));
       
       
       
       
       //E N T R E G A B L E 3 :
       
       //linea que va a guardar direcciones
       
      // repoDir.save(new Direccion ("Calle 13","Ecatepunkkk",1839));
      //System.out.println("Direccion guardada satisfactorismrnte");
      
      /*BUSCAR TODOAS LAS DIRECCIONES
        USANDO LIST, QUE VIMOS EN JAVA 2.
        y el ciclo for mejorado, el tipo de dato que iteramos, 
        todo lo que este en el arreglo findAll.
        iteramos un objeto tipo mensa*/
        
       /*
        for(Direccion dir: repoDir.findAll())
        {
            System.out.println(dir);
        }*/
       
       //buscamos por ID
       //System.out.println( repoDir.findById("5bcfb56ba7f83a0a5817eea0").get());
       
       
         //buscando por calle.
       //System.out.println( repoDir.findByCalle("calle 13"));
       
       //actualizar:
       //repoDir.save(new Direccion ("Calle 13","Neza",1234));
       //System.out.println( repoDir.findByCalle("Calle 13"));
       
       //guardando un cliente:
       //repoClientes.save(new Cliente ("Jimena","mail",Direccion.direccion));
       
       //Buscar todos
       /*for(Cliente cli: repoClientes.findAll())
       {
           System.out.println(cli);
       }
        
        //buscar por id:
        System.out.println(repoClientes.findById ("el id del cliente jeje").get());
        
        //buscar por nombre:
        System.out.println(repoClientes.findByNombre("Jimena"));
        
        //actualizar un cliente:
        //repoClientes.save(new Cliente ("Jimena nuebo","mail actualizafo", Direccion.direccion));
        System.out.println(repoClientes.findByNombre("Cliente Actualizado!!!"));
    }*/
    }
}