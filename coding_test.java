class Solution {
    public int solution(int x, int y, int n) {

        int[] dp = new int[y + 1];
        for (int i = 0; i <= y; i++) {
            dp[i] = 2100000000;
        }

        dp[x] = 0; // 초기값 설정

        for (int i = x; i <= y; i++) {
            int plus = i + n;
            int x2 = i * 2;
            int x3 = i * 3;

            if (plus <= y) { // x에 n을 더하는 경우
                if (dp[plus] > dp[i] + 1) {
                    dp[plus] = dp[i] + 1;
                }
            }
            if (x2 <= y) { // x를 2배 하는 경우
                if (dp[x2] > dp[i] + 1) {
                    dp[x2] = dp[i] + 1;
                }
            }
            if (x3 <= y) { // x를 3배 하는 경우
                if (dp[x3] > dp[i] + 1) {
                    dp[x3] = dp[i] + 1;
                }
            }
        }

        if (dp[y] == 2100000000) // 목표값에 도달할 수 없는 경우
            return -1;
        else
            return dp[y];
    }
}
