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
    
    public static void main(String[] args) {
		SpringApplication.run(PrimaveraApplication.class, args);
                
                
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola");
        repoPagos.servicioPagar(); 
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
       
       repoMensa.save(new Mensajito ("Malito","titulo actualizado","jimena22",LocalDate.now()));
       System.out.println( repoMensa.findByTitulo("titulo actualizado"));
       
      
    }
}