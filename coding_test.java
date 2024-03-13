class Solution {
	String begin;
	String target;
	String[] words;
	int[] visit;
	int min;

	public int solution(String begin, String target, String[] words) {
		this.begin = begin;
		this.target = target;
		this.words = words;
		visit = new int[words.length];
		int difcount = 0;

		min = words.length;

		for (int i = 0; i < words.length; i++) {
			if (target.equals(words[i])) {
				difcount++;
			}
		}
		if (difcount == 0) {
			return 0;
		}
		
		dfs(begin, 0);

		return min;
	}

	void dfs(String word, int step) {
		if (word.equals(target)) {
			min = Math.min(min, step);
			return;
		}
		for (int i = 0; i < words.length; i++) {
			if (visit[i] == 0 && diffrent_Check(word, words[i])) {
				visit[i] = 1;
				dfs(words[i], step + 1);
				visit[i] = 0;
			}
		}
	}

	boolean diffrent_Check(String word1, String word2) { // 한개만 다른지 체크하는 메소드
		int diffrent_Count = 0; // 두 String의 다른만큼 카운트 해주는 변수
		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) != word2.charAt(i)) {
				diffrent_Count++;
				if (diffrent_Count > 1) { // 한개 이상으로 다를 때
					return false; // 할 수 없다
				}
			}
		}
		return diffrent_Count == 1;
	}
}