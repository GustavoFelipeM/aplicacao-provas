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
        //Tava pensando em colocar um if existe(produtor) *Método do repositorio produtor* mas acho que vai fazer um repositorio depender do outro, perguntar ao professor
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
