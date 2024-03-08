//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int H = Integer.parseInt(input[0]); 
            int M = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.timeToWord(H,M));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public String timeToWord(int H, int M)
    {
        // code here
        String nums[] = {"zero", "one", "two", "three", "four", 
                            "five", "six", "seven", "eight", "nine", 
                            "ten", "eleven", "twelve", "thirteen", 
                            "fourteen", "fifteen", "sixteen", "seventeen", 
                            "eighteen", "nineteen", "twenty", "twenty one", 
                            "twenty two", "twenty three", "twenty four", 
                            "twenty five", "twenty six", "twenty seven", 
                            "twenty eight", "twenty nine", };
                            
        String ans = "";
                            
        
        switch (M) {
        case 0:
            ans = (nums[H] + " o' clock");
            break;
        case 1:
            ans = ("one minute past " + nums[H]);
            break;
        case 59:
            ans = ("one minute to " + nums[(H % 12) + 1]);
            break;
        case 15:
            ans = ("quarter past " + nums[H]);
            break;
        case 30:
            ans = ("half past " + nums[H]);
            break;
        case 45:
            ans = ("quarter to " + nums[(H % 12) + 1]);
            break;
        default:
            if (M > 30)
                ans = (nums[60 - M] + " minutes to " + nums[(H % 12) + 1]);
            else if (M < 30)
                ans = (nums[M] + " minutes past " + nums[H]);
    
        }
        return ans;
    }
}