package 숫자사각형4_13;

import java.util.Scanner;

public class Square4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr =new int[n][n];
        int result=1;
        for(int i=0; i<n; i++){
              for(int j=0; j<n; j++){
                  arr[i][j]=(i+1)*(j+1);;
              }

          }
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d",arr[j][i]);
            }
            System.out.println();
        }
        }
    }

