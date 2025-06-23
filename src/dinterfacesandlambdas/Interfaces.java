package dinterfacesandlambdas;

public class Interfaces {
    /* INTERFACE: é o maior nível de abstração.
    Java não permite herança múltipla, ou seja, uma classe não pode estender mais de uma classe abstrata:
    isso gera a necessidade de criar, não classes abstratas para serem estendidas por novas classes, mas
    interfaces que poderão ser implementadas conjuntamente por qualquer classe, usando "implements", ao
    invés de "extends".
     */
    public interface Knight {
        public void ride();
    }
    public interface Pawn {
        public void cut();
    }
    public interface Archer {
        public void shoot();
    }
    static class General implements Pawn, Knight, Archer {
        public String name;
        public void ride() {
            System.out.println("O general está cavalgando");
        }
        public void cut(){
            System.out.println("O general cortou com uma espada");
        }
        public void shoot(){
            System.out.println("O general atirou uma flecha");
        }
    }
    static class Battlefield {
        public static void main(String[] args) {
            General general = new General();

            Pawn pawn = general;
            Knight knight = general;
            Archer archer = general;

            pawn.cut();
            knight.ride();
            archer.shoot();
    /* Note-se que podemos usar sem erro um objeto da classe que implementa as interfaces como se fosse
    um objeto pertencente a várias classes comuns.
    Todos os atributos das interfaces só podem ser public, static e final, e os métodos só podem ser abstratos
    e públicos ou apenas privados, neste último caso devendo ter um corpo.
    O uso de interfaces permite a criação das chamadas "classes anônimas", classes sem tipo definido, criadas
    junto à declaração de uma instância que implementa uma interface.
     */
        var anonymousWarrior = new Knight(){
          public void ride() {
              System.out.println("Um desconhecido cavalga no campo de batalha.");
          }
        };
        anonymousWarrior.ride();
        }
    }
    // Similarmente às classes, as interfaces podem ser estendidas por outras interfaces:
    public interface Lancer extends Knight {
        private void Strike() {
            System.out.println("O cavaleiro golpeia com uma lança.");
        }
    }
    // Os records também podem implementar interfaces, já que, aceitando apenas propriedades constantes, não estão
    // impedidos de implementar os métodos abstratos das interfaces.
    public record Sentry (String post) implements Archer {
        public void shoot() {
            System.out.println("O sentinela atira num inimigo.");
        }
    }
    /* Cabe ter atenção com o uso de classes que implementam várias interfaces. Não seria possível usar métodos
    exclusivos de uma interface num objeto declarado primeiro como de um tipo mais restrito e depois como de outro
    tipo mais abrangente.
     */
    public static void warCry(General general) {
        System.out.println("O general deu o grito de guerra.");
    }
    public static void main(String[] args) {
        Archer archer = new General();
        archer.shoot();
        // Nisto há problema:
        //archer.ride();
        // O único meio de resolver é o casting; se o objeto for um parâmetro, pode ser substituído:
        ((General)archer).shoot();
        warCry(new General());

    /* INTERFACES FUNCIONAIS: são interfaces que podem ter apenas um método para ser implementado pelas classes
    e vários métodos "default" - métodos que podem ter corpo e, portanto, definir comportamentos para uma
    interface, embora possam ser sobrescritos.
    Interfaces funcionais geralmente acompanham expressões lambda, por isso convém usar a anotação
    @FunctionalInterface, para chamar atenção a essa possibilidade.

     OBS: modificador de acesso padrão (sem indicação), permite o acesso apenas à classes do mesmo pacote.
     */
    }
}
