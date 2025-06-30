package Repositorio.Abstrato;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class RepositorioPadrao<ClasseBasica>
{
    protected ArrayList<ClasseBasica> lista;

    public RepositorioPadrao()
    {
        this.lista = new ArrayList<>();
    }

    public boolean existe(ClasseBasica obj)
    {
        boolean existe = false;
        if (obj != null)
        {
            for (ClasseBasica c : lista)
            {
                if (obj.equals(c))
                {
                    existe = true;
                    break;
                }
            }
        }
        return existe;
    }

    public void add(ClasseBasica obj)
    {
        if (!existe(obj))
        {
            lista.add(obj);
        }
    }

    public void remove(ClasseBasica obj)
    {
        if (existe(obj))
        {
            lista.remove(obj);
        }
    }

    public ClasseBasica procurar(ClasseBasica obj)
    {
        ClasseBasica resultado = null;
        int i = this.procurarIndice(obj);
        if (i >= 0)
        {
            resultado = lista.get(i);
        }
        return resultado;
    }

    public int procurarIndice(ClasseBasica obj)
    {
       int indice = -1;
       if (existe(obj))
       {
            for (int i=0; i<lista.size(); i++)
            {
                if (lista.get(i).equals(obj))
                {
                    indice = i;
                }
            }
       }
       return indice;
    }



    public List<ClasseBasica> recuperarTudo()
    {
        return Collections.unmodifiableList(this.lista);
    }


}