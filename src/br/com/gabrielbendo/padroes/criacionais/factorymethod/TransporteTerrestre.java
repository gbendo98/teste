package br.com.gabrielbendo.padroes.criacionais.factorymethod;

/**
 *
 * @author guilherme.villaca
 */
public class TransporteTerrestre implements Transporte{

    @Override
    public void entregar() {
        System.out.println("Entregando por transporte Terrestre.");
    }

}
