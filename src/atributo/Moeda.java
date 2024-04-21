package atributo;

import modulos.Conversor;

public class Moeda {

    private String moedaBase;
    private String moedaAlvo;
    private String conversao;

    public Moeda(Conversor meuConversor){

        this.moedaBase = meuConversor.base_code();
        this.moedaAlvo = meuConversor.target_code();
        this.conversao = meuConversor.conversion_result();
    }

    public String getMoedaBase() {
        return moedaBase;
    }

    public void setMoedaBase(String moedaBase) {
        this.moedaBase = moedaBase;
    }

    public String getMoedaAlvo() {
        return moedaAlvo;
    }

    public void setMoedaAlvo(String moedaAlvo) {
        this.moedaAlvo = moedaAlvo;
    }

    public String getConversao() {
        return conversao;
    }

    public void setConversao(String conversao) {
        this.conversao = conversao;
    }

    @Override
    public String toString() {
        return "{" +
                "moeda base= '" + moedaBase + '\'' +
                ", moeda alvo= '" + moedaAlvo + '\'' +
                ", Valor convertido= '" + conversao + '\'' +
                '}';
    }
}
