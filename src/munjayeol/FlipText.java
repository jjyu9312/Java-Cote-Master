package munjayeol;

import java.util.Scanner;

public class FlipText {

    public String mySolution(String str) {

        int lt = 0, rt = str.length()-1;
        char[] chars = str.toCharArray();

        while(lt < rt) {
            char tmp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = tmp;
            lt++;
            rt--;
            }
        String tmp = String.valueOf(chars);
        return str;
    }

    public String Solution(String str) {
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while(lt < rt) {
            if (!Character.isAlphabetic(s[lt])) { // 알파벳인지 아닌 지 판별하는 함수
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                // lt와 rt 스왑
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        String answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        FlipText niam = new FlipText(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

//        System.out.println(niam.mySolution(str));
        System.out.println("=====================");
        System.out.println(niam.Solution(str));
        System.out.println("=====================");
    }
}
