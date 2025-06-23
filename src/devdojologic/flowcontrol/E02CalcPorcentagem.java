package devdojologic.flowcontrol;

public class E02CalcPorcentagem {
    /* Criar uma classe que calcule uma porcentagem de determinado salário.
     * Na engenharia de software trabalhamos com REQUISITOS. Aqui
     * os requisitos seriam:
     * Criar a classe;
     * Aceitar valor de entrada para o salário;
     * Definir o valor da porcentagem;
     * Calcular a porcentagem;
     */
    public static void main(String[] args) {
        float salary = 4658.32F;
        float percentage = 35 / 100;
        float percentageSalary = salary * percentage;

        System.out.println(percentageSalary);
        // O Java aceita os parênteses como sinal matemático, dessa forma:
        // salaryPorcentage = salary * (percentage / 100);
    }
}
