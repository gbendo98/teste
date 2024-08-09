package br.com.gabrielbendo.padroes.criacionais.factorymethod;

/**
 *
 * @author guilherme.villaca
 */
public class LogisticaFerroviaria extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new TransporteFerroviario();
    }
    
    

}
