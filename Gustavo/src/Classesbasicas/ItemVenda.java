package Classesbasicas;

public class ItemVenda
{
    Produto produto;
    int quantidade;
    double valor;
    double valorTotal;

    public ItemVenda(Produto produto, int quantidade, double valor)
    {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
        this.valorTotal = valor*quantidade;
    }

    public Produto getProduto()
    {
        return produto;
    }
    public void setProduto(Produto produto)
    {
        this.produto = produto;
    }

    public int getQuantidade()
    {
        return quantidade;
    }
    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }

    public double getValor()
    {
        return valor;
    }
    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public double getValorTotal()
    {
        return valorTotal;
    }

}
