package RGM거리_41;

import java.util.Scanner;

/*
문제:
RGB 거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 합니다.
또한 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다.
집 i의 이웃은 집i-1과 집i+1 이고,
첫 집과 마지막 집은 이웃이 아니다.
각 집을 빨강/초록/파랑으로 칠할 때 드는 비용이 주어질 때
모든 집을 칠하는 비용의 최소값을 구하는 프로그램 작성하시오

입력:
첫째 줄에 집의수 N이 주어짐. N은 1000보다 작거나 같음,
둘째 줄 부터 N개의 줄에 각 집을 빨강/초록/파랑으로 칠하는 비용이 주어짐
비용은 1000보다 작거나 같은 자연수

출력:
첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력

예제입력:
3
빨  초  파
26 40 83
49 60 57
13 89 99
출력:
96
* */
public class Rgb {
    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    static int[][] cost;
    static int[][] dp;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        cost = new int[n][n];
        dp = new int[n][n];

        for (int i = 0; i <n; i++) {
            cost[i][Red]=sc.nextInt();
            cost[i][Green]=sc.nextInt();
            cost[i][Blue]=sc.nextInt();
        }

        dp[0][Red]=cost[0][Red];
        dp[0][Green]=cost[0][Green];
        dp[0][Blue]=cost[0][Blue];

        System.out.println(Math.min(Paint_cost(n-1,Red),Math.min(Paint_cost(n-1,Green),Paint_cost(n-1,Blue))));

    }

    static int Paint_cost(int n, int color) {
        if (dp[n][color] == 0) {

            if (color == Red) {
                dp[n][Red] = Math.min(Paint_cost(n - 1, Green), Paint_cost(n - 1, Blue)) + cost[n][Red];
            } else if (color == Green) {
                dp[n][Green] = Math.min(Paint_cost(n - 1, Red), Paint_cost(n - 1, Blue)) + cost[n][Green];
            } else {
                dp[n][Blue] = Math.min(Paint_cost(n - 1, Red), Paint_cost(n - 1, Green)) + cost[n][Blue];
            }

        }
        return dp[n][color];
    }
}
