package br.com.gabrielbendo.padroes.criacionais.factorymethod;

/**
 *
 * @author guilherme.villaca
 */
public class LogisticaMaritima extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new TransporteFerroviario();
    }

}
