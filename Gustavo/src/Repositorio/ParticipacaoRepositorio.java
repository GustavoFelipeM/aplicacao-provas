package Repositorio;

import Classesbasicas.EdicaoFeira;
import Classesbasicas.Participacao;
import Classesbasicas.Produtor;
import Repositorio.Abstrato.RepositorioPadrao;

import java.util.ArrayList;
import java.util.List;


public class ParticipacaoRepositorio extends RepositorioPadrao<Participacao>
{

    public List<Participacao> procurarProdutor(Produtor produtor)
    {
        List<Participacao> participacoes = new ArrayList<Participacao>();

        for (Participacao p : lista)
        {
            if(p.getProdutor().equals(produtor))
            {
                participacoes.add(p);
            }
        }

        return participacoes;
    }

    public List<Participacao> procurarEdicao(EdicaoFeira edicao)
    {
        List<Participacao> participacoes = new ArrayList<>();

        for (Participacao p : lista)
        {
            if (p.getEdicaoFeira().equals(edicao))
            {
                participacoes.add(p);
            }
        }
        return participacoes;
    }



}
