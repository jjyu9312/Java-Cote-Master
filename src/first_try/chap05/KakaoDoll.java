package first_try.chap05;

import java.util.Scanner;
import java.util.Stack;

public class KakaoDoll {

    public int solution(int[][] board, int[] moves) {

        int answer = 0;

        Stack<Integer> stack = new Stack<Integer>();

        for (int pos : moves) {
//            System.out.println("pos : " + pos);
            for (int i = 0; i < board.length; i++) { // 인형뽑기 내려감
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
//                    System.out.println("tmp : " + tmp);
                    board[i][pos-1] = 0; // 인형 가져오고 없애기
                    if (!stack.isEmpty() && tmp == stack.peek()) { // peek : Stack의 top에 있는 item을 삭제하지않고 해당 item을 반환
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        KakaoDoll niam = new KakaoDoll();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int k = 0; k < m; k++) moves[k] = sc.nextInt();
        System.out.println(niam.solution(board, moves));
    }
}
