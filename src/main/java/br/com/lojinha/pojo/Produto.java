package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import java.util.List;

public class Produto {

    private String nome;
    private String marca;
    private double valor;
    private Tamanho tamanho;
    private List<String> itemIncluso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor > 0){
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maior que 0"); // Argomento inválido "IllegalArgumentException"
        }
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public List<String> getItemIncluso() {
        return itemIncluso;
    }

    public void setItemIncluso(List<String> itemIncluso) {
        this.itemIncluso = itemIncluso;
    }

}
