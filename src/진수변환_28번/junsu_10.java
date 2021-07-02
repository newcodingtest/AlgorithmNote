package 진수변환_28번;

import java.util.Scanner;
//첫째자리, 입력받은수와
//둘째자리, 변환하고싶은 진수를
//10진수를 2~16 진수로 변환

public class junsu_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int jin=sc.nextInt();

        //문자까지 들어갈수 있기때문에 char형식
        char n[]=new char[100];
        int i=0;

        while(num>0){
            //입력된 수와 진수를 나눈다.
            int tmp = num % jin;

            //최대 연산 진수가 16진수까지로 생각하고 시작한다.
            //만약 나머지가 10~15 이면 10~15진수이다.
            if(tmp >= 10 && tmp <= 15){
                n[i] = (char)('A'+(tmp-10));//tmp 가 10일경우 문자 A가 들어감,11일경우 A+1=B  B값이 들어감
            }else{
                //나머지는
                n[i] = (char)('0'+tmp);
            }
            num/=jin;
            i++;
        }

        for (; i>=0; i--){
            System.out.print(n[i]);
        }



    }
}
