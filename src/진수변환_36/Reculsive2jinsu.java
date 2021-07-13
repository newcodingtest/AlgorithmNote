package 진수변환_36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2진수 변환하기
public class Reculsive2jinsu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reculsive(n);
        reculsive1(n);

    }

    //내가 한 방법(리스트 사용)
    static void reculsive(int n){
        int result = 0;
        List list = new ArrayList();

        while(n>0) {
            result = n % 2;
            list.add(result);
            n /= 2;
        }
        System.out.println(list);
    }

    //추가되는 참고 방법(단순 출력문 사용)
    static void reculsive1(int n){
        if(n/2==0){
            System.out.print(n);
            return;
        }
        reculsive1(n/2);
        System.out.print(n%2);
    }

}
