package devdojologic.flowcontrol;

import java.util.Scanner;
/* Esse é o import necessário para a classe Scanner, cuja função é receber os dados do teclado.*/

public class E08Scanning {
    public static void main(String[] args) {
        // Desafio: usar o sistema do torneio de natação com dados inseridos pelo usuário.

        Scanner keyboard = new Scanner(System.in);
        /* Aqui é criado um objeto da classe Scanner, tendo como parâmetro a entrada (in) do sistema. */

        System.out.println("Digite o nome do participante: ");
        String name = keyboard.next();
        System.out.println("Digite a idade do participante: ");
        int age = keyboard.nextInt();
        String category = "";

        if(age < 10) {
            category = "Infantil";
        } else if(age >= 11 && age <= 15) {
            category = "Juvenil";
        } else if(age >= 16 && age <= 19) {
            category = "Pré-adulto";
        } else if(age > 20) {
            category = "Adulto";
        }
        System.out.println(name + " participará da categoria " + category);
    }
}
