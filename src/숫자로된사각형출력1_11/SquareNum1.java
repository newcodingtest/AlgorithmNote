package 숫자로된사각형출력1_11;

import java.util.Scanner;
// 1 2 3 4
// 8 7 6 5
// 9 10 11 12
// 16 15 14 13

public class SquareNum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int cnt = 1;
        System.out.println("cnt = " + arr.length);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < n; j++) {
                    arr[i][j] = i*n+j+1;
                }
            }else {
                for (int j = n-1; j >= 0; j--) {
                    arr[i][j] = i*n+4-j;
                }
        }
            System.out.println();
    }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
}
}