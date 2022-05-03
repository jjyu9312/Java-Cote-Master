package first_try.chap05;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParentheses {

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<Character>();

        for (char x : str.toCharArray()) {
            System.out.println(stack);
            if (x == ')') {
                while (stack.pop() != '(') { // pop 하면 꺼낸 뒤 바로 앞 값을 return
                    // (를 만나면 꺼내고 멈춤
                }
            } else stack.push(x);
        }
            for (int i = 0; i < stack.size(); i++) {
                answer += stack.get(i);
            }

        return answer;
    }
    public static void main(String[] args) {
        RemoveParentheses niam = new RemoveParentheses(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(niam.solution(str));
    }
}
