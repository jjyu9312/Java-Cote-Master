package first_try.chap05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavePrincess {

    public static void main(String[] args) {
        SavePrincess niam = new SavePrincess(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(niam.solution(a, b));
    }

    private int solution(int a, int b) {

        int answer = 0;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= a; i++) q.offer(i); // offer: queue에 값 추가

        while (!q.isEmpty()) {
            for (int i = 1; i < b; i++) q.offer(q.poll()); // poll: 꺼내고 값을 return 받음
            q.poll();
            if (q.size() == 1) answer = q.poll();
        }


        return answer;
    }
}
