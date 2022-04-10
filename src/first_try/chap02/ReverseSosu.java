package first_try.chap02;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseSosu {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = arr[i]; // 뒤 집기 전 값
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10; // 나머지
                res = res * 10 + t;
                tmp = tmp / 10; // 몫
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    private boolean isPrime(int res) {
        if (res == 1) return false;
        for (int i = 2; i < res; i++) {
            if (res%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ReverseSosu niam = new ReverseSosu(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        System.out.println("=====================");
        for (int x : niam.solution(n, arr)) System.out.print(x + " ");
        System.out.println("=====================");
    }
}
