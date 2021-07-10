/* Print Fibonacci Numbers Till N

1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.

Input Format
n

Output Format
0
1
1
2
3
5
8
.. first n fibonaccis

Constraints
1 <= n < 40

Sample Input
10

Sample Output
0
1
1
2
3
5
8
13
21
34

*/

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = 0;
      int b = 1;
      for(int i=1;i<=n;i++) {
    
          System.out.println(a);
         
          int c = a+b;
          a = b;
          b = c ;
          
      }
      
   }
  }


