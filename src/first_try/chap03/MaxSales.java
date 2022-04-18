package first_try.chap03;

import java.util.Scanner;

public class MaxSales {

    private int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0;

        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = m; i < n; i++) {
            sum += (arr[i] - arr[i-m]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxSales niam = new MaxSales(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        System.out.println(niam.mySolution(str));
        System.out.println("=====================");
        System.out.println(niam.solution(n, m, arr));
        System.out.println("=====================");
    }
}
