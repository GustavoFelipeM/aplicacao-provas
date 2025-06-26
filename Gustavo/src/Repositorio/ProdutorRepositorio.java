package Repositorio;

import Classesbasicas.*;
import Repositorio.Abstrato.RepositorioPadrao;

import java.util.ArrayList;

public class ProdutorRepositorio extends RepositorioPadrao<Produtor>
{
    //Atributos já herdados do repositorio padrão
    private int maxbancas;

    public ProdutorRepositorio(EdicaoFeira edicao)
    {
        super();
        this.maxbancas = edicao.getNumeroMaximoBancas();
        this.lista = new ArrayList<>(maxbancas);
    }


    @Override
    public boolean existe(Produtor obj)
    {
        boolean existe = false;
        if(obj != null)
        {
            String CpfCnpj = obj.getCpfCnpj();
            {
                for (Produtor i : lista)
                {
                    if (i.getCpfCnpj().equals(CpfCnpj))
                    {
                        existe = true;
                        break;
                    }
                }
            }
        }
        return existe;
    }

    @Override
    public void add(Produtor obj)
    {
        if(lista.size() < maxbancas)
        {
            if (!existe(obj))
            {
                lista.add(obj);
            }
        }
        else
        {
            System.out.println("Limite de " + maxbancas + " bancas atingido. Não é possível adicionar o produtor.");

        }
    }




}
