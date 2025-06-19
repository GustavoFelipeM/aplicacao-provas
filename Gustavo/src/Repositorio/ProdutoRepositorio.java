package Repositorio;

import Classesbasicas.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoRepositorio {
    private List<Produto> produtos;

    public ProdutoRepositorio() {
        this.produtos = new ArrayList<>();
    }

    // Cadastrar produto com validação da categoria
    public boolean cadastrarProduto(String nome, String descricao, String categoria, double precoMedio, Produtor produtor) {
        if (!produtor.getCategoriasPermitidas().contains(categoria)) {
            System.out.println("Erro: Categoria '" + categoria + "' não é permitida para este produtor.");
            return false;
        }

        Produto produto = new Produto(nome, descricao, categoria, precoMedio, produtor);
        produtos.add(produto);
        produtor.adicionarProduto(produto); // para manter a associação
        return true;
    }

    // Buscar produtos por produtor
    public List<Produto> buscarPorProdutor(Produtor produtor) {
        return produtos.stream()
                .filter(p -> p.getProdutor().equals(produtor))
                .collect(Collectors.toList());
    }

    // Buscar produtos por categoria
    public List<Produto> buscarPorCategoria(String categoria) {
        return produtos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
    }

    // Listar todos os produtos
    public List<Produto> listarTodos() {
        return produtos;
    }
}

