package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array before sorting: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        selectionSortArray(arr);
        System.out.println();
        System.out.println("Array after sorting: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSortArray(int[] arr){
        int n = arr.length;

        for(int i = 0;i<n-1;i++){
            int minindex = i;{
                for(int j = i+1;j<n;j++){
                    if(arr[j] < arr[minindex]){
                        minindex = j;
                    }
                }
                if(minindex != i){
                        //swap the numbers
                        int temp  = arr[minindex];
                        arr[minindex] = arr[i];
                        arr[i] = temp;
                }
            }
        }
    }
}
