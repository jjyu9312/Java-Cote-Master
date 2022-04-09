package first_try.chap01;

import java.util.ArrayList;
import java.util.Scanner;

public class FlipText {

    public ArrayList<String> solution(int n, String[] str) {
//        ArrayList<String> answer = new ArrayList<>();
//        for (String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
//
//        return answer;

        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmps = String.valueOf(s);
            answer.add(tmps);
        }

        return answer;
    }

    public static void main(String[] args) {
        FlipText niam = new FlipText(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println("================");
        for (String x : niam.solution(n, str)) {
            System.out.println(x);
        }
    }
}
