public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Nitish";
        {
//            int a = 78; -> error as already initialised outside the block, hence it cannot initialised again
            a = 100; // reassign the origin reference variable to some other value
            System.out.println(a);
//            a = 78; -> can be modified
            int c = 99;
            // values initialised in this block, will remain in the block
            name = "David";
            System.out.println(name);
        }
//        System.out.println(c); -> cannot use outside the block
        System.out.println(a);
        System.out.println(name);


        // Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
//            int a = 10; -> already initialised outside
        }
        /*
            Scoping -> Anything initialised outside the block can be used inside the block, but anything that is
            initialised inside the block cannot be used outside
            AND
            Anything that is initialised outside the block cannot be again initialised inside the block but can be updated
            and anything that is initialised inside the block can be again initialised outside the block
         */

    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
