public class Palindrom extends ReverseNum{  //extends parent class reverseNum
    public static void main(String[] args) {
       Palindrom palindrom=new Palindrom();   //created object for child class
        System.out.println("please enter number"); // asking for user input
        palindrom.num=scanner.nextInt();           //storing user input into variable of parent class
       if(palindrom.num==palindrom.method(palindrom.num)) //checking user number with reverse method output for reverse number
       {
           System.out.println("you have enter palindrome number");
       }
       else
       {
           System.out.println("you have not enter palindrome number");
       }


    }

}
