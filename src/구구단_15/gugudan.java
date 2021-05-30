package 구구단_15;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        for (int i=1; i<=9; i++){
            for(int j=x; j<=y; j++){
                System.out.print(j+"*"+i+"="+j*i+" ");
            }
            System.out.println();
        }
    }
}
