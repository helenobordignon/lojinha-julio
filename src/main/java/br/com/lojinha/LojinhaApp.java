package br.com.lojinha;

/* LojinhaApp é uma classe. o que é uma classe em java?
   Uma classe em Java é um modelo ou uma estrutura que define as propriedades (atributos) e comportamentos (métodos) de um objeto.
   Ela serve como um molde para criar objetos específicos que compartilham as mesmas características e funcionalidades.
*/
public class LojinhaApp {
    /* O método main é o ponto de entrada de um programa Java.
       É onde a execução do programa começa.
       A assinatura "public static void main(String[] args)" é padrão e deve ser seguida para que a JVM (Java Virtual Machine) possa
       localizar e executar o programa corretamente.
    */
    public static void main(String[] args) {

        /* Exibe uma mensagem de boas-vindas no console */
        System.out.println("Bem-vindo à Lojinha!");

        /* Declaração de variáveis */
        String produto = "Camisa";
        int quantidade = 3;
        double preco = 49.90;
        boolean emEstoque = true;
        char tamanho = 'M';

        System.out.println("Produto: " + produto + " | Preço: R$ " + preco);
    }

    /* Classes são 'receitas', quando você instancia ela, se torna um objetos. Esse objeto possui atributos que são suas características
       e métodos que são suas ações */

}
