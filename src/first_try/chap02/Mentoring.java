package first_try.chap02;

import java.util.Scanner;

public class Mentoring {

    private int solution(int n, int m, int[][] arr) {
        int answer = 0;


        return answer;
    }


    public static void main(String[] args) {
        Mentoring niam = new Mentoring(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(niam.solution(n, m, arr));
        System.out.println("=====================");
    }
}
