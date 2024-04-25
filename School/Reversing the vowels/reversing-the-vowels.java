//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        // your code here
        int n = s.length();
        char[] ch = s.toCharArray();
        String str = "aeiouAEIOU";
        
        int i=0;
        int j=n-1;
        char first = '$';
        char second = '$';
        while(i<j){
            
            if(str.indexOf(ch[i])!= -1){
                first = ch[i];
            }
            else{
                i++;
            }
            
            if(str.indexOf(ch[j])!= -1){
                second = ch[j];
            }
            else{
                j--;
            }
            
            if(first!='$' && second!='$'){
                ch[i] = second;
                ch[j] = first;
                first = '$';
                second = '$';
                i++;
                j--;
                
                
            }
        }
        
        String res = new String(ch);
        
        return res;
        
    }
}