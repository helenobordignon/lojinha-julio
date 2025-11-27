package br.com.lojinha.pojo;

public class Produto {

    private String nome;
    private String marca;
    private double valor;
    private String tamanho;
    private String itemIncluso;

    /* Getters e Setters são métodos usados para acessar e modificar os atributos privados de uma classe.
       Eles fornecem uma maneira controlada de ler e atualizar os valores dos atributos,
       garantindo encapsulamento e segurança dos dados.
    */
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
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getItemIncluso() {
        return itemIncluso;
    }

    public void setItemIncluso(String itemIncluso) {
        this.itemIncluso = itemIncluso;
    }

}
