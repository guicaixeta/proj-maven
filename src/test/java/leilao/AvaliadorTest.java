package leilao;

import org.junit.Test;

import static org.junit.Assert.*;

public class AvaliadorTest {
  @Test
  public void deveEntenderLancesEmOrdemCrescente(){
    Usuario joao = new Usuario("joao");
    Usuario maria = new Usuario("maria");
    Usuario ju = new Usuario("ju");

    Leilao leilao = new Leilao("Playstation");

    leilao.propoe(new Lance(joao, 400));
    leilao.propoe(new Lance(maria, 300));
    leilao.propoe(new Lance(ju, 240));

    Avaliador avaliador = new Avaliador();
    avaliador.avalia(leilao);

    assert (avaliador.getMaiorLance() == 400);
    assert (avaliador.getMenorLance() == 240);
  }

}
