package first_try.chap02;

import java.util.Scanner;

public class RankSearch {

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RankSearch niam = new RankSearch(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        System.out.println("=====================");
        for (int x : niam.solution(n, arr)) System.out.print(x + " ");
        System.out.println();
        System.out.println("=====================");
    }
}
