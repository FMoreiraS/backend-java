package devdojologic.flowcontrol;

public class E03Reuso {
    /* Criar uma variável para guardar um salário;
     * Calcular as porcentagens desse salário: 30%, 25%, 5%;
     * Guardar o resultado a cada cálculo em uma variável;
     * Imprimir o resultado e reutilizar a variável do 
     * resultado para o novo cálculo.
     */
    public static void main(String[] args) {
        float salary = 5600F;
        float percentage1 = 0.3F;
        float result = salary * percentage1;
        System.out.println(result);

        float percentage2 = 0.15F;
        result = salary * percentage2;
        System.out.println(result);

        float percentage3 = 0.05F;
        result = salary * percentage3;
        System.out.println(result);
    }
}
