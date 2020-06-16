import java.util.Scanner;

public class NumberTable
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter number ");            //asking for user input
        int num=scanner.nextInt();                             //storing user input into integer variable
        int num1=0;                                            //initialise variable
        if(num>0) {                                            //checking if num > 0
            for (int i = 1; i <= 10; i++) {
                num1 = num1 + num;                             //adding num
                System.out.println(num1);                      //printing after addition
            }
        }
        else
            System.out.println("please enter positive number only !!!!!!!!!!!!!");

    }
}
