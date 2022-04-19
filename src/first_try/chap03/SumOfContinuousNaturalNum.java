package first_try.chap03;

import java.util.Scanner;

public class SumOfContinuousNaturalNum {

    public static void main(String[] args) {
        SumOfContinuousNaturalNum niam = new SumOfContinuousNaturalNum(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("=====================");
        System.out.println(niam.solution(n));
        System.out.println("=====================");
    }

    private int solution(int n) {
        return 0;
    }
}
