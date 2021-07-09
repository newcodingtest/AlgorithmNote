package fibonacci_34;

import java.util.Scanner;
//피보나치 재귀
//입력: 6
//출력: 8(1 1 2 3 5 8)
public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fiboc(n));

    }

    static int fiboc(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 1;

        return fiboc(n-1)+fiboc(n-2);
    }

}
