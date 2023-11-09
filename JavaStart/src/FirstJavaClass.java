import java.util.Arrays;
import java.util.Scanner;

public class FirstJavaClass {
    public static void main(String[] args) {
        // int, float, char, String, long, double
//        int age = 20;
//        float marks = 19.345f;
//        char grade = 'A';
//        String name = "Nitish";
//        boolean isValid = false;
//
//        long bigNumber = 928372937293829l;

//        System.out.println(marks);
//        System.out.println(age);
//        System.out.println(bigNumber);

        //operators
        // +, -, /, *, %, ++, --

//        int firstNum = 1234;
//        int secondNum = 234;

//        double sum = (double)firstNum % (double)secondNum;
//        System.out.println(sum);

//        int a = 12;
//        a++; // a = a+1
//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(++a);
//        System.out.println(a);
//        a--;

//        System.out.println(a);

        //assignment operator =

        // Taking user input

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter age: ");
////        int age = in.nextInt();
////        float age = in.nextFloat();
//        String age = in.nextLine();
//        System.out.println(age);

//        int age = 12;

        // conditional operators ->    >, <, >=, <=, ==, !=
//        System.out.println(19 != 18);

//        if (age > 18) {
//            System.out.println("You can vote");
//        }
//        else {
//            System.out.println("You cannot vote");
//        }

//        char grade = 'D';
//
//        if(grade == 'A') {
//            System.out.println("Your grade is very good");
//        }
//        else if(grade == 'B') {
//            System.out.println("very good, keep learning");
//        }
//        else if(grade == 'D') {
//            System.out.println("Keep improving");
//        }
//        else {
//            System.out.println("invalid grade");
//        }


        // Switch case

//        char grade = 'A';
//
//        switch (grade) {
//            case 'A':
//                System.out.println("Your grade is very good");
//                break;
//            case 'B':
//                System.out.println("very good, keep learning");
//                break;
//            case 'C':
//                System.out.println("Nice keep going");
//                break;
//            default:
//                System.out.println("Invalid");
//        }

        // logical operators ->  &&, ||, !

//        int age = 12;
//
//        if(!(age > 18)) {
//            System.out.println("You can vote");
//        }
//        else {
//            System.out.println("You cannot vote");
//        }

        // Loops ->  for, while, do-while

        //for
        //for(;;) -> infinite for-loop
//        for(int i=0; i<10; i++) {
//            System.out.println("Nitish" + i);
//        }

        // while
        // while(true) -> infinite while-loop

//        int b = 23;
//        while(b <= 100) {
//            b++;
//            if(a == 65) {
//                continue;
//            }
//            System.out.println(b);
//            b++;
//        }

        // do-while
//        do {
//            System.out.println(b);
//            b++;
//        } while(b > 100);


        // Arrays

//        int marks[] = new int[5];
//        marks[0] = 23;
//        marks[1] = 12;
//        marks[2] = 56;
//        marks[3] = 34;
//        marks[4] = 99;

//        int marks[] = {23, 12, 56, 34, 99, 45, 78};
//
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }

        // Matrix

//        int a[][] = new int[2][3];
//        int c[][] = { {1, 2},
//                {3, 4}};
//        System.out.println(c[0][1]);

//        System.out.println(average(3, 6));
//        System.out.println(average(4, 6));

        // Exception Handling
        int a[] = new int[3];
        try {
            System.out.println(a[4]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("print line");


    }

    // Methods / Functions
    // syntax -> returnType functionName (argument) {--code--}

//    static int average(int firstNumber, int secondNumber) {
//        int sum = firstNumber + secondNumber;
//        return sum / 2;
//    }


}

// Classes
class classname {
    // A class has 2 things -> variables and methods/functions
    // instance variables
    int var1;
    String var2;

    // methods
    void method1(/*parameters*/) {
        // body of method
    }

    int method2(/*parameters*/) {
        // body of method
        return 0;
    }



}


