
import java.util.*;
class PerfectSquareNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        double root = Math.sqrt(num);
        
        if((Math.floor(root) - root)==0){
             System.out.println(num+" is a Perfect Square Number");
        }
        else{
            System.out.println(num+" is Not a Perfect Square Number");
        }
    }     
}
