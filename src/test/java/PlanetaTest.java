import domain.Planeta;
import org.junit.Assert;
import org.junit.Test;
import util.RecursosEnum;

import java.util.ArrayList;
import java.util.Arrays;

public class PlanetaTest {
    @Test
    public void deveTerValorTotalZeradoQuandoNaoExistirNenhumRecurso(){
        // arrange
        Planeta tatooine = new Planeta(4, new ArrayList<>());
        int valorTotalEsperado = 0;
        // act
        int valorTotalResultante = tatooine.getTotal();
        // assert
        Assert.assertEquals(valorTotalEsperado, valorTotalResultante);
    }
    @Test
    public void deveTerValorTotalQuandoExistirRecursosNoPlaneta(){
        Planeta tatooine = new Planeta(4, Arrays.asList(RecursosEnum.AGUA, RecursosEnum.OURO));
        int valorTotalEsperado = 300;
        // act
        int valorTotalResultante = tatooine.getTotal();
        // assert
        Assert.assertEquals(valorTotalEsperado, valorTotalResultante);
    }
    @Test
    public void deveTerValorPorPesoZeradoQuandoNaoExistirNenhumRecurso(){
        Planeta tatooine = new Planeta(4, new ArrayList<>());
        int valorTotalEsperado = 0;
        // act
        int valorTotalResultante = (int) tatooine.getValorPorPeso();
        // assert
        Assert.assertEquals(valorTotalEsperado, valorTotalResultante);
    }
    @Test
    public void deveTerValorPorPesoQuandoExistirRecursosNoPlaneta(){
        Planeta tatooine = new Planeta(4, Arrays.asList(RecursosEnum.AGUA, RecursosEnum.OURO));
        int valorTotalEsperado = 22;
        // act
        int valorTotalResultante = (int) tatooine.getValorPorPeso();
        // assert
        Assert.assertEquals(valorTotalEsperado, valorTotalResultante);
    }

}

