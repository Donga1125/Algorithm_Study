package 알고리즘.leetcode.august;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixIII {

   // 885. Spiral Matrix III

    // 행 열 주어지고, row 시작점 col 시작점도 주어짐
    // 나선형으로 도는데, 움직이는 곳을 다 반환(배열을 벗어날수도 있음)

    public static void main(String[] args) {

        int row = 3;
        int cols = 3;
        int rStart = 1;
        int cStart = 1;
        SpiralMatrixIII sol = new SpiralMatrixIII();
        sol.spiralMatrixIII(row, cols, rStart, cStart);


    }

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

//        int[][] matrix = new int[rows][cols];

        // 움직임이 나선형이 오 아래 왼 위
        // 그러면 전 움직임에 대한 사각형 배열의 크기를 기억하고 있어야 나선형으로 움직일 때
        // 얼만큼 움직일지 알 수가 있다.. 즉 첫 왼무빙때 한칸만 가는게 아니라 1이 시작한 걸 지나가야하니
        // 2칸을 왼쪽으로 가야하는데 이걸 기억해야함

        // 배열의 크기를 초과할 경우 저장되는 수는 카운트 x
        // 배열 초과를 이동 범위에 따라 행 열의 숫자 자체를 올려주
        //처음 배열이 초과하면?

        //  max 4, 5

        int nowR = rStart;
        int nowC = cStart;


        int[][] result = new int[rows * cols][2]; // 결과를 담을 2차원 배열
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 동, 남, 서, 북
        int d = 0; // 시작 방향은 동쪽
        int steps = 1; // 한 방향으로의 초기 이동 횟수
        int index = 0; // result 배열에 추가할 위치 인덱스

        result[index++] = new int[]{rStart, cStart}; // 초기 위치를 배열에 추가


        while (index < rows * cols) {
            for (int i = 0; i < 2; i++) {  // 각 움직임마다으 두 번씩 이동하고 +1됨
                for (int j = 0; j < steps; j++) { // 1, 2, 3, 4, 5번씩 움직임이 각 2번
                    rStart += directions[d][0];
                    cStart += directions[d][1];

                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) { // 배열 범위 안에 들어올 경우 추가
                        result[index++] = new int[]{rStart, cStart}; // 인덱스가 배열에 추가될 경우에만 늘어야 맞음
                    }

                    if (index == rows * cols) {
                        return result; // 모든 위치를 다 채우면 루프 종료인데 step에 따른 움직임만 종료해서 오류남
                    }
                }
                // step만큼 쭉 이동 후 방향 전환
                d = (d + 1) % 4; // 방향 전환
            }
            steps++; // 이동 횟수 증가
        }

        return result;
    }
}
