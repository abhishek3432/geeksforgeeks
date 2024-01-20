int isSorted(int n, vector<int> a) {
    // Write your code here.
    //approach: nxtele>= preele
    int ans;
    for(int i=1; i<a.size(); i++)
    {
        //a[i]>=a[i-1] after that else creates error
        if(a[i] < a[i-1])
            return 0;
    }

    return 1;
}
