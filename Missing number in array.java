int total_sum=0;
        for(int i=0;i<n-1;i++){
            total_sum +=array[i];
        }
        int value = n * (n+1)/2;
        int result =value  - total_sum;
        return result;
