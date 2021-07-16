 /*   Any Base To Any Base

1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.

Input Format
A number n
A base b1
A base b2

Output Format
A number of base b2 equal in value to n of base b1.

Constraints
0 <= n <= 512
2 <= b1 <= 10
2 <= b2 <= 10

Sample Input
111001
2
3

Sample Output
2010

*/

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
      int b2= scn.nextInt();
      int ans = abtoab(n,b1,b2);
      System.out.println(ans);
      
  }
  
  public static int abtoab(int n,int b1,int b2){
     int ans1 = abtod(n,b1);
     int ans2 = dtoab(ans1,b2);
     return ans2;
  }
  
     
     public static  int abtod(int n,int b1){
         int rv = 0;
         int p = 1;
         
         while(n!=0){
             int dig = n%10;
             n = n/10;
             rv += dig * p;
             p *= b1;
         }
         return rv;
     }
     
         public static  int dtoab(int n,int b2){
         int rv = 0;
         int p = 1;
         
         while(n!=0){
             int dig = n%b2;
             n = n/b2;
             rv += dig * p;
             p *= 10;
         }
         return rv;
     }



