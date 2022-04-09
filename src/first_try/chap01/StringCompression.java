package first_try.chap01;

import java.util.Scanner;

public class StringCompression {

    public String solution(String str) {
        String answer = "";
        str = str + " ";
        int cnt = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StringCompression niam = new StringCompression(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

//        System.out.println(niam.mySolution(str));
        System.out.println("=====================");
        System.out.println(niam.solution(str));
        System.out.println("=====================");
    }
}
