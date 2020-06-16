import java.util.Scanner;

public class ReverseNum {
   static Scanner scanner = new Scanner(System.in);
    int num;

    public int method(int num) {                       //creating method for revers num

        int add = 0;
        while (num >= 1) {                             //checking num >=1
            int rev = num % 10;                        //extracting last digit from num
            add = add * 10 + rev;                      //adding last digit and multi by 10
            num = num / 10;                            //removing last digit
        }
        System.out.println(add);
        return(add);                                   //returning addition value
    }
    public static void main(String[] args) {
        ReverseNum reverseNum=new ReverseNum();        //creating object
        System.out.println("enter num");               //asking for user input
        reverseNum.num=scanner.nextInt();              //storing user input into instance variable
        reverseNum.method(reverseNum.num);             //calling parameterised method with object
    }
}
