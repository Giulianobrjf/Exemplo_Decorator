package org.example;

public class Polimento extends LavagemDecorator {

    public Polimento(Lavagem lavagem ) {
        super(lavagem);
    }

    public float getValor() {
        return 50.0f;
    }
    public String getNomeServico() {
        return "Polimento";
    }

}