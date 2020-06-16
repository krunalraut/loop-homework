import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter five digit number");
        int num=scanner.nextInt();
        if(num>=10000 && num<100000) {             //checking if five digit number
            int first = num / 10000;               //extracting first number
            int last = num % 10;                   //extracting last number
            int total = first + last;              //adding numbers
            System.out.println("total of first & last digit is " + total);
        }
        else
        {
            System.out.println("please enter five digits only !!!!");
        }
    }
}
