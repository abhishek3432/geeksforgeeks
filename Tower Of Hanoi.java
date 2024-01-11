class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        long count = 0;
        
        solve(N, from, to, aux, count);
        return (long)Math.pow(2,N)-1;
    }

    public void solve(int N, int from, int to, int aux, long count) {
        // Base case
        if (N == 1) {
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            count++;
            return;
        }

        solve(N - 1, from, aux, to, count);
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        solve(N - 1, aux, to, from, count);
    }
}