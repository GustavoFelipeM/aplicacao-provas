package Classesbasicas;

import java.util.ArrayList;

public class Participacao {
    private Produtor produtor;
    private EdicaoFeira edicaoFeira;
    private int banca;

    public Participacao(Produtor produtor, EdicaoFeira edicaoFeira, int banca)
    {
        this.produtor = produtor;
        this.edicaoFeira = edicaoFeira;
        this.banca = banca;
    }

    public Produtor getProdutores()
    {
        return produtor;
    }
    public void setProdutor(Produtor produtor)
    {
        this.produtor= produtor;
    }

    public EdicaoFeira getEdicaoFeira()
    {
        return edicaoFeira;
    }
    public void setEdicaoFeira(EdicaoFeira edicaoFeira)
    {
        this.edicaoFeira = edicaoFeira;
    }
    public int getBanca()
    {
        return banca;
    }
    public void setBanca(int banca)
    {
        this.banca = banca;
    }

    public void inscreverEmEdicaoFutura()
    {

    }
    public void alocarBanca()
    {

    }
    public void cancelarParticipacao(){

    }
    public boolean verificarProdutorAtivo(){
        return false;
    }
    public boolean verificarPendencias(){
        return false;
    }
}
