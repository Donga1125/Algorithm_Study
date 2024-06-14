package 알고리즘.프로그래머스.항해99.사주차;

public class subrectangleQueries {

    //1476. Subrectangle Queries

    //총 3가지 메서드,
    // 1. 들어온대로 배열 만들기
    // 2. row,col을 들어오면 그 좌표 값 반환
    // 3. row1 co1 부터 row2 col2까지의 수를 들어온 newvalue로 초기화

    private int[][] rectangle1;

    public static void main(String[] args) {
        int[][] arr = new int[][]
                       {{1, 2, 1},
                        {4, 3, 4},
                        {3, 2, 1},
                        {1, 1, 1}};
        subrectangleQueries main = new subrectangleQueries(arr);
        main.getValue(0, 2);
        main.updateSubrectangle(0,0,3,2,5);
        main.getValue(0, 2);
        main.getValue(3, 1);
        main.updateSubrectangle(3, 0, 3, 2, 10);
        main.getValue(3, 1);
        main.getValue(0, 2);




    }

    public subrectangleQueries(int[][] rectangle) {

       this.rectangle1 = rectangle;

    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {

        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle1[i][j] = newValue;

            }

        }

    }

    public int getValue(int row, int col) {


        return rectangle1[row][col];

    }
}
