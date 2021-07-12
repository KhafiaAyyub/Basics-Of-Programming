/*     Spiral Display

1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.

Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements

Output Format
e11
e21
..
en1
en2
en3
..
enm
e(n-1)m
..
e1m
e1(m-1)
..
e12
e22
e32
..

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9

Sample Input
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35

Sample Output
11
21
31
32
33
34
35
25
15

*/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
     
     int n =sc.nextInt();
     int m =sc.nextInt();
     
     int[][] arr = new int[n][m];
     
     for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
             arr[i][j] = sc.nextInt();
         }
     }
     int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		int total = n*m;
		int count = 0;
		
		while(count<total) {           
		    //left wall
			for(int i = minr,j = minc ; i<=maxr && count< total;i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			minc++;
			//bottom wall
			for(int i = maxr,j = minc ;j<=maxc && count <total;j++ ) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxr--;
			//right wall
			for(int i= maxr,j=maxc;i>=minr && count <total;i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxc--;
			//top wall
			for(int i = minr,j=maxc ; j>=minc && count< total;j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			minr++;
		}
     
     
  }
}







