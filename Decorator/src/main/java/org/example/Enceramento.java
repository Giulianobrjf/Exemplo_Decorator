package org.example;

public class Enceramento extends LavagemDecorator {

    public Enceramento(Lavagem lavagem ) {
        super(lavagem);
    }

    public float getValor() {
        return 30.0f;
    }
    public String getNomeServico() {
        return "Enceramento";
    }

}