package org.example;

public abstract class LavagemDecorator implements Lavagem{

    private Lavagem lavagem;
    public String servico;

    public LavagemDecorator(Lavagem lavagem) {
        this.lavagem = lavagem;
    }

    public Lavagem getLavagem() {
        return lavagem;
    }

    public void setLavagem(Lavagem lavagem) {
        this.lavagem = lavagem;
    }

    public abstract float getValor();
    @Override
    public float getValorTotalLavagem() {
        return this.lavagem.getValorTotalLavagem()  + (this.getValor());
    }

    public abstract String getNomeServico();
    @Override
    public String getServico() {
        return this.lavagem.getServico() + "/" + this.getNomeServico();
    }

    public void setServico(String servico){
        this.servico = servico;
    }
}