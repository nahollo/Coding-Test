class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = new String[s.length()];

        for (int i = 0; i < s.length(); i++) { // 배열에 문자열의 문자 넣기
            str[i] = String.valueOf(s.charAt(i));
        }
        answer += str[0].toUpperCase(); // 배열의 0번 인덱스를 대문자로 바꿔주기

        for (int i = 1; i < s.length(); i++) {
            if (i == (s.length() - 1)) { 
                // 가장 마지막 문자가 띄어쓰기일 때 런타임 방지
                str[i] = (str[i]).toLowerCase();
                answer += str[i];
                break;
            }
            if (str[i].equals(" ")) { 
                // i번째 문자가 띄어쓰기면 i+1번째 문자는 대문자
                str[i + 1] = (str[i + 1]).toUpperCase();
            } else if (!(str[i - 1].equals(" "))) { 
                // i번째 문자가 띄어쓰기가 아니고 i-1번째 문자가 띄어쓰기가 아닐 때 소문자로
                str[i] = (str[i]).toLowerCase();
            }
            answer += str[i];
        }
        return answer;
    }
}