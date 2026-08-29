package arrays;
import java.util.*;
public class NegetiveElements {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the Elements of Array: ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        
        }

        System.out.println("Negative Elements : ");
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0 ) {
                System.out.println(arr[i]);
            }
        }
    }
}
