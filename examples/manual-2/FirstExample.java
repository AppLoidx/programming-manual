/**
 * @author Arthur Kupriyanov
 */
class Grig {

    double length;
    String color;
    String name;

    void jump(){
        System.out.println(name + " is jumping");
    }

    void eat(){
        System.out.println(name + " is eating grass");
    }
}

public class FirstExample {
    public static void main(String[] args) {

        // создаем объект-кузнечик Bob
        Grig bob = new Grig();

        bob.name = "Bob";
        bob.length = 5d;
        bob.color = "brown";

        // создаем объект-кузнечик Alice
        Grig alice = new Grig();
        alice.name = "Alice";
        alice.length = 4.9d;
        alice.color = "green";

        bob.jump();     // Bob is jumping
        alice.jump();   // Alice is jumping
        bob.eat();      // Bob is eating grass
        alice.eat();    // Alice is eating grass

    }

}


