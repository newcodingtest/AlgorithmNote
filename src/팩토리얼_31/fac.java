package 팩토리얼_31;

import java.util.Scanner;

//팩토리얼, 재귀
public class fac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println( facc(n));

    }
     static int facc(int n){

        if(n==1){
            return 1;
        }
        return n*facc(n-1);
    }
}
