import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
//testting selection sort
        int[] arr={4,3,1,6,2,9,11,0};
        quick(arr);
        System.out.println(Arrays.toString(arr));
}
public static void quick(int[] arr){
    for (int i = 0; i <arr.length ; i++) {
        int k=i;
        for (int j = i+1; j <arr.length ; j++) {
            if(arr[k]>arr[j]){
                k=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[k];
        arr[k]=temp;
    }
}
}
