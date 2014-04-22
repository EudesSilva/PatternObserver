 
package br.com.javamais.observer;

import br.com.javamais.Implements.Assinante;
import br.com.javamais.Implements.Revista;

/*
 * @author javamais.com.br
 */
public class Observer {

 
    public static void main(String[] args) {
       
        Revista revista = new Revista();
        
        Assinante assinante1 = new Assinante(revista);
        assinante1.setNome("Ada Lovelace"); 
        Assinante assinante2 = new Assinante(revista);
        assinante2.setNome("James Gosling");
        Assinante assinante3 = new Assinante(revista);
        assinante3.setNome("Denis Ritchie");   
        Assinante assinante4 = new Assinante(revista);
        assinante4.setNome("Larry Page"); 

        revista.setPublicacao("1ª Edição - A explosão das tecnologias");
        
        
    }
    
}
