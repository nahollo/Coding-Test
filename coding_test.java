class Solution {
    public int solution(String s) {
        char[] stack = new char[s.length()]; // 스택을 사용한 알고리즘 풀이
        int top = 0; // 스택의 최상단을 체크할 변수
        stack[0] = s.charAt(0); // 반복문 전 스택을 하나 채우기
        for (int i = 1; i < s.length(); i++) { // 문자열 반복문
            if (top >= 0 && stack[top] == s.charAt(i)) { // 스택이 안비어있고 문자가 같을 때
                top--; // 스택 제가
            } else { // 아니면 스택에 채우기
                stack[++top] = s.charAt(i);
            }
        }
        if(top == -1){ // 스택이 비어있으면 1 리턴
            return 1;
        } else { // 스택이 차있으면 0 리턴
            return 0;
        }
    }
}
