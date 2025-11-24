import java.util.Arrays;

public class Fibonnaci {
    public static void main(String[] args) {

        int ans = fibonacci(6);
        System.out.println(ans);
        System.out.println("From memoization approach below");
        int n = 6;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        int ansMemo = dpMemo(n, dp);
        System.out.println(ansMemo);

        System.out.println("From tabulation approach ");
        int ansTabulation = dpTabulation(n);
        System.out.println(ansTabulation);
    }

    static int fibonacci(int n) {

        if(n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n- 2);
    }

    static int dpMemo(int n , int dp[]) {

        if(n <= 1) {
            return n;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        dp[n] = dpMemo(n- 1, dp) + dpMemo(n - 2, dp);
        return dp[n];
    }

    static int dpTabulation(int n) {

        if(n <= 1) {
            return n;
        }

        int dp[] = new int[n + 1];
        dp[0] =0;
        dp[1] =1;

        for(int i = 2;i<=n;i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

       return dp[n];
    }
}