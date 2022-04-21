package first_try.chap04;

import first_try.chap03.MaxLenContinuousSubsequence;

import java.util.HashMap;
import java.util.Scanner;

public class ClassLeader {

    private char solution(int n, String candidate) {
        char answer = ' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : candidate.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1); // getOrDefault - c에서 있는 key가 있으면 value 값을 찾고 없으면 0을 리턴
        }

//        System.out.println(hashMap.containsKey("A"));


        int max = Integer.MIN_VALUE;
        for (char x : hashMap.keySet()) {
            if (hashMap.get(x) > max) {
                max = hashMap.get(x);
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ClassLeader niam = new ClassLeader(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String candidate = sc.next();
        System.out.println(niam.solution(n, candidate));
    }
}
