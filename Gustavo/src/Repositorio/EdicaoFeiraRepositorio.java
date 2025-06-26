package Repositorio;

import Classesbasicas.*;
import Repositorio.Abstrato.RepositorioPadrao;

import java.util.ArrayList;

public class EdicaoFeiraRepositorio extends RepositorioPadrao<EdicaoFeira>
{


    public boolean addEdicao(EdicaoFeira ef)
    {
        boolean resultado = false;
        boolean limitemaxatingido =  false;
        {
            if (ef != null)
            {
                int limitemax = ef.getNumeroMaximoBancas();
                {

                }
            }
        }
        return resultado;
    }
}
