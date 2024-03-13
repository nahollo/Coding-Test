// 타겟 넘버 (dfs 예제 문제)

class Solution {
	int[] numbers; // 숫자의 값을 저장하는 배열
	int target; // 타겟
	int answer; // 리턴 값

	void dfs(int index, int sum) {
		// 1. dfs 탈출조건
		if (index == numbers.length) {
			if (sum == target) {
				answer++;
			}
			return;
		}
		// 2. dfs 수행동작
		dfs(index + 1, sum + numbers[index]);
		dfs(index + 1, sum - numbers[index]);
	}

	public int solution(int[] numbers, int target) {
		this.numbers = numbers;
		this.target = target;

		dfs(0, 0);

		return this.answer;
	}
}