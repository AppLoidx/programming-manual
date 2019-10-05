class A {
    A(){
        System.out.println("constructor [A]");
    }
    static {
        System.out.println("static block of init [A]");
    }

    {
        System.out.println("block of init [A]");
    }
}

class B extends A {
    B(){
        System.out.println("constructor [B]");
    }
    static {
        System.out.println("static block of init [B]");
    }

    {
        System.out.println("block of init [B]");
    }
}

public class BlockOfInitExample3 {
    public static void main(String ... args){
        System.out.println("First B init:");
        new B();
        System.out.println("Second B init:");
        new B();
    }
}

// Output:

// First B init:
// static block of init [A]
// static block of init [B]
// block of init [A]
// constructor [A]
// block of init [B]
// constructor [B]

// Second B init:
// block of init [A]
// constructor [A]
// block of init [B]
// constructor [B]