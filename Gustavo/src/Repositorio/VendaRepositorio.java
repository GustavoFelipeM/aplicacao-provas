import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VendaRepositorio {
    private List<Venda> vendas;

    public VendaRepositorio() {
        this.vendas = new ArrayList<>();
    }

    // Registrar venda por produtor, produto e edição
    public void registrarVenda(Produtor produtor, Produto produto, EdicaoFeira edicaoFeira, int quantidade, double valorUnitario, String observacoes) {
        double valorTotal = quantidade * valorUnitario;
        Venda venda = new Venda(produtor, produto, edicaoFeira, quantidade, valorTotal, observacoes);
        vendas.add(venda);
    }

    // Calcular total vendido por banca (produtor) em uma edição específica
    public double calcularTotalPorBanca(Produtor produtor, EdicaoFeira edicao) {
        return vendas.stream()
                .filter(v -> v.getProdutor().equals(produtor) && v.getEdicaoFeira().equals(edicao))
                .mapToDouble(Venda::getValorTotal)
                .sum();
    }

    // Buscar vendas por produtor, produto ou edição (REQ10 auxiliar)
    public List<Venda> buscarVendasPorProdutor(Produtor produtor) {
        return vendas.stream()
                .filter(v -> v.getProdutor().equals(produtor))
                .collect(Collectors.toList());
    }

    public List<Venda> buscarVendasPorProduto(Produto produto) {
        return vendas.stream()
                .filter(v -> v.getProduto().equals(produto))
                .collect(Collectors.toList());
    }

    public List<Venda> buscarVendasPorEdicao(EdicaoFeira edicaoFeira) {
        return vendas.stream()
                .filter(v -> v.getEdicaoFeira().equals(edicaoFeira))
                .collect(Collectors.toList());
    }
}
