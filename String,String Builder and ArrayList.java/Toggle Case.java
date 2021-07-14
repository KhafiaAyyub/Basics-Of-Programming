/*  Toggle Case

1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.

Input Format
A String

Output Format
A String

Constraints
1 <= length of string <= 1000

Sample Input
pepCODinG

Sample Output
PEPcodINg

*/

import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<str.length();i++){
		    char ch = str.charAt(i);
		    if(ch>= 'a' && ch <= 'z'){
		        sb.append((char)(ch - 'a' + 'A'));
		    }
		    else{
		        sb.append((char)(ch - 'A' + 'a'));
		    }
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}
}
