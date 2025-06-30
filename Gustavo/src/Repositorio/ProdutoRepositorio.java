package Repositorio;

import Classesbasicas.*;
import Repositorio.Abstrato.RepositorioPadrao;


public class ProdutoRepositorio extends RepositorioPadrao<Produto>
{
    private final Produtor produtor_a_checar; //Preciso usar como final?
    public ProdutoRepositorio(Produtor produtor)
    {
        super();
        this.produtor_a_checar = produtor;
    }

    @Override
    public void add(Produto obj)
    {
        if (obj != null)
        {
            if (obj.getCategoria().equalsIgnoreCase(this.produtor_a_checar.getCategoria()))
            {
                lista.add(obj);
            }
            else
            {
                //TODO Colocar exception
            }

        }
    }

}
