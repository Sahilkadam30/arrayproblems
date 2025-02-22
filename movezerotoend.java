
import java.util.Arrays;

public class movezerotoend {
    public static void main(String[] args) {
        
        int[] arr= {5,0,7,3,0,4,0,9,0};
        moverzero(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void moverzero(int[] arr){
        int n = arr.length;
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index]=arr[i];
                index++;
            }
        }
        
        while (index < n) {
            arr[index++] = 0;
        }
    }
}
