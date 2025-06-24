package Repositorio;

import Classesbasicas.ItemVenda;
import Repositorio.Abstrato.RepositorioPadrao;

public class ItemVendaRepositorio extends RepositorioPadrao<ItemVenda>
{

    public double calcularVendaTotal()
    {
        double vendaTotal = 0;
        for (ItemVenda itemVenda : lista)
        {
            vendaTotal += itemVenda.getValorTotal();
        }
        return vendaTotal;
    }
}
