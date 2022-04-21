package first_try.chap03;

import java.util.Scanner;

public class MaxLenContinuousSubsequence {

    private int solution(int n, int m, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > m) {
                if (arr[lt] == 0) cnt--; // 이미 1로 바뀐 값을 다시 0으로 바꿔주고 cnt는 감소
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxLenContinuousSubsequence niam = new MaxLenContinuousSubsequence(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(niam.solution(n, m, arr));
    }
}
