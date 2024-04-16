package org.example;

public abstract class LavagemDecorator implements Lavagem{

    private Lavagem lavagem;
    public String descricaoServico;

    public LavagemDecorator(Lavagem lavagem) {
        this.lavagem = lavagem;
    }

    public Lavagem getLavagem() {
        return lavagem;
    }

    public void setLavagem(Lavagem lavagem) {
        this.lavagem = lavagem;
    }

    public abstract String getDescricaoServico();

    public String getEstrutura() {
        return this.lavagem.getDescricaoServico() + "," + this.getDescricaoServico();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
