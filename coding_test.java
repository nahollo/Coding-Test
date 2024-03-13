import java.util.Arrays;

class Solution {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		int j = B.length;

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[j - 1];
			j--;
		}
		return answer;
	}
}