package SortingMechanisms;
import java.util.*;
public class InsertionSort{//select the min and swap with the current element

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
       for(int i=0;i<n;i++){
           for(int j=i;j>0;j--){
               if(arr[j]<arr[j-1]){
                   int temp = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j] =temp;
               }
           }
       }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

    }
}

