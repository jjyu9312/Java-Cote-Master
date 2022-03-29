package munjayeol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicateChars {

    public String mySolution(String s) {

        List<Character> answer = new ArrayList<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (!answer.contains(c)) {
                answer.add(c);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        RemoveDuplicateChars niam = new RemoveDuplicateChars(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("=====================");
    }
}
