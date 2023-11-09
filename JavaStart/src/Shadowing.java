public class Shadowing {
    static int x = 90; // So this x will be available to everything that comes inside the block of class Shadowing
    // this x will be shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x;
//        System.out.println(x); // scope will begin when value is initialised
        x = 40;
        System.out.println(x); // 40
        fun();
    }
    static void fun() {
        System.out.println(x);
    }
}
