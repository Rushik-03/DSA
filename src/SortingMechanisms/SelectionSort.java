package SortingMechanisms;
import java.util.*;
public class SelectionSort {//select the min and swap with the current element

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            min =arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
