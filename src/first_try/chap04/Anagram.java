package first_try.chap04;

import java.util.HashMap;
import java.util.Scanner;

class Anagram {
    public static void main(String[] args) {
        Anagram niam = new Anagram(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String ana1 = sc.next();
        
        String ana2 = sc.next();

        System.out.println(niam.solution(ana1, ana2));
    }

    private String solution(String ana1, String ana2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : ana1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ana2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return "NO";
            map.put(c, map.get(c) - 1); // 하나씩 빼기
        }
        return "YES";
    }

    /*
    private String solution(String ana1, String ana2) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : ana1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : ana2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (map1.equals(map2)) {
            return "YES";
        } else {
            return "NO";
        }
    }
     */
}
