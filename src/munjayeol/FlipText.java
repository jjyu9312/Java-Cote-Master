package munjayeol;

import java.util.Scanner;

public class FlipText {

    public String mySolution(String s) {

        int lt = 0, rt = s.length()-1;
        char[] chars = s.toCharArray();

        while(lt < rt) {
            char tmp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = tmp;
            lt++;
            rt--;
            }
        String tmp = String.valueOf(chars);
        return s;
    }

    public static void main(String[] args) {
        FlipText my = new FlipText(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("=====================");
    }
}
