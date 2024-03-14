class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] num = new char[phone_number.length()];
        for (int i = 0; i < phone_number.length() - 4; i++) {
            num[i] = '*';
        }
        for (int i = phone_number.length() - 4; i < phone_number.length(); i++) {
            num[i] = phone_number.charAt(i);
        }
        for (int i = 0; i < phone_number.length(); i++) {
            answer = answer + num[i];
        }
        System.out.println(answer);

        return answer;
    }
}