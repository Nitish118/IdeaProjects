import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int n = in.nextInt();
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);
//        while(true) {
            System.out.print("Enter number: ");
            int n = in.nextInt();
////            if(n == 0) {
////                break;
////            }
            System.out.println(isPrime(n));
////            temp();
//        }
//        for (int i = 100; i < 1000 ; i++) {
//            if (isArmstrong(i)) {
//                System.out.print(i + " ");
//            }
//        }

    }

    // print all the 3 digit armstrong numbers
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum += cube;
            n /= 10;
        }
        return sum == original;
    }

    static void temp() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temp in celcius: ");
        int tempC = in.nextInt();
        int tempF = (tempC * 9/5) + 32;
        System.out.println("Temp in fahrenheit: " + tempF);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while(c * c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;



    }

}
