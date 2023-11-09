import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
//        VarArgs -> Variable Arguments that is when we do not know how many inputs we are giving
        fun(2, 3, 4, 5, 6, 7, 8);
//        fun(); -> empty array
//        multiple(2, 3, "Nitish", "David");
//        demo(2, 3, 4);
        demo("Nitish", "David");
    }

    static void multiple(int a, int b, String ...v) {  // variable length arguments should always be last in the list

    }

    static void demo (int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo (String ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v) {  // v -> variable (can be anything)
        System.out.println(Arrays.toString(v));
    }

}
