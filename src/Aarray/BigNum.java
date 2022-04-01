package Aarray;

import munjayeol.SpecificFlipText;

import java.util.ArrayList;
import java.util.Scanner;

public class BigNum {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i = 1; i < n; i++) {
            if (arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BigNum niam = new BigNum(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        System.out.println(niam.mySolution(str));
        System.out.println("=====================");
        for (int x : niam.solution(n, arr)) {
            System.out.println(x + " ");
        }

        System.out.println("=====================");
    }
}
