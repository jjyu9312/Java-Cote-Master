package first_try.chap05;

import java.util.Scanner;

public class IronRod {

    private int solution(String str) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        IronRod niam = new IronRod(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(niam.solution(str));
        System.out.println();
    }
}
