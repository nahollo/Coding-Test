class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int yellow_Width;
        for (int yellow_Length = 1; yellow_Length <= yellow / 2 + 1; yellow_Length++) {
            if (yellow % yellow_Length == 0) {
                yellow_Width = yellow / yellow_Length;
                if ((2 * yellow_Length + 2 * yellow_Width + 4 == brown) && (yellow_Length >= yellow_Width)) {
                    answer[0] = yellow_Length + 2;
                    answer[1] = yellow_Width + 2;
                    return answer;
                }
            }
        }
        return answer;
    }
}