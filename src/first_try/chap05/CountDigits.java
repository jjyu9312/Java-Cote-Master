package first_try.chap05;

public class CountDigits {
    // 숫자의 자릿수 계산하는 메소드
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n1 = 7733;
        countDigits(n1);
    }
}
