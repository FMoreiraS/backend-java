package devdojologic.flowcontrol;

/* HISTÓRIA DE USUÁRIO:
 * Eu como cliente gostaria de ter o nome e a idade de participantes de um torneio
 * de natação e que o sistema imprimisse da seguinte forma:
 * Menor que 10 anos: <nome> participará da categoria Infantil;
 * entre 11 e 15 anos: <nome> participará da categoria Juvenil;
 * entre 16 e 19 anos: <nome> participará da categoria Pré-adulto;
 * Acima de 20 anos: <nome> participará da categoria Adulto
 * para que eu possa classificar rapidamente todos os participantes.
 */
public class E07IfElseIf {
    public static void main(String[] args) {

        String name1 = "José";
        int age1 = 9;
        String category1 = "";

        if(age1 < 10) {
            category1 = "Infantil";
        } else if(age1 >= 11 && age1 <= 15) {
            category1 = "Juvenil";
        } else if(age1 >= 16 && age1 <= 19) {
            category1 = "Pré-adulto";
        } else if(age1 > 20) {
            category1 = "Adulto";
        }
        /* Nesse sistema não é possível usar ||, ambas as proposições que definem a categoria precisam
        * ser verdadeiras, pois é possível que apenas uma seja verdadeira e um valor maior que o limite
        * superior seja desrespeitado, se for usada uma idade maior que 19. Assim um atleta ficaria
        * alocado na categoria precedente porque a idade também é maior que 16.
        */
        System.out.println(name1 + " participará da categoria " + category1);
    }
}
