package 단지의세대수_37;

/*
입력: 입력된 단지의 수와 각 단지의 세대수를 출력하시오
00011
00001
10000
11000
11011

정답: 3       //단지수
       3 5 2  //단지의 세대수

* */

public class reculsive {

    static int map[][]={
            {0,0,0,1,1,},
            {0,0,0,0,1,},
            {1,0,0,0,0,},
            {1,1,0,0,0,},
            {1,1,0,1,1,}
                        };
    static final int APART = 1; //단지 존재유무
    static final int size = map.length;


    static int apartCnt = 0; //총 단지의 수 측정
    static int[] house = new int[10]; //각 단지의 세대수 저장 배열


    //해당 재귀는 위아래옆 한칸 으로 1이 없으면 세대수가 떨어져잇다고 판단하고 끝남
    public static void reculsive(int x, int y, int Index){
        map[x][y] = 0;
        house[Index]++;


         if(x-1>=0 && map[x-1][y] == APART)
             reculsive(x-1,y,Index);
         if(x+1<=size-1 && map[x+1][y] == APART)
                reculsive(x+1,y,Index);
         if(y-1>=0 && map[x][y-1] == APART)
                reculsive(x,y-1,Index);
         if(y+1<=size-1 && map[x][y+1] == APART)
                reculsive(x,y+1,Index);

    }

    public static void main(String[] args){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(map[i][j] == 1){
                    reculsive(i,j,apartCnt);
                    apartCnt++;
                }
            }
        }
        System.out.println(apartCnt);
        for(int i:house){
            System.out.print(i+" ");
        }
    }

}
