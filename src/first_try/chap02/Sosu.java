package first_try.chap02;

import first_try.chap04.RemoveParentheses;

import java.util.Scanner;

public class Sosu {

    public int solution(int n) {
        int answer = 0;

        int[] ch = new int[n+1];
        for (int i = 2; i < n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j < n; j=j+i) { // j는 i의 배수만큼 증가
                    ch[j] = 1;

                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Sosu niam = new Sosu(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("=====================");

        System.out.println(niam.solution(n));

        System.out.println("=====================");
    }
}
