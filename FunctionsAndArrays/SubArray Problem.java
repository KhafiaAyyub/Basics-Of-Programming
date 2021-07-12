/* Subarray Problem

1. You are given an array of size 'n' and n elements of the same array.
2. You are required to find and print all the subarrays of the given array. 
3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.

Input Format
A number n
n1
n2
.. n number of elements

Output Format
[Tab separated elements of subarray]
..
All subarrays

Constraints
1 <= n <= 10
0 <= n1, n2
 .. n elements <= 10 ^9
 
Sample Input
3
10
20
30

Sample Output
10	
10	20	
10	20	30	
20	
20	30	
30	

*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    
    for(int si=0;si <= arr.length-1;si++){
        for(int ei = si;ei <= arr.length-1;ei++){
            for(int i=si;i<=ei;i++){
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
      } 
    }    
}




