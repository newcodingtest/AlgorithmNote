package 학생정보저장_1;

import java.util.ArrayList;
import java.util.Scanner;

public class st {

    public static void main(String[] args) {
        Student std1=new Student("윤주영","1");
        Student std2=new Student("홍길동","2");
        Student std3=new Student("김건호","3");

        ArrayList<Student> arr= new ArrayList<Student>();
        arr.add(std1);
        arr.add(std2);
        arr.add(std3);

        Scanner sc= new Scanner(System.in);

        while(true) {
            System.out.print("학생 이름을 입력하세요: ");
            String name=sc.next();
            boolean check=false;
            for(Student st:arr) {
                if(st.getName().equals(name)) {
                    System.out.println(st.getNum());
                    check=true;
                }
            }
            if(check==false) {
                System.out.println("학생번호가 없어요");
                System.out.println(!check);
            }

            System.out.print("계속 검색 할래?");
            String ys=sc.next();
            if(ys.equals("y")) {
            }
            else if(ys.equals("n")) {
                System.out.println("종료할께");
                break;
            }

        }

    }
}


