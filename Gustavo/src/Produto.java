public class Produto {
    private String nome;
    private String descricao;
    private String categoria;
    private Produtor produtor;

    public Produto(String nome, String descricao, String categoria, Produtor produtor)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.produtor = produtor;
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
    public Produtor getProdutor()
    {
        return produtor;
    }
    public void setProdutor(Produtor produtor)
    {
        this.produtor = produtor;
    }



    public Produtor produtorAssociado(Produtor produtor)
    {

    }
}
