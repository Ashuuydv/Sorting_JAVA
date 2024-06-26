import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("enter the digits of the array : ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        //insertion sort

        for(int i = 1; i < n; i++){
            for(int j = i; j >= 1 && (arr[j] < arr[j-1]); j--){  //optimized code
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}