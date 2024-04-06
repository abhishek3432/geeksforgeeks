//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int n) {
        
        int sum = 0;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            temp = temp/10;
            sum = sum + rem;
        }
        String check = isPalindrome("",(sum+""));
        return check.equals((sum+""))?1:0;
    }
    
    String isPalindrome(String value,String temp){
        if(temp.length()==1){
            value = temp.charAt(0)+value; 
            return value;
        }
        return isPalindrome(temp.charAt(0)+value,temp.substring(1));
    }
}