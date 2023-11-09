public class Methods3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);
//        System.out.println(a + " " + b);

        String name = "Nitish";
        changeName(name);
        System.out.println(name);

    }

    // primitives: int, short, char, byte ... -> pass by value (just passing value)
    // objects and references: -> passing the value of the reference variable (eg. name and naam pointing to the same object)

    static void changeName(String name) {
        name = "David";
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num2 = num2;
        num2 = temp;
//        System.out.println(a + " " + b);
        // Any changes made inside this function will be valid in this function scope only
    }

}
