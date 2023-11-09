import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // Q: take input of 2 numbers and print the sum
//        Scanner in = new Scanner(System.in);
//
//        int num1, num2, sum;
//
//        System.out.println("Enter num1: ");
//        num1 = in.nextInt();
//        System.out.println("Enter num2: ");
//        num2 = in.nextInt();
//        sum = num1 + num2;
//        System.out.println("The sum: " + sum);
//        sum();
//        sum();
//        sum();
        greeting();
        int ans = sum2();
        System.out.println(ans);
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter num1: ");
        num1 = in.nextInt();
        System.out.println("Enter num2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum: " + sum);
    }

    static void greeting() {
        System.out.println("Hello world");
    }

    //return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter num1: ");
        num1 = in.nextInt();
        System.out.println("Enter num2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }

    /*
        accessModifier returnType name (arguments) {
            // body
            return statement;
        ]
     */
}
