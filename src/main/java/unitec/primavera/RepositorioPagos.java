/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

import org.springframework.context.annotation.Configuration;

/**
 *
 * @author jimenameloplaza
 */
@Configuration
public class RepositorioPagos {
    void servicioPagar(){
        
        new  TarjetaNomina().pagar();
        /* ESTA LINEA ES LA INYECCION DE CONTROL, ESTA OCULTA LA IMPLEMTACION*/
}
    
}
