import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());   
        int K = Integer.parseInt(st.nextToken());   

        dp = new int[N + 1][K + 1];
        
        System.out.println(BC(N, K));
    }

    static int BC(int n, int k) {
        // 이미 풀린 경우
        if (dp[n][k] > 0) {
            return dp[n][k];
        }

        if (n == k || k == 0) {
            return dp[n][k] = 1;
        }

        return dp[n][k] = BC(n - 1, k - 1) + BC(n - 1, k);
    }
}