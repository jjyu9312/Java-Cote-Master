package first_try.chap04;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParentheses {

    public String solution(String str) {
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (x == ')') {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) answer += x;
        }
        answer = answer.replace(")", "");
        return answer;
    }

    public static void main(String[] args) {
        RemoveParentheses niam = new RemoveParentheses(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("=====================");
        System.out.println(niam.solution(str));
        System.out.println("=====================");
    }
}
