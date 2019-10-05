public class BlockOfInitExample2 {

    private int a = 0;
    private static int b = 0;

    {
        System.out.println("non-static block");
        a = 10 + a;
        b = 60 + b;     // можем изменять статические поля
    }

    static {
        System.out.println("static block");
        b = 55;

        // мы не можем здесь определить переменную "a"
        // a = 90;
    }

    private void printValues(){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String ... args){
        
        new BlockOfInitExample2().printValues();
        // static block
        // non-static block
        // a: 10
        // b: 115       // 55 + 60

        new BlockOfInitExample2().printValues();
        // non-static block
        // a: 10
        // b: 175       // 115 + 60

        new BlockOfInitExample2().printValues();
        // non-static block
        // a: 10
        // b: 235       // 175 + 60
    }

}