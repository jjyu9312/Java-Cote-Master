package munjayeol;

import java.util.Scanner;

public class FindWord {
    public int mySolution(String str, char t) {
        int answer = 0;

        str.toLowerCase();

        String[] str2 = str.split("");

        for (int i = 0; i < str2.length; i++) {
            if (str2[i].equals("c")) {
                answer += 1;
            }
        }

        return answer;
    }

    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        System.out.println(str);
        t = Character.toUpperCase(t);

        // 1.
//        for(int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) { // 문자를 1개씩 인덱스로 접근
//                answer ++;
//            }
//        }

        // 2.
        for(char x : str.toCharArray()) { // String의 문자를 분리하여 문자 배열을 생성
            if (x == t) answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        FindWord fw = new FindWord(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0); // 문자 1개만 가져오기
        System.out.println(fw.mySolution(str, c));
        System.out.println("=====================");
        System.out.println(fw.solution(str, c));
    }
}
