package first_try.chap04;

import java.util.Scanner;


public class AllAnagram {
    public static void main(String[] args) {
        AllAnagram niam = new AllAnagram(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String ana1 = sc.next();
        String ana2 = sc.next();
        System.out.println(niam.solution(ana1, ana2));
    }

    private int solution(String ana1, String ana2) {



        return 0;
    }

}