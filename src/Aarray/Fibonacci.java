package Aarray;

import munjayeol.SpecificFlipText;

import java.util.Scanner;

public class Fibonacci {
    public int[] solution(int n) {
        int[] answer = new int[n];

        return answer;
    }
    public static void main(String[] args) {
        Fibonacci niam = new Fibonacci(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        System.out.println(niam.mySolution(str));
        System.out.println("=====================");
        System.out.println(niam.solution(n));
        System.out.println("=====================");
    }
}
