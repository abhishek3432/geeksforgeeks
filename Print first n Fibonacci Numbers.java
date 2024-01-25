class Solution
{
    //Function to return list containing first n fibonacci numbers.
	public static long[] printFibb(int n) 
	{
	    //creating a list to store the numbers. 
	    long[] res = new long[n];
	    int ind = 0;
	    
	    //storing base values for a and b.
        long a=1,b=1;
        
        //pushing 1 once in the list if n>=1 and again if n>=2.
        if(n>=1)
            res[ind++] = 1;
        if(n>=2)
            res[ind++] = 1;
            
         
        for(int i = 2 ; i < n ; ++ i )
        {
            //pushing sum of a and b in the list.
            res[ind++] = a + b;
            long c=a+b;
            
            //updating a as b and b as c (sum of a and b).
            a=b;
            b=c;
        }
        
        //returning the list.
        return res;
    }
}