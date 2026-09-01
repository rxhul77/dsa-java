package arrays;

public class IndexedElement {
    public static void main(String []args) {

        int [] arr = {2 , 5 , 8 , 6 , 10};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) arr[i] += 10; 
            else arr[i] *= 2;
            
        System.out.print(arr[i] + " ");
        }
    }
}
