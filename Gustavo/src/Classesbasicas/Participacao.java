public class Participacao {
    private Produtor produtor;
    private EdicaoFeira edicaoFeira;
    private int banca;

    public void inscreverEmEdicaoFutura(){

    }
    public void alocarBanca(){

    }
    public void cancelarParticipacao(){

    }
    public boolean verificarProdutorAtivo(){
        return false;
    }
    public boolean verificarPendencias(){
        return false;
    }

    // getters and setters
    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public EdicaoFeira getEdicaoFeira() {
        return edicaoFeira;
    }

    public void setEdicaoFeira(EdicaoFeira edicaoFeira) {
        this.edicaoFeira = edicaoFeira;
    }

    public int getBanca() {
        return banca;
    }

    public void setBanca(int banca) {
        this.banca = banca;
    }
}
