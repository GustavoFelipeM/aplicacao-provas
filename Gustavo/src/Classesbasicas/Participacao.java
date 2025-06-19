package Classesbasicas;

import java.util.ArrayList;

public class Participacao {
    private ArrayList<Produtor> produtores;
    private EdicaoFeira edicaoFeira;
    private int banca;

    public Participacao
    {
        this.produtores = new ArrayList<>();
    }

    public Produtor getProdutores()
    {
        return ArrayList<Produtor>;
    }
    public void setProdutor(Produtor produtor)
    {
        this.produtores = produtor;
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
