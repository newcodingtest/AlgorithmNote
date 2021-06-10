package 중복된수제거_21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

//중복된 수 제거
//사용할 수 있는 방법 1. 배열 2. 해쉬셋 3.링크드해쉬셋 4.트리셋
public class removeDistinct {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String arr=sc.nextLine();

        //입력받은수 공백으로 구분해주기
        String[] arr1=arr.split(" ");

        ArrayList list = new ArrayList();

//첫번째 방법 해쉬셋
/*        //해쉬셋은 중복을 알아서 제거해준다.
        Set<String> set = new HashSet<>();

        for (String item : arr1){
            set.add(item);
        }

        Stream<String> set1=set.stream();
        set1.forEach(test-> System.out.println("test = " + test));*/

//두번째 방법 배열
        for(String test: arr1){
            if(!list.contains(test)) {
                list.add(test);
            }
        }

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }






    

    }
}
