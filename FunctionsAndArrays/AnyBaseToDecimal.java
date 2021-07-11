/*  Any Base To Decimal

1. You are given a number n.
2. You are given a base b. n is a number on base b.
3. You are required to convert the number n into its corresponding value in decimal number system.

Input Format
A number n
A base b

Output Format
A decimal number representing corresponding value of n in base b.

Constraints
0 <= d <= 1000000000
2 <= b <= 10
  
Sample Input
111001
2

Sample Output
57

*/

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int destBase = scn.nextInt();
     
   }
  
   public static int dtoab(int n, int b){
      int rv = 0;
      int p = 1;
      while(n!=0){
          int dig = n%b;
          n=n/b;
          rv+=dig *p;
          p=p*10;
      }
      return rv;
   }
   
   public static int abtod(int n,int b){
       int rv = 0;
       int p = 1;
       while(n!=0){
           int ld = n%10;
           n = n/10;
           
           rv+=(ld *p);
           p+=b;
       }
       return rv;
   }
   
  }
   
   
  
