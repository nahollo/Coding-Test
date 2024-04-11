class Solution {
    public int solution(int n) {
        if (n <= 1) { // 피보나치를 못하면 n 리턴
            return n;
        }
        int[] fib = new int[n + 1]; // 피보나치 값을 저장 할 배열
        fib[0] = 0; // 알고리즘에서 피보나치를 구하기 위한 최소 조건
        fib[1] = 1; // 알고리즘에서 피보나치를 구하기 위한 최소 조건
        
        for (int i = 2; i <= n; i++) { // 반복문으로 피보나치 구현
            fib[i] = (fib[i - 1] + fib[i - 2]) % 1234567;
        }
        return fib[n];
    }
}
