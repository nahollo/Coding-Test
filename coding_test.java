class Solution {
    public String solution(String s) {
        String answer = "";
        char[] temp = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            temp[i] = s.charAt(i);
        }
        int cnt = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == ' ') {
                answer += " ";
                cnt = 0;
            } else if (cnt % 2 == 0) {
                answer += Character.toUpperCase(temp[i]);
                cnt++;
            } else {
                answer += Character.toLowerCase(temp[i]);
                cnt++;
            }
        }

        return answer;
    }
}
