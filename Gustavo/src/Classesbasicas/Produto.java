package Classesbasicas;

public class Produto
{
    private String nome;
    private String descricao;
    private String categoria;
    private double preco;

    public Produto(String nome, String descricao, String categoria, double preço)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
    }


    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getDescricao()
    {
        return descricao;
    }
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public String getCategoria()
    {
        return categoria;
    }
    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }

    public double getPreco()
    {
        return preco;
    }
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
}
