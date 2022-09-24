import java.util.*;
class Pascal_Triangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j,a[][],s;
        System.out.println("HOW MANY STEPS?");
        n=sc.nextInt();
        s=n-1; 
        a=new int[n][n];
        
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++)
                if(j==0 || j==i)
                    a[i][j]=1;
                else
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
        }
        
        System.out.println("\nOUTPUT:\n");
        for(i=0;i<n;i++)
        {
            for(j=0;j<=s;j++)
            System.out.print(" ");
            
            s--;
            
            for(j=0;j<=i;j++)
                System.out.print(a[i][j]+" ");

            System.out.println();
        }
    }
}
