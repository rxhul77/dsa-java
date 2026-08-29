package arrays;

import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the Element of Array: ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Largest Number of the array: "+ max);
    }
}