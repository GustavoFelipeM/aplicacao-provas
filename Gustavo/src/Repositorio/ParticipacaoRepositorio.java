package Repositorio;

import Classesbasicas.EdicaoFeira;
import Classesbasicas.Participacao;
import Repositorio.Abstrato.RepositorioPadrao;

public class ParticipacaoRepositorio extends RepositorioPadrao<Participacao>
{
    private final EdicaoFeira edicao;

    public ParticipacaoRepositorio(EdicaoFeira edicao)
    {
        super();
        this.edicao = edicao;
    }

}
