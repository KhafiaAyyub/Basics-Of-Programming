/* Pythagorean Triplet
Easy  

1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.

Input Format
a, an integer
b, an integer
c, an integer

Output Format
true if the numbers form a pythagorean triplet and false otherwise

Constraints
1 <= a <= 10^9
1 <= b <= 10^9
1 <= c <= 10^9

Sample Input
5 3 4

Sample Output
true

*/
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int max = a;
    if(b>=max){
        max = b;
    }
    else if(c>=max){
        max = c;
    }
    
    if(max == a){
        if((a*a) == (b*b) + (c*c)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    else if(max == b){
        if((b*b) == (a*a) + (c*c)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    if(max == c){
        if((c*c) == (b*b) + (a*a)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
   }
  }
