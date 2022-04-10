package first_try.chap02;

import java.util.Scanner;

public class ScoreSum {

    public int solution(int n, int[] arr) {
        int answer = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            }
            else cnt = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        ScoreSum niam = new ScoreSum(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        System.out.println("=====================");
        System.out.println(niam.solution(n, arr));
        System.out.println("=====================");
    }
}
