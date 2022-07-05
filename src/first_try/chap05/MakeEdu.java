package first_try.chap05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MakeEdu {
    public static void main(String[] args) {
        MakeEdu niam = new MakeEdu(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        System.out.println(niam.solution(input1, input2));
        System.out.println();
    }

    private String solution(String input1, String input2) {
        Queue<Character> q = new LinkedList<>();
        for (char c : input1.toCharArray()) {
            q.offer(c);
        }

        for (char c : input2.toCharArray()) {
            if (q.contains(c)) {
                if (c != q.poll()) return "NO"; // 맨 앞 자료를 꺼내면서 확인
            }
        }
        if (!q.isEmpty()) {
            return "NO";
        }
        return "YES";
    }
}
