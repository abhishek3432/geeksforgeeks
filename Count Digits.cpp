//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std;

// } Driver Code Ends
class Solution{
public:
    int evenlyDivides(int N){
        //code here
        int count=0;
	int temp=N;
	int digit;
	while(temp)
	{
		digit=temp%10;
		temp=temp/10;//it should be here because below condition
		if(digit==0)
			continue;
		if(N%digit==0)
			count++;
		
	}
	return count;

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
        cin>>N;
        Solution ob;
        cout << ob.evenlyDivides(N) << endl;
    }
    return 0; 
}
// } Driver Code Ends   