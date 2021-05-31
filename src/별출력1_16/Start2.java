package 별출력1_16;

import java.util.Scanner;
 /*      *****
          ****
           ***
            **
             *

  */
public class Start2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int x=sc.nextInt();

        for(int i=0; i<x; i++){
            for(int j=x-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println(" ");
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
        }

    }
}