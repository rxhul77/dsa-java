package arrays;
import java.util.*;

public class ProductOfElement {
    public static void main(String []args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the Element of array: ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int p = 1;
        for (int i = 0; i < arr.length; i++) {
            p *= arr[i];
        }
        System.out.println("Product of the element of the array : " + p);
    }
}
