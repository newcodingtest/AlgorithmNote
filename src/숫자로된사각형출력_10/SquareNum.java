package 숫자로된사각형출력_10;

import java.util.Scanner;

public class SquareNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr=new int[n][n];
        int cnt=1;

        System.out.println("arr.length = " + arr.length);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j]=cnt++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
