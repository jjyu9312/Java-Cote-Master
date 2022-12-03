package first_try.chap02;

import java.util.Scanner;

public class ClassHead {

    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) { // 1학년부터 n학년
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break; // 다음 학년에도 같은 반인 친구를 또 cnt에 추가하면 안되기 때문에 break
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        ClassHead niam = new ClassHead(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(niam.solution(n, arr));

        System.out.println("=====================");
    }
}
