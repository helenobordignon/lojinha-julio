package br.com.lojinha;

/* LojinhaApp é uma classe. o que é uma classe em java?
   Uma classe em Java é um modelo ou uma estrutura que define as propriedades (atributos) e comportamentos (métodos) de um objeto.
   Ela serve como um molde para criar objetos específicos que compartilham as mesmas características e funcionalidades.
*/

/* Classes são 'receitas', quando você instancia ela, se torna um objetos. Esse objeto possui atributos que são suas características
   e métodos que são suas ações
*/

/* Qual a diferença entre atributo e variável?
   Atributos são as características ou propriedades de um objeto, enquanto variáveis são espaços na memória que armazenam dados temporários.
   Em outras palavras, atributos são usados para descrever o estado de um objeto, enquanto variáveis são usadas para armazenar valores durante a execução do programa.
*/

import br.com.lojinha.pojo.Produto;

/* O método main é o ponto de entrada de um programa Java.
   É onde a execução do programa começa.
   A assinatura "public static void main(String[] args)" é padrão e deve ser seguida para que a JVM (Java Virtual Machine) possa
   localizar e executar o programa corretamente.
*/
public class LojinhaApp {

    public static void main(String[] args) {

        Produto meuProduto = new Produto();
        meuProduto.setNome("Caneta");
        meuProduto.setValor(2.50);

    }

}
