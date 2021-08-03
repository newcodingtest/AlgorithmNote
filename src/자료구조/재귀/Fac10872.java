package 자료구조.재귀;
/*
문제:
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

입력:
첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.

출력:
첫째 줄에 N!을 출력한다.

예제 입력:
10
0
예제 출력:
3628800
1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fac10872 {
    public static int recall(int n){
        if(n<=0) {
            return 1;
        }else {
            return n * recall(n - 1);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();

        int input = Integer.parseInt(br.readLine());

        sb.append(recall(input));

        System.out.println(sb);

    }
}
