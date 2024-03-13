//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution{
    public:
    int searchInsertK(vector<int>Arr, int N, int k)
    {
        // code here

        if(k < Arr[0])
            return 0;
        if(k>Arr[N-1])
            return N;
        int l=0;
        int r=N-1;
        int m=l+(r-l)/2;;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(k==Arr[m])
                return m;
            else if(k>Arr[m])
                l=m+1;
                else
                    r=m-1;
        }
        return l;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin >> N;
        vector<int>Arr(N);
        for(int i=0;i<N;i++)    
            cin>>Arr[i];
        int k;
        cin>>k;
        Solution obj;
        cout<<obj.searchInsertK(Arr, N, k)<<endl;
    }
    return 0;
}
// } Driver Code Ends