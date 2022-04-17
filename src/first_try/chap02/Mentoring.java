package first_try.chap02;

import java.util.Scanner;

public class Mentoring {

    private int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int p1 = 0, p2 = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) p1 = s;
                        if (arr[k][s] == j) p2 = s;
                    }
                    if (p1 < p2) cnt++;
                }
                if (cnt == m) answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Mentoring niam = new Mentoring(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("=====================");
        System.out.println(niam.solution(n, m, arr));
        System.out.println("=====================");
    }
}
