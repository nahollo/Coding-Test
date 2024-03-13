class Solution {

	public int solution(int n) {
		Solution s = new Solution();
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 2] + dp[i - 1]) % 1000000007;
		}
		return dp[n];
	}
}