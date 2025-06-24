package Classesbasicas;

import java.util.ArrayList;

public class Venda {
    private Produtor produtor;
    private ArrayList<ItemVenda> produtos;
    private EdicaoFeira edicaoFeira;
    private double vendaTotal;
    private String observacoes;

    public Venda(Produtor produtor, EdicaoFeira edicaoFeira, String observacoes)
    {
        this.produtor=produtor;
        this.edicaoFeira=edicaoFeira;
        this.observacoes=observacoes;
        this.produtos=new ArrayList<>();
    }

    public void adicionarItemVenda(ItemVenda itemVenda)
    {
        this.produtos.add(itemVenda);
    }

    public void calcularvendaTotal()
    {
        double vendaTotal = 0; //Variável local, diferente da variável da classe que seria this.vendaTotal
        for (ItemVenda itemVenda : produtos)
        {
            vendaTotal = vendaTotal + itemVenda.getValorTotal();
        }
       setVendaTotal(vendaTotal);
    }

    // getters and setters
    public Produtor getProdutor()
    {
        return produtor;
    }

    public void setProdutor(Produtor produtor)
    {
        this.produtor = produtor;
    }

    public ArrayList<ItemVenda> getProdutos()
    {
        return produtos;
    }

    public EdicaoFeira getEdicaoFeira()
    {
        return edicaoFeira;
    }

    public void setEdicaoFeira(EdicaoFeira edicaoFeira)
    {
        this.edicaoFeira = edicaoFeira;
    }

    public double getVendaTotal()
    {
        return vendaTotal;
    }

    public void setVendaTotal(double vendaTotal)
    {
        this.vendaTotal = vendaTotal;
    }

    public String getObservacoes()
    {
        return observacoes;
    }

    public void setObservacoes(String observacoes)
    {
        this.observacoes = observacoes;
    }

}
