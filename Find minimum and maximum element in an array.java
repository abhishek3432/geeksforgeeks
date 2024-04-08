long max = a[0];
        long min = a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min = a[i];
            }
            if(max<a[i]){
                max = a[i];
            }
        }
        Pair p = new Pair(min,max);
      
        return p;
