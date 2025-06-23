package devdojologic.flowcontrol;

// Dado um determinado número inteiro, imprima se ele é ímpar ou par.

public class E06OpResto {

    public static void main(String[] args) {
        
        int number = 33;
        String numberStatus;

        if(number % 2 == 0) {
            numberStatus = " é par.";
        } else {
            numberStatus = " é ímpar.";
        }
        System.out.println(number + numberStatus);
    }
}