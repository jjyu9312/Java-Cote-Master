package first_try.chap02;

import java.util.Scanner;

public class Peaks {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0 ,-1};

    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k]; // 4방향 행 좌표
                    int ny = j + dy[k]; // 4방향 열 좌표
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) { // 4방향 값과 내 자신 비교 + 끝 쪽에 있는 부분은 IndexOutOfRangeException 안 나오게 처리
                        flag = false;
                        break;
                    }
                }

                if (flag) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Peaks niam = new Peaks(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(niam.solution(n, arr));
        System.out.println("=====================");
    }
}
