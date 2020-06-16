import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter starting number"); //asking user to enter initial number
        int num1=scanner.nextInt();                         //storing user input into integer variable
        System.out.println("please enter ending number");   //asking user to enter last number
        int num2=scanner.nextInt();                         // storing user input into integer  variable
        int negcount=0, count0=0,countpos=0;                //initialise variable
        for(int i=num1;i<=num2;i++)                         //executing statements untill num1==num2
        {
            if(i<0)                                         //executing if num is negative
            {
                negcount++;                                //counting negative numbmer
            }
            else if(i==0)                                  //executing if num is zero
            {
                count0++;                                  //counting zero
            }
            else                                          //if all above condition fail
            {
                countpos++;                               //counting positive number
            }
        }
        System.out.println("there are "+negcount+" negative numbers in given range");
        System.out.println("there are "+countpos+" positive numbers in given range");
        System.out.println("there are "+count0+" zero numbers in given range");
    }
}
