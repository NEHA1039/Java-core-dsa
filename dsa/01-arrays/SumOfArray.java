/**
 * Problem: Find the sum of all elements in an array
 *
 * Approach:
 * - Traverse the array using a loop
 * - Accumulate sum in a variable
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Neha Thorat
 * Day: 4
 */
public class SumOfArray {
    public static void main(String[]args){
    int []arr={1,2,3,4,5};
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
        System.out.println("sum of the array is"+sum);
    
}
 }