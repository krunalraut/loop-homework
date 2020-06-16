import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number");                    //asking for user input
        int num=scanner.nextInt();                                    //storing user input into integer variable
        if(num%2==0 || num%3==0 || num%5==0 || num%7==0)              //checking if num is divisible by 2,3,5,7
        {
            System.out.println("you have enter "+num+" is not prime number" );    //printing if above condition true
        }
        else
        {
            System.out.println("you have enter "+num+" is prime number" );    //printing if above condition false
        }
    }
}
