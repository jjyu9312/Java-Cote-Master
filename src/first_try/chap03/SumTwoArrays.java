package first_try.chap03;

import first_try.chap02.BigNum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumTwoArrays {

    private ArrayList<Integer> solution(int n, int[] arr_1, int m, int[] arr_2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) { //
            if (arr_1[p1] < arr_2[p2]) answer.add(arr_1[p1++]);
            else answer.add(arr_2[p2++]);
        }

        while (p1 < n) answer.add(arr_1[p1++]);
        while (p2 < m) answer.add(arr_2[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        SumTwoArrays niam = new SumTwoArrays(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr_1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr_1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr_2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr_2[i] = sc.nextInt();
        }

//        System.out.println(niam.mySolution(str));
        System.out.println("=====================");
        for (int x : niam.solution(n, arr_1, m, arr_2)) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("=====================");
    }
}
