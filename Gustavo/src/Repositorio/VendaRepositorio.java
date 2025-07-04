package Repositorio;

import Classesbasicas.*;
import Repositorio.Abstrato.RepositorioPadrao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VendaRepositorio extends RepositorioPadrao<Venda>
{

    public List<Venda> buscarVendasPorProdutor (Produtor produtor)
    {
        List<Venda> vendasDoProdutor = new ArrayList<>();

        for (Venda v : lista)
        {
            if(v.getProdutor().equals(produtor))
                {
                vendasDoProdutor.add(v);
                }
        }
        return vendasDoProdutor;
    }

    public List<Venda> buscarVendasPorProduto(Produto produto)
    {
        List<Venda> vendasComProduto = new ArrayList<>();


        for (Venda v : this.lista)
        {
            for (ItemVenda iv : v.getItensVenda())
            {
                if (iv.getProduto().equals(produto))
                {
                    vendasComProduto.add(v);
                }
            }
        }
        return vendasComProduto;
    }

    public List<Venda> buscarVendasPorEdicao(EdicaoFeira edicaoFeira) {
       List<Venda> vendasDaEdicao = new ArrayList<>();

       for (Venda v : lista)
       {
           if (v.getEdicaoFeira().equals(edicaoFeira))
               {
               vendasDaEdicao.add(v);
               }
       }
       return vendasDaEdicao;
    }
}
