package 대문자는소문자_소문자는대문자_5;

import java.util.Scanner;

public class DaeSo {
    public static void main(String[] args) {
        String input = "helloWorLD";
        char[] arr;
        arr = input.toCharArray();
        System.out.println(arr);

        for (int i=0; i<arr.length; i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i]=(char)(arr[i]+'A'-'a');
            }
            else if(arr[i]>='A' && arr[i]<='Z'){
                arr[i]=(char)(arr[i]-('A'-'a'));
            }
        }
        System.out.println(arr);
    }
}

