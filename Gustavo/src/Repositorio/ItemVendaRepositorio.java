package Repositorio;

import Classesbasicas.ItemVenda;
import Classesbasicas.Produto;
import Repositorio.Abstrato.RepositorioPadrao;

import java.util.ArrayList;
import java.util.List;

public class ItemVendaRepositorio extends RepositorioPadrao<ItemVenda>
{

   public List<ItemVenda> procurarPorProduto (Produto produto)
   {
        List<ItemVenda> itemVendas = new ArrayList<>();

        for(ItemVenda iv : lista)
        {
            if (iv.getProduto().equals(produto))
                {
                itemVendas.add(iv);
                }
        }
        return itemVendas;
   }
}
