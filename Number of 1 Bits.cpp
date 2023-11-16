class Solution 
{
  public:
    int setBits(int N) 
    {
        // Write Your Code here
        int count=0;
        for(int i=1; i<32; i++)
        {
            if(N&1)
            {
                count++;
            }
            N=N>>1;
        }
        return count;
    }
    
};