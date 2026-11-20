
class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        return solve(n, arr);
    }

    public int solve(int n, int[] arr) {
        if(n == 0 || n == 1){
            return 1;
        }
        if(arr[n] != -1){
            return arr[n];
        }
        int step1 = solve(n - 1, arr);
        int step2 = solve(n - 2, arr);
        return arr[n] = step1 + step2;
    }
}
