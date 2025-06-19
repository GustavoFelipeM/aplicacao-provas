import java.time.LocalDateTime;
import java.util.Date;

public class EdicaoFeira {
    private LocalDateTime data;
    private LocalDateTime horario;
    private String local;
    private String descricao;
    private int numeroMaximoBancas;

    public LocalDateTime getData()
    {
        return data;
    }
    public void setData(LocalDateTime data)
    {
        this.data = data;
    }
    public LocalDateTime getHorario()
    {
        return horario;
    }
    public void setHorario(LocalDateTime horario)
    {
        this.horario = horario;
    }
    public String getLocal()
    {
        return local;
    }
    public void setLocal(String local)
    {
        this.local = local;
    }
    public String getDescricao()
    {
        return descricao;
    }
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    public int getNumeroMaximoBancas()
    {
        return numeroMaximoBancas;
    }
    public void setNumeroMaximoBancas(int numeroMaximoBancas)
    {
        this.numeroMaximoBancas = numeroMaximoBancas;
    }

    public int controleDeBancas(){
        return 0;
    }
    public boolean impedirInscricaoNoLimite(){
        return false;
    }
}
