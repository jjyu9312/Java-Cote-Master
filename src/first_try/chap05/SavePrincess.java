package first_try.chap05;

import java.util.Scanner;

public class SavePrincess {

    public static void main(String[] args) {
        SavePrincess niam = new SavePrincess(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(niam.solution(a, b));
        System.out.println("narr");
    }

    private int solution(int a, int b) {


        return 0;
    }
}
