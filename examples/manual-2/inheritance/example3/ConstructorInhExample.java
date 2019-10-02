class A{
    public A(){
        System.out.println("A constructor");
    }
}
class B extends A {
    public B(){
        System.out.println("B constructor");
    }
}

public class ConstructorInhExample {
    public static void main(String ... args){
        B b = new B();

        // Output:
        // A constructor
        // B constructor
    }
}