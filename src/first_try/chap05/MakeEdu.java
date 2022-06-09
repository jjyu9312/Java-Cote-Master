package first_try.chap05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MakeEdu {
    public static void main(String[] args) {
        MakeEdu niam = new MakeEdu(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        System.out.println(niam.solution(input1, input2));
    }

    private String solution(String input1, String input2) {
        Queue<Character> q = new LinkedList<>();
        for (char c : input1.toCharArray()) {
            q.offer(c);
        }

        for (char c : input2.toCharArray()) {
            if (q.poll()) {
                q.
            }
        }
        return "YES";
    }
}
