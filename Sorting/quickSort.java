package Sorting;

public class quickSort {
    public static void main(String args[]){
        int arr[] = {0,12,12,34,2, -1,23 , 3,98,-98};
        System.out.println("Array before sorting : ");
        for(int i  =0 ;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        sortArray(arr , 0 , arr.length -1);
        System.out.println();
        System.out.println("Array after sorting : ");
        for(int i  =0 ;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }

    private static void sortArray(int[] arr, int left, int right) {
        if( left >= right)
                return;
        int partition = partitionArray(arr , left , right);
        sortArray(arr, left, partition -1);
        sortArray(arr, partition + 1, right);
    }

    private static int partitionArray(int[] arr, int left, int right){
        int pivot = arr[left];
        int i = left +1;
        int j = right;
        while(i <= j){
            while(i <= right && arr[i] <= pivot){
                i++;
            }
            while(j > left && arr[j] > pivot){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;

        return j;

    }
}
