//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution
{
public:
    int fingerCount(int N)
    {
        // Write Your Code here
        if(N<=5)
            return N;
        if(N%8==1)
            return 1;
        else if(N%8==5)
            return 5;
        else if(N%4==3)
            return 3;
        else if(N%8==2||N%8==0)
            return 2;
        else
            return 4;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int N;
        cin >> N;
      
        Solution ob;
        int ans  = ob.fingerCount(N);
        cout << ans << endl;
    }
    return 0;
}
// } Driver Code Ends