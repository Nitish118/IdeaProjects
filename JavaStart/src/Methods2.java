import java.util.Scanner;

public class Methods2 {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
//        int ans = sum3(10, 20);
//        System.out.println(ans);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = in.next();

        String personalised = myGreet(name);
        System.out.println(personalised);

    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "How are you";
        return greeting;
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
