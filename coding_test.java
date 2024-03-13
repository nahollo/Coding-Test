class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] num = new char[s.length()]; // s를 char 배열로 받기

        for (int i = 0; i < s.length(); i++) {
            num[i] = s.charAt(i);
        }
        if (num[0] == '-') { // s의 맨 앞이 -일 때
            for (int i = 1; i < s.length(); i++) {
                answer = answer + (num[s.length() - i] - '0') * j(i - 1);
            }
            answer = answer * (-1);
            System.out.println(answer);
        } else if (num[0] == '+') { // s의 맨 앞이 +일 때
            for (int i = 1; i < s.length(); i++) {
                answer = answer + (num[s.length() - i] - '0') * j(i - 1);
            }
            System.out.println(answer);
        } else {
            for (int i = 0; i < s.length(); i++) { // s의 맨 앞에 아무것도 없을 때
                answer = answer + (num[s.length() - i - 1] - '0') * j(i);
            }
        }

        return answer;
    }

    public int j(int x) { // 10의 제곱을 만드는 메서드
        int temp = 1;
        if (x == 0) {
            return 1;
        } else {
            for (int i = 0; i < x; i++) {
                temp = temp * 10;
            }
            return temp;
        }

    }
}