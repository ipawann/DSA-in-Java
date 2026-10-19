package Sorting;

public class mergeSort {
    public static void main(String[] args){
        int arr[] = { 69,23,45,-1,-20,-30,0,9,99};
        System.out.println("Array before sorting: ");
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sortArray(arr,0,arr.length-1);
        System.out.println("Array after sorting: ");
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortArray(int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left)/2;
            sortArray(arr, left , mid);
            sortArray(arr, mid + 1 , right);
            merge(arr, left, mid , right);
        }
    }

    public static void merge(int[] arr, int low , int mid , int high){
        int n1 = mid - low +1;
        int[] arr1 = new int[n1];
        for(int i = low;i<= mid;i++){
            arr1[i - low] = arr[i];
        }

        int n2 = high - mid;
        int[] arr2 = new int[n2];
        for(int i = mid +1; i <= high;i++){
            arr2[i - (mid +1)] = arr[i];
        }

        int i = 0 , j = 0 , k = low;
        while(i <  n1 && j < n2 ){
            if(arr1[i] <= arr2[j])
                arr[k++] = arr1[i++];
            else
                arr[k++] = arr2[j++];
        }

        while(i < n1){
            arr[k++] = arr1[i++];
        }

        while(j < n2){
            arr[k++] = arr2[j++];
        }
    }
}
