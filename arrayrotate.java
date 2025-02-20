import java.util.Arrays;

public class arrayrotate {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        int k=1;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }

    static void reverse(int[] arr , int start,int end){
        int temp;
        while(start < end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }  
}
