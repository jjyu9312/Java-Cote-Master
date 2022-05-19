package first_try.chap05;

import java.util.Scanner;
import java.util.Stack;

public class IronRod {

    private int solution(String str) {
        int answer = 0;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop(); // 레이저, 막대기 상관없이 빼기
                if (str.charAt(i-1) == '(') answer += stack.size(); // 레이저이면 막대기 개수 증가
                else answer++; // 막대기면 남는 하나 증가시킴
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        IronRod niam = new IronRod(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(niam.solution(str));
        System.out.println();
    }
}
