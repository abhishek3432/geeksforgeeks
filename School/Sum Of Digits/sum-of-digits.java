//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfDigits(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int sumOfDigits(int n) {
        // code here
        int s=0;
        n=Math.abs(n);
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
    
}

       