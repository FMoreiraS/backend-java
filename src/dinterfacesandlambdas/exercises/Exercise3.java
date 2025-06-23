package dinterfacesandlambdas.exercises;

import java.util.Scanner;

public class Exercise3 {
    /* 3 - Escreva um código onde seja possível calcular a área de uma figura geométrica, todas devem ter
    um método que retorne esse valor, as formas geométricas disponíveis devem ser as seguintes:
    Quadrado: possui o valor dos seus lados;
    Retângulo: possui os valores de base e altura;
    Circulo: possui o atributo raio.
     */
    private interface GeometricShape {
        public double pi = 3.14;
        public double getArea();
    }
    public record Square(double side) implements GeometricShape{
        @Override
        public double getArea() {
            return side * side;
        }
    }
    public record Rectangle(double base, double height) implements GeometricShape{
        @Override
        public double getArea() {
            return base * height;
        }
    }
    public record Circle(double radius) implements GeometricShape{
        @Override
        public double getArea() {
            return pi * (radius * radius);
        }
        public double getRadius() {
            return radius;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeometricShape shape;



        while (true) {
            System.out.println("Calculo áreas de formas geométricas. O que deseja?");
            System.out.println("1. Área de um quadrado.");
            System.out.println("2. Área de um retângulo.");
            System.out.println("3. Área de um círculo.");
            System.out.println("4. Sair.");
            int option = scanner.nextInt();
            if(option == 1) {
                System.out.println("Informe o tamanho do lado do quadrado. ");
                double side = scanner.nextDouble();
                shape = new Square(side);
                System.out.println("A área do quadrado é de " + shape.getArea() + " u.a." );
            } else if(option == 2) {
                System.out.println("Informe o tamanho da base do retângulo. ");
                double base = scanner.nextDouble();
                System.out.println("Informe a altura do retângulo. ");
                double height = scanner.nextDouble();
                shape = new Rectangle(base, height);
                System.out.println("A área do retângulo é de " + shape.getArea() + " u.a." );
            } else if(option == 3) {
                System.out.println("Informe o raio do círculo. ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                System.out.println("A área do círculo é de " + shape.getArea() + " u.a.");
            } else if(option == 4) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
