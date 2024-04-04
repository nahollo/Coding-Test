class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        int max = -2100000000;
        int min = 2100000000;

        for (int i = 0; i < num.length; i++) {
            if(Integer.parseInt(num[i]) > max){
                max = Integer.parseInt(num[i]);
            }
            if (Integer.parseInt(num[i]) < min){
                min = Integer.parseInt(num[i]);
            }
        }

        String answer = min + " " + max;
        return answer;
    }
}