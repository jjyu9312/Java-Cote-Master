package first_try.chap04;

import java.util.HashMap;
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
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : ana1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < ana2.length(); i++) {

        }

        return answer;
    }

}
