package 팩토리얼구하기_7;

import java.util.Scanner;

public class fac {

    public static int fac (int n){
       if(n<=1)
           return n;
       else
           return fac(n-1)*n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fac(x));



    }
}