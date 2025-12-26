package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemAdicional;
import br.com.lojinha.pojo.Produto;
import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) {

        Produto meuProduto = new Produto("BIC", Tamanho.PEQUENO);

        meuProduto.setNome("Play Station 5");
        meuProduto.setValor(3000);

        List<ItemAdicional> itensAdicionais = new ArrayList<>();
//        itensInclusos.add("2 Controles");
//        itensInclusos.add("Cabo HDMI");
//        itensInclusos.add("Cabo de Força");

        ItemAdicional item1 = new ItemAdicional();
        item1.setNome("Controle");
        item1.setQuantidade(2);
        itensAdicionais.add(item1); // adicionando o item à lista

        ItemAdicional item2 = new ItemAdicional();
        item2.setNome("Cabo HDMI");
        item2.setQuantidade(1);
        itensAdicionais.add(item2); // adicionando o item à lista

        ItemAdicional item3 = new ItemAdicional();
        item3.setNome("Cabo de Força");
        item3.setQuantidade(1);
        itensAdicionais.add(item3); // adicionando o item à lista

        // Atribuindo a lista de itens adicionais ao produto
        meuProduto.setItemIncluso(itensAdicionais);

        // Exibindo as informações do produto
        System.out.println("Produto: " + meuProduto.getNome());
        System.out.println("Marca: " + meuProduto.getMarca());
        System.out.println("Valor: R$ " + meuProduto.getValor());
        System.out.println("Tamanho: " + meuProduto.getTamanho());

        // Itens que vem incluso nesse produto:
        System.out.println("Itens Inclusos: ");

        for (ItemAdicional item : meuProduto.getItemIncluso()) {
            System.out.println("- " + item.getQuantidade() + " x " + item.getNome());
        }
    }

}
