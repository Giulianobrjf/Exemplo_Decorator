package org.example;

public  class LavagemPremium implements Lavagem{
    public float valorTotalLavagem;
    public LavagemPremium() {
    }
    public LavagemPremium(float valorTotalLavagem) {
        this.valorTotalLavagem = valorTotalLavagem;
    }
    @Override
    public float getValorTotalLavagem() {
        return valorTotalLavagem;
    }

    @Override
    public String getServico() {
        return "Lavagem Premium";
    }
}
