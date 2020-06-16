import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter number ");    //asking for user input
        int num=scanner.nextInt();                   //storing user input in integer variable
        int check=num;                          //assigned user input value to other variable
        int add=0, count=0, arm=0;              //initialised integer variable
        for (int i=num;i>=1;count++) {  //executing loop for counting number of digit
            i = i / 10;
        }
        while(num>=1)        //execute loop till num=>1
        {
            int mult=1;             //initialised variable to store multiplication
            for(int j=1; j<=count; j++) //for getting last digit & multiply
            {
                int k=num%10;  //to get last digit after every loop
                mult=mult*k;  //multiplicating last digit after every loop
            }
            num=num/10;  //  remove last digit from number
            arm=arm+mult; //adding multiplicative value
        }
        if(arm==check) {   //checking if user enter value equal to addition value
            System.out.println("number you entered " + check+ " is Armstrong number");
        }
        else
            System.out.println("your number is not Armstrong number");
    }
}
