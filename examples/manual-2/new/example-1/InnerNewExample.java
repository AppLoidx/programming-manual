public class InnerNewExample {
    private class Inner {};
    public static void main (String ... args){
        InnerNewExample obj = new InnerNewExample();
        Inner innerObj = obj.new Inner();
    }
}