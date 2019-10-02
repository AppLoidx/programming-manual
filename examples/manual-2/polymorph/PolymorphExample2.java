class A {
    public void doSome(){
        System.out.println("A doing something");
    }
}

class B extends A{
    @Override
    public void doSome(){
        System.out.println("B doing something");
    }


    // еще какой-то метод
}


public class PolymorphExample2{
    public static void main(String ... args){
        A obj1 = new A();
        A obj2 = new B();   // полиморфизм in action!

        obj1.doSome();      // A doing something
        obj2.doSome();      // B doing something
    
        // добавить вызов метода здесь
    }
}