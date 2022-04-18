package first_try.chap03;

public class CommonElement {
    public static void main(String[] args) {
        CommonElement niam = new CommonElement(); // 매서드 static이면 객체 생성 필요 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr_1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr_1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr_2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr_2[i] = sc.nextInt();
        }

//        System.out.println(niam.mySolution(str));
        System.out.println("=====================");
        for (int x : niam.solution(n, arr_1, m, arr_2)) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("=====================");
    }

}
