package ajavafundamentals;

public class BitWiseOperators {
    /* Os operadores bitwise trabalham com cada bit dos valores e são: & (and), | (or), ^ (shore), ~
    (complement), << (left shift), >> (right shift) e >>> (unsigned right shift).

    & e | comportam-se como && e ||, mas comparam e retornam valores binários, ou seja, 0 é falso e
    1 é verdadeiro, mas são exibidos como 0 e 1 conforme as operações lógicas.

    ^ comporta-se como bicondicional, então, se os valores forem iguais (0 e 0 ou 1 e 1), o retorno
    é 1, se não, é 0.

    ~ comporta-se como a negação - ~1 se torna 0 e ~0, 1; negativos tornam-se positivos e vice-versa.

    << desloca o valor binário para n casas à esquerda: var result = valor << quantidadeDeDeslocamentos;
    O binário 1010 (10 dec.), por exemplo, se usado com << 2, torna-se 101000 (40 dec.).

    >> é como <<, mas desloca o valor para a direita, eliminando os últimos dígitos. 1100 >> 2 = 11.
    Porém, se o valor base for negativo, precisará ter o dígito 1 no início, esta é forma de identificar
    os negativos com binários. Por isso, o deslocamento não substituirá os dígitos iniciais vazios com
    zero, como quando se faz com positivos.

    >>> comporta-se como >>, mas não faz a verificação do valor, para determinar se o preenchimento à
    esquerda deve ser com zeros ou uns, dependendo do sinal do valor.

    Todos esses operadores dependem do valor máximo do tipo integer.
     */
}
