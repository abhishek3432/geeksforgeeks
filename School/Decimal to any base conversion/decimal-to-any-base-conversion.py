#User function Template for python3

class Solution:
    def getNumber(self, B, N):
        ans = ''
    	while N:
    	    a = N%B
    	    if a >= 10:
    	        ans = chr(55+a)+ans
    	    else:
    	        ans = str(a)+ans
    	    N = N//B
    	return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input())
    for _ in range(t):
        B = int(input())
        N = int(input())
        ob = Solution()
        ans = ob.getNumber(B, N)
        print(ans)
# } Driver Code Ends