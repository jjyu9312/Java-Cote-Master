package first_try.chap04;

import first_try.chap02.BigNum;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class BigNumK {

    private int solution(int n, int k, int[] arr) {
        int answer = -1;

        TreeSet<Integer> Tset = new TreeSet<Integer>(Collections.reverseOrder());

        for (int x = 0; x < n; x++) {
            for (int y = x + 1; y < n; y++) {
                for (int z = y + 1; z < n; z++) {
                    Tset.add(arr[x] + arr[y] + arr[z]);
                }
            }
        }

        // System.out.println(Tset.first()); // 내림차순으로 정렬했기에 가장 최대값이 나옴
        int cnt = 0;
        for (int i : Tset) {
            cnt++;
            if (cnt == 3) return i;
        }
        return answer;
    }

    public static void main(String[] args) {
        BigNumK niam = new BigNumK(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(niam.solution(n, k, arr));
        System.out.println();

    }
}
