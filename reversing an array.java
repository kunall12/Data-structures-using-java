import java.util.*;
public class Main{
    public static void reverseArray(int[] array) {
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            // Swap elements
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            // Move pointers
            i++;
            j--;
        }
       
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter elements of array:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("array");
        for(int i=0;i<n;i++){
            System.out.print(array[i]);
        }
        System.out.println();
        reverseArray(array);
        System.out.println("reversed array");
        for(int i=0;i<n;i++){
            System.out.print(array[i]);
        }
    }
}
