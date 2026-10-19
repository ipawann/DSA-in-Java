package Sorting;

public class bubbleSort {
    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array before sorting: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        bubbleSortArray(arr);
        System.out.println();
        System.out.println("Array after sorting: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSortArray(int arr[]){
        int n = arr.length;
        boolean swapped = false;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    // swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
                if(!swapped)
                    break;
            }
        }
    }

}
