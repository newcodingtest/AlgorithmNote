package 색칠재귀_33;

/*
00000
00110
00001
00000
00100

0을 모두 2로 색칠하시오.
(단, 0은 어떻게든 모두 연결됨)

정답:
22222
22112
22221
22222
22122

* */
public class ColorReculsive {

    static int[][] map={
            {0,0,0,0,0},
            {0,0,1,1,0},
            {0,0,0,0,1},
            {0,0,0,0,0},
            {0,0,1,0,0}
                        };
    static int change=2;
    static int size=map.length;

    static void color(int x, int y){
        //2채워넣기
        if(map[x][y]!=1){
            map[x][y]=change;
        }
        //아래로 값이 2도아니고 1도 아니면
        if(x-1>=0 && map[x-1][y]!=change && map[x-1][y]!=1)
            color(x-1,y);
        //위로 값이 2도아니고 1도 아니면
        if(x+1<=size-1 && map[x+1][y]!=change && map[x+1][y]!=1)
            color(x+1,y);
        //왼쪽
        if(y-1>=0 && map[x][y-1]!=change && map[x][y-1]!=1)
            color(x,y-1);
        //오른쪽
        if(y+1<=size-1 && map[x][y+1]!=change && map[x][y+1]!=1)
            color(x,y+1);

    }

    public static void main(String[] args){

        System.out.println(map.length);

        for (int i = 0; i <map.length ; i++) {
            for (int j = 0; j <map.length ; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        //색칠 재귀 시작
        color(0,0);
        System.out.println();
        for (int i = 0; i <map.length ; i++) {
            for (int j = 0; j <map.length ; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
