class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        
        ArrayList<Integer> ars=new ArrayList<Integer>();
        
        int p=n;
       

       for(int i=0; i<n; i++){
            int index=(arr[i]%p);
            arr[index]=arr[index]+p;
        }
        
        for(int i=0; i<n; i++){
            arr[i]/=p;
            if(arr[i]>1){
                ars.add(i);
            }
        }
       Collections.sort(ars);
        
        if(ars.isEmpty()){
            ars.add(-1);
            return ars;
        }
        
        return ars;
    }
}
