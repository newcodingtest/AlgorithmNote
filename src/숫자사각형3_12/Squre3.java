package 숫자사각형3_12;

import java.util.Scanner;
//  1   5   9  13
//   2   6  10  14
//   3   7  11  15
//   4   8  12  1
public class Squre3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
        int[][]arr =new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[j][i]=i*n+j+1;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                System.out.printf("%4d",arr[i][j]);
            }
            System.out.println();
            }
    }
}
