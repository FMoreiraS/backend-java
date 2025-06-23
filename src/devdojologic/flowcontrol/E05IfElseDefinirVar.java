package devdojologic.flowcontrol;

/* Se um determinado salário for maior que 4500, imprimir 30% do valor;
 * se não, imprimir 15% do valor.
 */

public class E05IfElseDefinirVar {
    public static void main(String[] args) {
        float salary = 3000F;
        
        if(salary > 4500) {
            float percentage = 0.3F; 
            float tax = salary * percentage; 
            System.out.println(tax);
        } else {
            float percentage = 0.15F; 
            float tax = salary * percentage;
            System.out.println(tax);
        }
        // Poderia ser mais direto: float percentage = salary * 0.3F;
        // A variável dentro do escopo percentage não seria reconhecida fora dele.

        // Desafio: usar apenas uma variável para guardar o resultado e imprimir no final.
        
        float result = 0F;

        if(salary > 4500) { 
            result = salary * 0.3F;
        } else {
            result = salary * 0.15F;
        }
        System.out.println("\n" + result);

        // Desafio 2: Dizer na impressão se o valor é 30 ou 15 por cento.

        String percentage;

        if(salary > 4500) { 
            result = salary * 0.3F;
            percentage = "30%";
        } else {
            result = salary * 0.15F;
            percentage = "15%";
        }
        System.out.println("\nO resultado é " + percentage + " do salário: " + result);
    }
}
