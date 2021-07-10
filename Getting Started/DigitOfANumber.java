/*  Digits Of A Number

1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.

Input Format
"n" where n is any integer.

Output Format
d1
d2
d3
... digits of the number

Constraints
1 <= n < 10^9

Sample Input
65784383

Sample Output
6
5
7
8
4
3
8
3

*/
import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int temp = n;
     
     //step1 - find the number of digits
     int nod = 0 ;
     while(temp != 0){
         temp = temp / 10;
         nod++;
     }
     
     //step2 - set value for divisor 
     int div  = (int)Math.pow(10,nod-1);
     
     while(div!=0){
        int  q = n / div;
         System.out.println(q);
        n = n % div;
        div = div / 10;
     }
     
     }
    }











