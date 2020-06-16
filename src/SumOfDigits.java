import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter five digit number");
        int num = scanner.nextInt();
        int add=0;
        if(num>=10000 && num<100000)           //checking if number is five digit
        {
        while (num >=1)                      //executing statements untill num>=1
        {
          int a= num%10;                     //extracting last digit from number
          add=a+add;                          //adding last digit after every loop
          num=num/10;                         //removing last digit
        }
        System.out.println("addition of each digit is "+add);    //printing addition value
        }
        else
        {
            System.out.println("please enter five digit only!!!!!");
        }
    }
}
