package first_try.chap03;

import java.util.Scanner;

public class ContinuousSubsequence {

    private int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0;
        int lt = 0, rt = 0;

        for (rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while(sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
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
