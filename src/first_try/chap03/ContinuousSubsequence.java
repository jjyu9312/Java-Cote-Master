package first_try.chap03;

import java.util.Scanner;

public class ContinuousSubsequence {

    private int solution(int n, int m, int[] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            cnt += arr[i];
            if (cnt == m) answer++;
            if (cnt > m) {
                cnt -= arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ContinuousSubsequence niam = new ContinuousSubsequence(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("=====================");
        System.out.println(niam.solution(n, m, arr));
        System.out.println("=====================");
    }
}
