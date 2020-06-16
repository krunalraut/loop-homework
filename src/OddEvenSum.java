import java.util.Scanner;

public class OddEvenSum
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter five digit number"); //asking for user input
        int num=scanner.nextInt();                            //storing user input into integer variable
        int even=0, counteven=0, odd=0, countodd=0 ;  //initialised variable
        while( num>=1) {                             //executing statements in loop till num>=1

            int sum1=num%10;                 //extracting last digit
            if(sum1%2==0) {                  //checking if extracted digit is odd or even
                even = sum1 + even;           //adding each even number
                counteven=counteven+1;       //counting even number
            }
            else
            {
                odd=odd+sum1;               //adding odd number
                countodd=countodd+1;          //counting odd numbers
            }
            num=num/10;                   //removing last digit
            }
        System.out.println("even numbers are "+counteven);
        System.out.println("sum of even number "+even);
        System.out.println("odd numbers are "+countodd);
        System.out.println("sum of odd number "+odd);
    }
}
