package first_try.chap01;

import java.util.Scanner;

public class WordInSentence {

    public String solution(String str) {
//        String answer = "";
//        int max = Integer.MIN_VALUE;
//        String[] strSplit = str.split(" ");
//        for (String s : strSplit) {
//            int len = s.length();
//            if (len > max) {
//                max = len;
//                answer = s;
//            }
//        }

        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1) { // 인덱스가 존재할 때 까지 while 돔
            String tmp = str.substring(0, pos);
            int len = tmp.length(); // 해당 index 단어 길이
            if (len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos+1); // index를 하나씩 증가 시켜줌
        }

        if (str.length() > max) answer = str; // str는 이제 마지막 단어가 됨
        return answer;
    }

    public static void main(String[] args) {
        WordInSentence niam = new WordInSentence(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("================");
        System.out.println(niam.solution(str));
    }

}
