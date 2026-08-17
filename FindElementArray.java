import java.util.Scanner;

public class FindElementArray {
        public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
   
 
    System.out.print("Enter the number of elements in the array: ");
    int n = scn.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++) {
    arr[i] = scn.nextInt(); // Store each input value in the array
    }

      System.out.print("Enter the element to search for: ");
    int d = scn.nextInt();
    int ans = find(arr, d);


    System.out.println(ans);
    }


    public static int find(int[] arr, int d) {

  
    for(int i = 0; i < arr.length; i++) {
    if(arr[i] == d) { // If the element is found
    return i; // Return the index of the element
    }
    }

    // If the element is not found, return -1
    return -1;
    }
}