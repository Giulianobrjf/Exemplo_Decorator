package org.example;

public class Limpeza extends LavagemDecorator {

    public Limpeza(Lavagem lavagem ) {
        super(lavagem);
    }

    public float getValor() {
        return 50.0f;
    }
    public String getNomeServico() {
        return "Limpeza Interna";
    }

}