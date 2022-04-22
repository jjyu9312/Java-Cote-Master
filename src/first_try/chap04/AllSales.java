package first_try.chap04;

import java.util.HashMap;
import java.util.Scanner;

public class AllSales {

    private int[] solution(int n, int k, int[] arr) {
        int[] answer = new int[k];

        for (int i = 0; i <= n-k; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < k+i; j++) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
            answer[i] = map.size();
        }
        return answer;
    }

    public static void main(String[] args) {
        AllSales niam = new AllSales(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc .nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        for (int x : niam.solution(n, k, arr)) System.out.print(x + " ");
    }
}
