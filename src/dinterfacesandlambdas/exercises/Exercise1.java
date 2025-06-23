package dinterfacesandlambdas.exercises;

import java.util.Scanner;

public class Exercise1 {
    /* Escreva um código para enviar mensagens de marketing, para isso você deve ter a possibilidade de enviar
    a mesma mensagem para serviços diferentes, esses serviços devem ter um método para receber a mensagem como
    parâmetro, os serviços que devem estar disponíveis são:
    SMS;
    E-mail;
    Redes Sociais;
    WhatsApp;
    */
    private interface MsgService {
        void sendMessage(String message);
    }
    public static class SmsService implements MsgService {

        @Override
        public void sendMessage(String message) {
            System.out.println("Enviando mensagem via SMS:\n" + message + "\n");

        }
    }
    public static class EmailService implements MsgService {

        @Override
        public void sendMessage(String message) {
            System.out.println("Enviando mensagem via e-mail:\n" + message + "\n");
            System.out.println(message);
        }
    }
    public static class SocialNetwork implements MsgService {

        @Override
        public void sendMessage(String message) {
            System.out.println("Enviando mensagem via redes sociais:\n" + message + "\n");
        }
    }
    public static class WhatsAppMsg implements MsgService {

        @Override
        public void sendMessage(String message) {
            System.out.println("Enviando mensagem via WhatsApp:\n" + message + "\n");
        }
    }

    public static void main(String[] args) {
        String message;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Central de mensagens de marketing. Escolha um serviço para enviar uma mensagem.");
            System.out.println("1. SMS");
            System.out.println("1. E-mail");
            System.out.println("3. Redes sociais");
            System.out.println("4. WhatsApp");
            System.out.println("5. Sair");

            int option = Integer.parseInt(scanner.nextLine()); // Sem a conversão, o próximo nextLine() é desprezado.

            if(option == 1) {
                MsgService service = new SmsService();
                System.out.println("Digite a mensagem que deseja enviar.");
                message = scanner.nextLine();
                service.sendMessage(message);
            } else if(option == 2) {
                MsgService service = new EmailService();
                System.out.println("Digite a mensagem que deseja enviar.");
                message = scanner.nextLine();
                service.sendMessage(message);
            } else if(option == 3) {
                MsgService service = new SocialNetwork();
                System.out.println("Digite a mensagem que deseja enviar.");
                message = scanner.nextLine();
                service.sendMessage(message);
            } else if(option == 4) {
                MsgService service = new WhatsAppMsg();
                System.out.println("Digite a mensagem que deseja enviar.");
                message = scanner.nextLine();
                service.sendMessage(message);
            } else if(option == 5){
                System.out.println("Encerrando o programa...");
                break;
            } else System.out.println("Opção inválida. Tente novamente.");
        }
        scanner.close();
    }
}
