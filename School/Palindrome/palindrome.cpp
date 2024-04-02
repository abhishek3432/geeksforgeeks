//{ Driver Code Starts
//Initial Template for C++


#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution

{

 public:

  string is_palindrome(int n)

  {

      // Code here.

      int same=0;

      string str=to_string(n);

      int len=str.length();

      for(int i=0;i<(len/2);i++){

          if(str[i]==str[(len-1)-i]){

              same++;

          }

      }

      if(same==(len/2)){

         return "Yes";

      }

      else{

         return "No";

      }

  }

};



//{ Driver Code Starts.
int main(){
    int T;
    cin >> T;
    while(T--)
    {
    	int n;
    	cin >> n;
    	Solution ob;
    	string ans = ob.is_palindrome(n);
    	cout << ans <<"\n";
    }
	return 0;
}

// } Driver Code Ends