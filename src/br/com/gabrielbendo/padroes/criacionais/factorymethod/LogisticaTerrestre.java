package br.com.gabrielbendo.padroes.criacionais.factorymethod;

/**
 *
 * @author guilherme.villaca
 */
public class LogisticaTerrestre extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new TransporteTerrestre();
    }

}
