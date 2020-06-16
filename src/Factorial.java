import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter single digit number "); //asking for user input
        int num=scanner.nextInt();                             //storing user input into integer variable
        long factor=1;                                        //initialised variable
        if(num>=9) {                                         //checking if number is single digit
            while (num >= 1) {                                //execute statement till num >= 1
                factor = factor * num;                  //multiply each decremental value
                num--;                                   //decreasing number
            }
            System.out.println(factor);              //printing multiplicating value outside while loop
        }
        else
        {
            System.out.println("please enter single digit number only!!!!!!");
        }
    }
}
