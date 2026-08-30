package arrays;
import java.util.*;

public class SumOfElement {
    public static void main(String []args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the Element of array: ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of the element of the array : " + sum);
    }
}
