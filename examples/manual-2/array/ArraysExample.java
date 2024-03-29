public class ArraysExample {
    public static void main(String ... args){
        int[] a1 = {1, 2, 3, 4, 5}; // выделение памяти (new) производится компилятором
        int a2[];
        
        a2 = a1;    // присваиваем ссылку, а не значения

        for (int i = 0; i < a2.length; i++){
            a2[i] = a2[i] + 1;
        }

        for (int i = 0; i < a1.length; i++){
            System.out.printf("a1[%d] = " + a1[i] + "\n", i);
        }
    }
}

// Output:
// a1[0] = 2
// a1[1] = 3
// a1[2] = 4
// a1[3] = 5
// a1[4] = 6