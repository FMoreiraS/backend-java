package devdojologic.loops;

// Eu como usuário gostaria de imprimir todos os números ímpares de 0 até o número digitado pelo usuário.

public class E11While {
    public static void main(String[] args) {
        int counter = 0;
        int number = 67;
        
        while(counter <= number) {
            if(counter % 2 != 0) {
                System.out.println(counter);
            }
            counter++;
        }

        /*
        while(counter % 2 != 0) {
            if(counter <= number) {
            System.out.println(counter);
            }
            counter++;
        }
        Isto não funcionou: a condição do while já começa falsa: 0 % 2 = 0.
        */
    }
}
