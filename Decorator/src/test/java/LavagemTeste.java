import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LavagemTeste {

    @Test
    public void deveRetornarValorTotalLavagem() {
        Lavagem lavagem = new LavagemPremium(10.0f);

        assertEquals(10.0f, lavagem.getValorTotalLavagem());
    }

    @Test
    public void deveRetornarValorTotalLavagemComEnceramento() {
        Lavagem lavagem = new Enceramento(new LavagemPremium(50.0f));

        assertEquals(80.0f, lavagem.getValorTotalLavagem());
    }

    @Test
    public void deveRetornarValorTotalLavagemComPolimento() {
        Lavagem lavagem = new Polimento(new LavagemPremium(50.0f));

        assertEquals(100.0f, lavagem.getValorTotalLavagem());
    }

    @Test
    public void deveRetornarValorTotalLavagemComLimpeza() {
        Lavagem lavagem = new Limpeza(new LavagemPremium(50.0f));

        assertEquals(100.0f, lavagem.getValorTotalLavagem());
    }

    @Test
    public void deveRetornarValorTotalLavagemComEnceramentoEPolimento() {
        Lavagem lavagem = new Polimento(new Enceramento(new LavagemPremium(100.0f)));

        assertEquals(180.0f, lavagem.getValorTotalLavagem());
    }

    @Test
    public void deveRetornarValorTotalLavagemComEnceramentoELimpeza() {
        Lavagem lavagem = new Limpeza(new Enceramento(new LavagemPremium(70.0f)));

        assertEquals(150.0f, lavagem.getValorTotalLavagem());
    }

    @Test
    public void deveRetornarValorTotalLavagemComPolimentoELimpeza() {
        Lavagem lavagem = new Limpeza(new Polimento(new LavagemPremium(30.0f)));

        assertEquals(130.0f, lavagem.getValorTotalLavagem());
    }

    @Test
    public void deveRetornarValorTotalLavagemComEnceramentoPolimentoELimpeza() {
        Lavagem lavagem = new Limpeza(new Polimento(new Enceramento(new LavagemPremium(60.0f))));

        assertEquals(190.0f, lavagem.getValorTotalLavagem());
    }
}