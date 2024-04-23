class Solution {
    public int solution(int n) {
        // 최솟값을 1 씩 더해가며 연속된 자연수를 더해 n 나오는지 체크하기
        int answer = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) { // 더하고자 하는 최솟값을 1부터 1씩 증가시키기
            sum = 0;
            for (int j = i; j <= n; j++) { // 최솟값부터 1씩 증가시키며 연속된 자연수를 체크하기
                sum += j;
                if (sum == n) { // 모두 더한 값과 n이 같으면 표현 가능한 방법 1 증가
                    answer++;
                    break;
                } else if (sum > n) { // 덧셈으로 n을 넘어가면 덧셈 종료
                    break;
                }
            }
        }
        return answer;
    }
}
