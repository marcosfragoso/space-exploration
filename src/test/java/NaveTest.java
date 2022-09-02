import domain.Nave;
import domain.Planeta;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class NaveTest {
    @Test
    public void deveFicarADerivaQuandoFaltarCombustivelParaIrAteUmPlaneta(){
        int posicaoEsperada = 3;
        Nave milleniumFalcon = new Nave(9);
        Planeta tatooine = new Planeta(4, new ArrayList<>());

        milleniumFalcon.explorar(tatooine);
        int posicaoResultante = milleniumFalcon.getPosicao();

        Assert.assertEquals(posicaoEsperada, posicaoResultante);
    }
    @Test
    public void deveConseguirChegarAteUmPlanetaEVoltar(){
        int posicaoEsperada = 0;
        Nave milleniumFalcon = new Nave(999);
        Planeta tatooine = new Planeta(4, new ArrayList<>());

        milleniumFalcon.explorar(tatooine);
        int posicaoResultante = milleniumFalcon.getPosicao();

        Assert.assertEquals(posicaoEsperada, posicaoResultante);
    }
    @Test
    public void deveConseguirChegarAteUmPlanetaENaoVoltar(){
        int posicaoEsperada = 3;
        Nave milleniumFalcon = new Nave(15);
        Planeta tatooine = new Planeta(4, new ArrayList<>());

        milleniumFalcon.explorar(tatooine);
        int posicaoResultante = milleniumFalcon.getPosicao();

        Assert.assertEquals(posicaoEsperada, posicaoResultante);
    }
}
