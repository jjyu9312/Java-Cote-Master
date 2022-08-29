package first_try.chap05;

import first_try.chap02.Peaks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {

    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Emergency {

    public int solution (int n, int m, int[] arr) {

        int answer = 0;
        Queue<Person> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.offer(new Person(i ,arr[i])); // queue에 Emergency 객체를 넣어줌
        }

        while (!q.isEmpty()) {
            Person emg = q.poll(); // q에서 꺼내 emg에 위치
            for (Person e : q) {
                if (e.priority > emg.priority) {
                    q.offer(emg);
                    emg = null;
                    break;
                }
            }
            if (emg != null) {
                answer++;
                if (emg.id == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Emergency niam = new Emergency(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println(niam.solution(n, m, arr));
    }
}
