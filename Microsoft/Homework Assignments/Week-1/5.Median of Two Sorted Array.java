import java.util.*;
class Solution {
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
int arr[]=IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2)).sorted().toArray();
int a=arr.length;
if(a%2==0) return (double)(arr[a/2-1]+arr[a/2])/2;
else return (double)arr[(a+1)/2-1];
}
}
