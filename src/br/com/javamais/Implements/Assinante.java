package br.com.javamais.Implements;

import br.com.javamais.interfaces.IAssinante;
 
/*
 * @author javamais.com.br 
 */
 
public class Assinante implements IAssinante{

   private final Revista revista;
   private String nome;

   
    public Assinante(Revista revista) {
        this.revista = revista;
        revista.registerAssinante(this);
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void informar() {
        System.out.println(this.getNome() + ": Notificação de nova publicação!");
    }
   
   
   



}
