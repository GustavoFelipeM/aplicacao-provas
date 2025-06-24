package Repositorio.Abstrato;
import java.util.ArrayList;

public abstract class RepositorioPadrao<ClasseBasica>
{
    protected ArrayList<ClasseBasica> lista;

    public RepositorioPadrao()
    {
        this.lista = new ArrayList<>();
    }

    public boolean Existe(ClasseBasica obj)
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
        if (!Existe(obj))
        {
            lista.add(obj);
        }
    }

    public void remove(ClasseBasica obj)
    {
        if (Existe(obj))
        {
            lista.remove(obj);
        }
    }

    public void Procurar(ClasseBasica obj)
    {
       if (Existe(obj))
       {

       }
    }
}