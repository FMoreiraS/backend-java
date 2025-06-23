package devdojologic.flowcontrol;

public class E04IfElse {
    public static void main(String[] args) {
        /* Receber uma idade como entrada;
         * Se idade for maior que 18, imprimir "Adulto";
         * senão, imprimir "Ainda não é adulto".
         */
        short age = 19;

        if(age > 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda não é adulto");
        }
        /* Uma vez que o Java sabe a difereça entre os tipos de variável, não podemos comparar
         * strings com valores numéricos. Mas como uma char possui na verdade um valor numérico
         * correspondente a cada caractere na tabela ASCII, esse tipo pode ser usado em expressões
         * lógicas.
         */
    }
}