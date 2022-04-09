package first_try.chap08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Wrestling {

    public int solution(ArrayList<Body> arr, int n) {
         int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body obj : arr) {
            if (obj.w > max) {
                max = obj.w;
                cnt++; // 최대값 있을 때만 선발
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Wrestling niam = new Wrestling(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h, w));
        }

        System.out.println("=====================");
        System.out.println(niam.solution(arr, n));
        System.out.println("=====================");
    }
}

class Body implements Comparable<Body> {
    public int h, w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h; // h 기준 내림차순 정렬
    }
}