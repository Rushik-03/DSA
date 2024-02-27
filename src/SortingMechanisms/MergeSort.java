package SortingMechanisms;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void divide(int[] arr,int start, int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr, int start, int mid, int end){
        ArrayList<Integer> list = new ArrayList<>();
        int left = start;
        int right = mid+1;
        while(left <= mid && right<= end){
            if(arr[left] < arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            list.add(arr[left]);
            left++;
        }
        while(right<= end){
            list.add(arr[right]);
            right++;
        }
        for (int i = start; i <= end; i++) {
            arr[i] = list.get(i - start);
        }
    }
}
