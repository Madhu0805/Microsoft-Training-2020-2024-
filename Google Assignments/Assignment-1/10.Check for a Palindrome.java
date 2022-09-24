import java.util.*;
public class Main{
    public static void main(String[] args) {
          
        System.out.print("Enter any string : ");
        Scanner sc = new Scanner(System.in);
          
        //Original string
        String ch = sc.nextLine();
        int length = ch.length();
         
        boolean isPalindrome = true;  
         
        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
          if(ch.charAt(beginIndex) != ch.charAt(length-1-beginIndex)) {
            System.out.println("String is not a palindrome.");
            isPalindrome = false;
            break;
          }
        }
          
        if(isPalindrome) {
          System.out.println("String is a palindrome.");
        }
    }
}
