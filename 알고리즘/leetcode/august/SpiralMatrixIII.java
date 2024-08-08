package 알고리즘.leetcode.august;

public class SpiralMatrixIII {

   // 885. Spiral Matrix III

    // 행 열 주어지고, row 시작점 col 시작점도 주어짐
    // 나선형으로 도는데, 움직이는 곳을 다 반환(배열을 벗어날수도 있음)

    public static void main(String[] args) {

        int row = 5;
        int cols = 6;
        int rStart = 1;
        int cStart = 4;
        SpiralMatrixIII sol = new SpiralMatrixIII();
        sol.spiralMatrixIII(row, cols, rStart, cStart);


    }

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int[][] matrix = new int[rows][cols];

        // 움직임이 나선형이 오 아래 왼 위
        // 그러면 전 움직임에 대한 사각형 배열의 크기를 기억하고 있어야 나선형으로 움직일 때
        // 얼만큼 움직일지 알 수가 있다.. 즉 첫 왼무빙때 한칸만 가는게 아니라 1이 시작한 걸 지나가야하니
        // 2칸을 왼쪽으로 가야하는데 이걸 기억해야함

        // 배열의 크기를 초과할 경우 저장되는 수는 카운트 x
        // 배열 초과를 이동 범위에 따라 행 열의 숫자 자체를 올려주고

    }
}
