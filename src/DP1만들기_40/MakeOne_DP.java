package DP1만들기_40;

/*
정수 x에 사용할 수 있는 연산은 세가지
1. x가 3으로 나누어 떨어지면 3으로 나눈다.
2. x가 2로 나누어 떨어지면 2로 나눈다
3. 1을 뺀다

정수 N이 주어졌을때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려한다.
연산을 사용하는 횟수의 최솟값을 출력하시오

입력:2
출력:1

입력:10(2 -> 5, -1->4, 2->2 2->1 )
출력:3
*/

import java.util.Scanner;


public class MakeOne_DP {

    static int[] map = new int[1000001];

    public static int min(int x, int y, int z){
        int min = x;
        if(x>y){
            min=y;
        }
        if(x>z){
            min=z;
        }
        return min;
    }

    public static void main(String[] args){
        map[2]=1;
        map[3]=1;
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

        for (int i = 4; i <=1000000; i++) {
            int a=99999;
            int b=99999;
            int c=99999;
            for (int w = 1; w <= 3 ; w++) {
                if(w == 1){
                        a = map[i - 1];
                }else if(w == 2){
                    if(i%2==0) {
                        b = map[i / 2];
                    }
                }else if(w == 3){
                    if(i%3==0) {
                        c = map[i / 3];
                    }
                }
            }
            int min = min(a,b,c);
            map[i]=1+min;
        }
        System.out.println(map[x]);

    }
}
