package palindrome_22;

import java.util.Scanner;

//입력된 수가 팰린드롬인지 판별하기
//ex 12321, 기러기, level 과 같이 거꾸로 해도 글짜가 같은것을 의미함
public class palin {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String n=sc.next();
        int m=n.length()/2;

        boolean check=true;

        for (int i = 0; i <m; i++) {
            if(n.charAt(i)!=n.charAt(n.length()-i-1)){
                check=false;
            }
        }
        System.out.println(check+": false 가 나오면 팰린드롬이 아님");
    }
}
