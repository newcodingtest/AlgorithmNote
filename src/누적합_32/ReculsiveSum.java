package 누적합_32;


import java.util.Scanner;

//입력된 두 수 까지의 합을 구하시오
//1 4
//답: 10
public class ReculsiveSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int sum=0;
        for (int i = n; i <=m ; i++) {
            sum+=i;
        }

        System.out.println(sum);


    }
}
