
package br.com.javamais.interfaces;
 
/*
 * @author javamais.com.br
 */
 
public interface IRevista {

     void registerAssinante(IAssinante assinante);
     void removeAssinante(IAssinante assinante);
     void notifyAllAssinante();
     

}
