package ajavafundamentals;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
    // Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a
    //    seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
        var scanner = new Scanner(System.in);
        var baseYear = OffsetDateTime.now().getYear();
        System.out.println("Informe o seu nome.");
        var name = scanner.nextLine();
        System.out.println("Informe o ano de seu nascimento.");
        int birthYear = scanner.nextInt();
        int age = baseYear - birthYear;
        System.out.printf("Olá, %s, você tem %d anos.\n", name, age);

    // Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
    //   fórmula: área=lado X lado
        System.out.println("Informe o comprimento do lado do quadrado para o cálculo de área.");
        double sideLength = scanner.nextDouble();
        double squareArea = sideLength * sideLength;
        System.out.printf("A = l X l --> A = %.1f X %.1f = %.1f u.a.\n", sideLength, sideLength, squareArea);

    // Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
    //        fórmula: área=base X altura
        System.out.println("Informe o comprimento da base do retângulo para o cálculo de área.");
        double rectangleBase = scanner.nextDouble();
        System.out.println("Informe a altura do retângulo para o cálculo de área.");
        double rectangleHeight = scanner.nextDouble();
        double rectangleArea = rectangleBase * rectangleHeight;
        System.out.printf("A área do retângulo é igual a %.0f u.a.\n", rectangleArea);

    // Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
        System.out.println("Comparador de idades.\nInforme a primeira idade.");
        int age1 = scanner.nextInt();
        System.out.println("Informe a segunda idade.");
        int age2 = scanner.nextInt();
        int difference = age1 - age2;
        System.out.printf("Diferença entre as idade: %d anos.", difference);
    }
}
