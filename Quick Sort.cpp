//{ Driver Code Starts
#include <stdio.h>
#include <bits/stdc++.h>
using namespace std;

/* Function to print an array */
void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

// } Driver Code Ends
class Solution
{
    public:
    //Function to sort an array using quick sort algorithm.
    void quickSort(int input[], int start, int end)
    {
        // code here
        if(start<end)
    	{
    		int partitionIndex= partition(input, start, end);
    		quickSort(input, start, partitionIndex-1);
    		quickSort(input, partitionIndex+1, end);
    	}
    }
    
    public:
    int partition (int input[], int start, int end)
    {
       // Your code here
       int pivot=input[start];
    	int i=start;
    	int j=end;
    	while(i<j)
    	{
    		while(input[i]<=pivot && i<=end-1)
    			i++;
    		while(input[j]>pivot && j>=start+1)
    			j--;
    		if(i<j)	swap(input[i], input[j]);
    	}
    	swap(input[start], input[j]);
    
    	return j;
        }
};


//{ Driver Code Starts.
int main()
{
    int arr[1000],n,T,i;
    scanf("%d",&T);
    while(T--){
    scanf("%d",&n);
    for(i=0;i<n;i++)
      scanf("%d",&arr[i]);
      Solution ob;
    ob.quickSort(arr, 0, n-1);
    printArray(arr, n);
    }
    return 0;
}
// } Driver Code Ends