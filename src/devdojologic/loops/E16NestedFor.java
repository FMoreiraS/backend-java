package devdojologic.loops;

// Eu como usuário gostaria de um sistema que fizesse automaticamente a tabuada de 1 a 10.

public class E16NestedFor {
    public static void main(String[] args) {
        System.out.println("Multiplication table from 1 to 10:");
        for(int i = 1; i <= 10; i++) {
            System.out.println(1*i);
            System.out.println(2*i);
            System.out.println(3*i);
            System.out.println(4*i);
            System.out.println(5*i);
            System.out.println(6*i);
            System.out.println(7*i);
            System.out.println(8*i);
            System.out.println(9*i);
            System.out.println(10*i);
            System.out.println("------");
        }
        // I don't understand correctly. It was to be a nested for:
        for(int i = 1; i <= 10; i++) {
            System.out.println("Multiplication table of " + i);
            for(int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + (i*j)); // Without the () in the operation, it's don't works.
            }
            System.out.println("-----");
        }
    }
}
