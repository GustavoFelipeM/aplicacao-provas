package Repositorio;

import Classesbasicas.*;
import Repositorio.Abstrato.RepositorioPadrao;

import java.util.ArrayList;
import java.util.List;


public class ProdutoRepositorio extends RepositorioPadrao<Produto>
{

    @Override
    public void add(Produto obj)
    {
        if (obj != null)
        {
            if (obj.getCategoria().equalsIgnoreCase(obj.getProdutorAssociado().getCategoria())) //TODO Talvez implementar categorias fixas por índice
            {
                lista.add(obj);
            }
            else
            {
                //TODO Colocar exception
            }

        }
    }

    @Override
    public List<Produto> procurarPorNome(String nome)
    {
        List<Produto> listaNome = new ArrayList<>();
        for (Produto p : lista)
        {
            if (p.getNome().equalsIgnoreCase(nome))
            {
                listaNome.add(p);
            }
        }
        return listaNome;
    }


    public List<Produto> procurarProdutor(Produtor produtor)
    {
        if
        List<Produto> produtosDoProdutor = new ArrayList<>();
        for (Produto p: lista)
        {
            if (produtor.equals(p.getProdutorAssociado()))
            {
                produtosDoProdutor.add(p);

            }
        }
        return produtosDoProdutor;
    }



}
