import java.util.Stack;

class Solution { // 택배 상자
	public int solution(int[] order) {
		int answer = 0; // 트럭에 실리는 상자
		int box = 1; // 컨베이어 벨트
		Stack<Integer> temp = new Stack<>(); // 예비 컨베이어 벨트

		while (answer < order.length) {
			if (!temp.empty()) {
				if (order[answer] < box && order[answer] < temp.peek()) { // 오더 값이 컨베이어보다 작고 예비 컨베이어랑 다를 때
					return answer;
				}
			}
			if (order[answer] == box) {
				box++;
				answer++;
				continue;
			}
			if (!temp.empty()) {
				if (order[answer] == temp.peek()) { // 예비 컨베이어 제일 뒷쪽 박스가 오더랑 같을 때
					temp.pop();
					answer++;
					continue;
				}
			}
			// 컨베이어에 있는 박스가 예비 컨베이어에 올라갈 때
			temp.push(box);
			box++;
		}

		return answer;
	}
}