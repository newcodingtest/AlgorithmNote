package 거듭제곱_17;

import java.util.Scanner;
//입력받은 값의 거듭제곱
public class Multiple {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int y=sc.nextInt();

        int result=1;
        for (int i=0; i<y; i++){

            result*=x;
        }
        System.out.println(result);

    }
}
