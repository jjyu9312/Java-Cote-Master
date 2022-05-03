package first_try.chap05;

import first_try.chap04.BigNumK;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParenthesis {

    public String solution(String str) {

        Stack<Character> stack = new Stack<Character>();

        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO"; // 닫는 괄호가 더 많음
                stack.pop();
            }
        }

        if (!stack.isEmpty()) return "NO"; // 여는 괄호가 더 많음

        return "YES";
    }

    public static void main(String[] args) {
        CorrectParenthesis niam = new CorrectParenthesis(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(niam.solution(str));

    }
}
