package cexceptions;

public class Exceptions {
    /* As exceções podem ser de dois tipos:
    1 - Checked Exceptions: são as que são verificadas no tempo de compilação.
    2- Unchecked Exceptions: são as verificadas em runtime.

    Uma forma de tratar exceções é usar a cláusula throws após o nome do método, indicando qual exceção ele
    detectará, mas isso apenas delega a outro método a responsabilidade de resolver a exceção (com try e catch).
     */
    public void irresponsible() throws Exception {
        System.out.println("Este método não está responsável por resolver a exceção.");
    }
    //Usando throw dentro dum método, determina-se que ele chama a referida exceção.
    void test() {
        throw new RuntimeException();
    }
    /* A superclasse Exception estende a superclasse Throwable, estendida também pelas classes de erros.
    COMO TRATAR EXCEÇÕES
    A forma mais simples é com as cláusulas try e catch, tendo a primeira um bloco com o código a ser executado
    e onde pode ocorrer uma exceção, e a segunda pode constituir tantos blocos quantas forem as exceções que
    se deseja tratar, com ações específicas para cada caso, mas também é possível tratar várias exceções num
    único bloco catch, separando-as com o operador "ou" (|).
    Outra cláusula que pode complementar try e catch é a finally, que executa determinado bloco de código
    independente de qualquer ação em try e catch, ou seja, quer se detecte e trate uma exceção, quer não,
    sempre haverá a execução do que está no bloco finally.
     */
}