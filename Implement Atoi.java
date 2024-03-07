class Solution
{
    int atoi(String s) {
	// Your code here
	try {
        int val = Integer.parseInt(s);
        return val;
    }
    catch(Exception e) {
        return -1;
    }
    }
}