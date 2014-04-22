package br.com.javamais.implementations;

import br.com.javamais.interfaces.IAssinante;
import br.com.javamais.interfaces.IRevista;
import java.util.ArrayList;
import java.util.List;

/*
 * @author javamais.com.br 
 */

public class Revista implements IRevista{

    private final List<IAssinante> assinantes = new ArrayList<>();
    private String publicacao;

    @Override
    public void registerAssinante(IAssinante assinante) {
       assinantes.add(assinante);
    }

    @Override
    public void removeAssinante(IAssinante assinante) {
        assinantes.remove(assinante);
    }

    @Override
    public void notifyAllAssinante() {
        for (IAssinante assinante : assinantes) {
            assinante.informar();
        }
    }

    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
        notifyAllAssinante();
    }



    


}
