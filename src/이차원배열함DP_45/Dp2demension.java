package 이차원배열함DP_45;
/*
 문제:
 2차원 배열이 주어졌을 때 (i,j) 위치부터 (x,y)위치까지에 저장되어 있는 수들의 합을 구하는 프로그램 작성

 입력:
 첫째 줄에 배열의 크기 N,M이 주어짐
 그 다음줄에는 합을 구할 부분의 개수가 주어짐
 다음의 K줄에는 4개의 정수로 i,j,x,y 가 주어짐(i<=x, j<=y)
 2 3
 1 2  4
 8 16 32
 3
 1 1 2 3
 1 2 1 2
 1 3 2 3

k개의 줄에 입력된 좌표값대로 배열의 합을 출력한다.
 출력:
 63
 2
 36


   1 2 3 4
1  1 1 1 1
2  2 2 2 2
3  3 3 3 3
4  4 4 4 4

(3,3)~(4,4)


dp[x][y] = dp[x][y-1] + dp[x-1][y] + num -dp[x-1][y-1]

dp[x][y]-dp[i-1][y]-dp[x][j-1]+dp[i-1][j-1]
 */

import java.util.Scanner;

public class Dp2demension {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dp[][] = new int[301][301];
        dp[0][0]=0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                num=sc.nextInt();
                dp[i][j]=dp[i][j-1] + dp[i-1][j] + num -dp[i-1][j-1];
            }
        }

        int cnt,x1,x2,y1,y2;
        cnt= sc.nextInt();

        //(1 3) (2 3)
        for (int i = 1; i <=cnt ; i++) {
            x1= sc.nextInt();
            y1= sc.nextInt();
            x2= sc.nextInt();
            y2= sc.nextInt();
            System.out.println(dp[x2][y2]+dp[x1-1][y1-1]-dp[x1-1][y2]-dp[x2][y1-1]);
        }


    }
}
