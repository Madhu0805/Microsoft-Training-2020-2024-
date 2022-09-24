import java.io.*;
import java.lang.*;
class Mean{
    public static void main(String[] args){
        int[] arr = new int[]{2,4,5,2,6};
        int num=5;
        double tot=0;
        double mean=0;
        for(int i=0; i<num; i++){
            tot = tot+arr[i];
        }
        mean = tot/num;
        System.out.println("The mean value is: "+mean);
        
    //Median calculation
        double median = 0;
        double mid=0;
        if(num%2 == 0){
            int temp=(num/2)-1;
            for(int i=0;i<num;i++){
                if(temp==i || (temp+1)==i){
                    mid=mid+arr[i];
                }
            }
            mid=mid/2;
            System.out.println("Median value is: "+mid);
        }
        else{
           int temp=(num/2);
           for(int i=0;i<num;i++){
                if(temp==i){
                    mid=arr[i];
                    System.out.println("Median value: "+mid);
                }
            }
        }
    //Mode calculation
        int i,j,z, tmp, maxCount, modeValue;
        int[] tally=new int[num];
        for(i=0;i<num;i++){
            for(j=0;j<num-i;j++){
                if(j+1!=num){
                    if(arr[j]>arr[j+1]){
                        tmp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=tmp;
                    }
                }
            }
       }
       for (i = 0; i < num; i++){
            for(z=i+1;z<num;z++){
                if(arr[i]==arr[z]){
                   tally[i]++;
                }
       }
    }
    maxCount = 0;
    modeValue = 0;
    for (i = 0; i <num; i++){
        if (tally[i] > maxCount){
            maxCount = tally[i];
            modeValue = arr[i];
        }
    }
    System.out.println("Mode value is :"+modeValue);
    }
}
