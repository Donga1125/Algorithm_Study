package 알고리즘.프로그래머스.dfsbfs;

public class 아이템줍기 {

    public static void main(String[] args) {

        int[][] rectangle = new int[][]{{1, 1, 7, 4}, {3, 2, 5, 5}, {4, 3, 6, 9}, {2, 6, 8, 8}};
        int characterX = 1;
        int characterY = 3;
        int itemX = 7;
        int itemY = 8;
        아이템줍기 main = new 아이템줍기();
        System.out.println(main.solution(rectangle, characterX, characterY, itemX, itemY));

    }


    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        return answer;
    }
}
