public class BlockOfInitExample{

    private int a = 0;
    private static int b = 0;


    {
        a = 10;
    }

    static {
        b = 10;
    }

    public static void main(String ... args){

        System.out.println("b: " + b);                          // 10

        System.out.println("a: " + new BlockOfInitExample().a); // 10
    }

}