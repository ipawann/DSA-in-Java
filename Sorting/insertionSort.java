package Sorting;

public class insertionSort {
    public static void main(String[] args){
        int arr[] = {69,23,45,-1,-20,-30,0,9,99};
        System.out.println("Array before sorting: ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertionSortArray(arr);
        System.out.println("Array after sorting: ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSortArray(int arr[]){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while ( j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
