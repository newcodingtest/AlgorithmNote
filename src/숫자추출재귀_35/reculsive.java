package 숫자추출재귀_35;

import java.util.Scanner;

public class reculsive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibo(n);
    }

    static void fibo(int n){

        if(n%10==0){
            System.out.print(n);
            return;
        }
        fibo(n/10);
        System.out.print(n%10);
    }
}
