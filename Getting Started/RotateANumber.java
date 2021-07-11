/*  Rotate A Number

1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
   
Input Format
"n" where n is any integer.
"K" where k is any integer.

Output Format
"r", the rotated number

Constraints
1 <= n < 10^9
-10^9 < k < 10^9

Sample Input
562984
2

Sample Output
845629

*/


import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     //1.to find the number of digits
     int nod = 0;
     int num  = n;
     while(num!=0){
         num = num/10;
         nod++;
     }
     //bring value of k in range
     k = k % nod;
     if(k<0){
         k = k+nod;
     }
     //setting value of divisor
     int div = (int)Math.pow(10,k);
     
     //finding q and rem
     
     int q = n/div;
     int rem = n%div; 
     
     //setting value of multiplier
     int mult = (int)Math.pow(10,nod-k);
     
    
     int ans = (rem*mult) + q;
     
     System.out.println(ans);
     
    }
   }
