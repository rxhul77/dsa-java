package arrays;
public class BubbleSort {
    public static void print(int [] arr) {
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();    
    }
    public static void main (String [] args) {
        int [] arr = { 4 , 3 , 9 , 2 , 10 , 7 , 5 , -2 , 9};
        // int [] arr = {2 , 7 , 3 , 10 , -2 , 6 , 7};
        int n = arr.length;
        
        print(arr);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
}
