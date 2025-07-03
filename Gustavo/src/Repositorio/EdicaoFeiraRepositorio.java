package Repositorio;

import Classesbasicas.*;
import Repositorio.Abstrato.RepositorioPadrao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class EdicaoFeiraRepositorio extends RepositorioPadrao<EdicaoFeira>
{

    @Override
    public boolean existe(EdicaoFeira edicaoFeira)
    {
        boolean existe = false;
        if (edicaoFeira != null)
        {
            LocalDateTime data = edicaoFeira.getData();
            LocalDateTime horario = edicaoFeira.getHorario();
            String local = edicaoFeira.getLocal();
            for (EdicaoFeira ef : lista)
            {
                if (ef.getData().equals(data) && ef.getHorario().equals(horario) && ef.getLocal().equals(local))
                {
                    existe = true;
                }
            }
        }
        return existe;
    }

    @Override
    public List<EdicaoFeira> procurarPorNome(String local)
    {
        List<EdicaoFeira> listaDeEdicoes = new ArrayList<>();

        for (EdicaoFeira ef : lista)
        {
            if (ef.getLocal().equals(local))
            {
                listaDeEdicoes.add(ef);
            }
        }
        return listaDeEdicoes;
    }

    public List<EdicaoFeira> procurarPorData (LocalDateTime data)
    {
        List<EdicaoFeira> listaDeEdicoes = new ArrayList<>();

        for (EdicaoFeira ef : lista)
        {
            if (ef.getData().equals(data))
            {
                listaDeEdicoes.add(ef);
            }
        }
        return listaDeEdicoes;
    }

    public void procurarPorHorario (LocalDateTime horario)
    {
        procurarPorData (horario);
    }


}
