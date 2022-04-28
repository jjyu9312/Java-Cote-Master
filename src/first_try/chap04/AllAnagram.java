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
        HashMap<Character, Integer> anaMap = new HashMap<>();
        HashMap<Character, Integer> ana2Map = new HashMap<>();

        for (char x : ana2.toCharArray()) {
            ana2Map.put(x, ana2Map.getOrDefault(x, 0) + 1);
        }

        int L = ana2.length() - 1;
        for (int i = 0; i < L; i++) {
            anaMap.put(ana1.charAt(i), anaMap.getOrDefault(ana1.charAt(i), 0) + 1);
        }

        int lt = 0;

        for (int rt = L; rt < ana1.length(); rt++) {
            anaMap.put(ana1.charAt(rt), anaMap.getOrDefault(ana1.charAt(rt), 0) + 1);
            if (anaMap.equals(ana2Map)) answer++;
            anaMap.put(ana1.charAt(lt), anaMap.get(ana1.charAt(lt)) - 1);
            if (anaMap.get(ana1.charAt(lt)) == 0) anaMap.remove(ana1.charAt(lt));
            lt++;
        }

        return answer;
    }

}
