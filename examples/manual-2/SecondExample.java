

public class SecondExample {
    static class Grig {
        double length;
        String color;
        String name;

        Grig(String grigsName, String grigsColor, double grigsLength){
            name = grigsName;
            color = grigsColor;
            length = grigsLength;
        }

        void jump(){
            System.out.println(name + " is jumping");
        }

        void eat(){
            System.out.println(name + " is eating grass");
        }
    }



    public static void main(String[] args) {

        // создаем объект-кузнечик Bob
        Grig bob = new Grig("Bob", "brown", 5d);

        // создаем объект-кузнечик Alice
        Grig alice = new Grig("Alice", "green", 4.9d);


        bob.jump();     // Bob is jumping
        alice.jump();   // Alice is jumping
        bob.eat();      // Bob is eating grass
        alice.eat();    // Alice is eating grass

    }
}
