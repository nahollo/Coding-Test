class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length]; // 리턴값
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) { // 앞에 가격이 더 클 때
                    answer[i]++; // 앞에 값이 더 클 때 == 가격이 떨어졌을 때
                    break; // 가격이 떨어지면 값 비교하는 부분 break
                } else {
                    answer[i]++; // 가격이 안떨어졌을 때는 answer값 1씩 증가
                }
            }
        }
        return answer;
    }
}