package Repositorio;

import Classesbasicas.*;
import java.util.ArrayList;

public class ProdutorRepositorio
{
    private ArrayList<Produtor> produtores;
    public ProdutorRepositorio (int capacidadeInicial)
    {
        this.produtores = new ArrayList<>(capacidadeInicial);
    }

    public boolean AddProdutor(Produtor p)
    {
        boolean resultado = false;
        if (p != null)
        {
            String cpfCnpj = p.getCpfCnpj();
            boolean existeprodutor = false;

            for(Produtor i : produtores)
            {
                if (i.getCpfCnpj().equals(cpfCnpj))
                {
                    existeprodutor = true;
                    break;
                }
            }

            if (!existeprodutor)
            {
                this.produtores.add(p);
                resultado = true;
            }
        }
        return resultado;
    }
}
