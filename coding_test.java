class Solution {
    public int solution(int n) { // n+1 부터 1씩 증가시키며 2진수로 변환시킨 후 1의 갯수를 세기
        int answer = n + 1; // n+1부터 2진수를 만들기 시작
        String binaryN = Integer.toBinaryString(n); // Integer.toBinaryString(); 은 십진수를 이진수 문자열로 만들어줌
        int cnt = countOne(binaryN); // countOne 메서드는 1의 갯수를 세어주는 메서드
        // cnt에 1의 갯수를 담아둔 후 n+1을 1씩 증가시키며 1의 갯수가 같은 다음 큰 숫자를 찾음
        while (true) {
            String nextN = Integer.toBinaryString(answer); // n+1의 값을 2진수로 변환
            int countNext = countOne(nextN); // 변환한 값의 1의 갯수 체크
            if (countNext == cnt) { // n의 2진수 변환한 값의 1의 갯수와 현재 변환한 값의 1의 갯수가 같을 때 브레이크
                break;
            }
            answer++; // 1의 갯수가 다르면 n값을 1 증가시킨 후 다시 로직 실행
        }
        return answer;
    }
    public int countOne(String binary) { // 2진수 binary의 1의 갯수를 세어주는 메서드
        int cnt = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}