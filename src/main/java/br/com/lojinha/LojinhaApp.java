package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;
import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) {

        Produto meuProduto = new Produto();
        meuProduto.setNome("Caneta");
        meuProduto.setValor(30);
        meuProduto.setTamanho(Tamanho.PEQUENO);

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("1 Caneta");

        meuProduto.setItemIncluso(itensInclusos);
    }

}
