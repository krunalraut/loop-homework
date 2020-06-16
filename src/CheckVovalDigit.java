import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.StrictMath.PI;
import static java.lang.StrictMath.round;

public class CheckVovalDigit {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter string ");    //asking for user input
        String s=scanner.next();                        //storing user input into string variable
        int leangth=s.length();      //find out length of string
        int countnum=0;              //initialised variable to count numbers
        int countvow=0;
        for (int i=0; i<=leangth-1;i++)  //executing from first character to last character of string
        {
            char ch=s.charAt(i);     //extracting character at particular position in string
            if(ch>='0'&& ch<='9')    //checking if char is number
            {
                countnum++;          //count if above conition true
            }
            else if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')   //checking if char is vowel
            {
                countvow++;         //count if above condition true
            }
            else if(ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='O')
            {
                countvow++;
            }
        }
        float countvo=(int) countvow;                //convert integer value into float value
        float countnu=(int) countnum;               //convert integer value into float value
        float numAverage=(countnu/leangth)*100 ;    //calculating average of number in string
        float vowAverage=(countvo/leangth)*100 ;      //calculating average of vowel in string
        DecimalFormat df = new DecimalFormat("##.##");         //creating object for decimal format for two digit after decimal
        System.out.println("number of vowels "+countvow+ "  ("+df.format(vowAverage)+"%)");
        System.out.println("number of digits "+countnum+"  ("+df.format(numAverage)+"%)");
    }
}