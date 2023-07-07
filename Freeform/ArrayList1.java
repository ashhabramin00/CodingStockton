import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 
{
    public static void main(String[] args) {
        // a) Declare an arrayList nums of 15 elements of type int.
        ArrayList<Integer> nums = new ArrayList<>(15);
        
        // b) Output the value of the tenth element of the array nums.
        System.out.println("The value of the 10th element is: " + nums.get(9));
        
        // c) Set the value of the 5th element of the array nums to 99.
        nums.set(4, 99);
        
        // d) Set the value of the 13th element to 15
        nums.set(12, 15);
        
        // e) Set the value of the 2nd element to 6
        nums.set(1, 6);
        
        // f) Set the value of the 9th element of the array nums to the sum of the 13th and 2nd elements of the array nums.
        nums.set(8, nums.get(12) + nums.get(1));
        
        // Output the final contents of the array nums.
        System.out.println("The final contents of the array nums are:");
        for (int i = 0; i < nums.size(); i++) {
            System.out.println("Element " + i + ": " + nums.get(i));
        }
    }
}