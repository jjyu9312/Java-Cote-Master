package munjayeol;

import java.util.Scanner;

public class Pwd {

    public String solution(int n, String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i+=7) {
            String s = str.substring(i, i+7);
            String ss = "";
            for(char c : s.toCharArray()) {
                if (c == (Character)'#') {
                    c = '1';
                    ss += c;
                } else {
                    c = '0';
                    ss += c;
                }
            }
            int k = Integer.valueOf(ss, 2);
            String x = Character.toString(k);
            answer += x;
            System.out.println(k);
        }
        return answer;
    }

    public static void main(String[] args) {
        Pwd niam = new Pwd(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println("=====================");
        System.out.println(niam.solution(n, str));
        System.out.println("=====================");
    }
}
