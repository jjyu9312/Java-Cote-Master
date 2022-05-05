package first_try.chap05;

import java.util.Scanner;
import java.util.Stack;

public class PostFix {

    public int solution(String str) {
        int answer = 0;

        Stack<String> stack = new Stack<String>();


        return answer;
    }

    public static void main(String[] args) {
        PostFix niam = new PostFix(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(niam.solution(str));
    }
}
