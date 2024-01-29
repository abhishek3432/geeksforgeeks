class Solution{
    public List<Integer> pattern(int N){
        // code here
        List<Integer> list=new ArrayList<>();
        if(N<=0){
        list.add(N);
            return list;
        }
        
        decreasingFunction(N,list);
        int len=list.size();
        increasingFunction(list.get(len-2),list,N);
        return list;
    }
    
    public void decreasingFunction(int N, List<Integer> list){
            list.add(N); 
        if(N<=0){
            return;
        }
        //list.add(N);
        decreasingFunction(N-5,list);
        
        
    }
    
     public void increasingFunction(int lastvalue, List<Integer> list, int N){
        if(lastvalue==N){
        list.add(lastvalue);
        return;
        }
        list.add(lastvalue);
        increasingFunction(lastvalue+5,list,N);
        
        
    }
    
}
