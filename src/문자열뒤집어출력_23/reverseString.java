package 문자열뒤집어출력_23;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String n=sc.next();

        for (int i = n.length()-1; i >=0; i--) {
            System.out.print(n.charAt(i));
        }
    }
}
