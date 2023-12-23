//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    long long reversedBits(long long X) {
        // code here
        long long  c=0;
        long long x=0;
        while(X){
            x=x<<1;
            c++;
            if(X&1) x=x^1;
            X=X>>1;
        }
        x=x<<(32-c);
        return x;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long X;
        
        cin>>X;

        Solution ob;
        cout << ob.reversedBits(X) << endl;
    }
    return 0;
}
// } Driver Code Ends