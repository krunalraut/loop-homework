import java.util.Scanner;

public class NumberMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first number");    //asking for user input
        int num1 = scanner.nextInt();                       //storing user input into integer variable
        System.out.println("please enter second number");   //asking for user input
        int num2 = scanner.nextInt();                       //storing user input into integer variable
        int value1=1;                                 //initialised variable
        do {                                     //executing statements once before while condition
            int i = num1 * value1;
            value1++;
            int value = 1;
            do {                                  //executing statements once before while condition
                int matrix = i * value;           // calculating multiplicative value
                System.out.print(matrix + "  ");  //printing value in single line
                value++;
            }
            while ( value <= num2);
            System.out.println("");                 //taking to next line
        }

            while (value1 <= num2) ;


    }
}
