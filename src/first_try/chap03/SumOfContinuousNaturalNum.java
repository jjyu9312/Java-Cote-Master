package first_try.chap03;

import javax.naming.spi.DirObjectFactory;
import java.util.Scanner;

public class SumOfContinuousNaturalNum {
    private int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n/2+1; // 이게 핵심 -> 런타임 에러 방지
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i] = i+1;
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }

        return answer;

        //        int answer = 0, sum = 0;
        //        int lt = 1, rt = 1;
        //
        //        for (rt = 1; rt < n; rt++) {
        //            sum += rt;
        //            if (sum == n) answer++;
        //            while (sum >= n) {
        //                sum -= lt++;
        //                if (sum == n) answer++;
        //            }
        //        }
        //        return answer;
    }

    public static void main(String[] args) {
        SumOfContinuousNaturalNum niam = new SumOfContinuousNaturalNum(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("=====================");
        System.out.println(niam.solution(n));
        System.out.println("=====================");
    }
}
