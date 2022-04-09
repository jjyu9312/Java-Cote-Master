package first_try.chap04;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParenthesis {

    public String solution(String str) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else { // 닫는 괄호
                if (stack.isEmpty()) return "NO"; // 닫는 괄호가 왔는데 여는 괄호가 없을 때
                stack.pop();
            }
        }

        if (!stack.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        CorrectParenthesis niam = new CorrectParenthesis(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("=====================");
        System.out.println(niam.solution(str));
        System.out.println("=====================");
    }
}
