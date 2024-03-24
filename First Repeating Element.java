int idx =Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=n-1; i>=0; i--){
            if(set.contains(arr[i])){
                if(idx>i){
                    idx = i;
                }
            }else{
                set.add(arr[i]);
            }
        }
        if(idx == Integer.MAX_VALUE){
            return -1;
        }
        return idx+1;
