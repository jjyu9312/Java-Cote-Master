package Aarray;

import munjayeol.FindWord;

import java.util.Scanner;

public class RSP {

    public String[] solution(int n, String[] strA, String[] strB) {
        // 1:가위, 2:바위, 3:보
        String[] answer = new String[n];
        for (int i = 0; i < strA.length; i++) {
            int v1 = Integer.parseInt(strA[i]);
            int v2 = Integer.parseInt(strB[i]);

            System.out.println("v1-v2 : " + (v1-v2));
            if (v1-v2 == 1 || v1-v2 == -2) {
                answer[i] = "A";
            } else {
                answer[i] = "B";
            }

            if (strA[i].equals(strB[i])) {
                answer[i] = "D";
                continue;
            }
        }

        for (String i : answer) System.out.println(i);
        return answer;
    }

    public static void main(String[] args) {
        RSP fw = new RSP(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strA = new String[n];
        for (int i = 0; i < strA.length; i++) {
            strA[i] = sc.next();
        }
        String[] strB = new String[n];
        for (int i = 0; i < strB.length; i++) {
            strB[i] = sc.next();
        }

        System.out.println("=====================");
        System.out.println(fw.solution(n, strA, strB));
        System.out.println("=====================");
    }
}
