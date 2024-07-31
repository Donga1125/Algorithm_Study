package 알고리즘.leetcode.july;

import java.util.Arrays;

public class FillingBookcaseShelves {

    // 1105. Filling Bookcase Shelves

    //테트리스다 dp 문제인 듯
    // 가로의 한계는 주어지고 가로에 맞게 최소의 세로를 구하는 문제
    // 각 케이스마다 가로 세로가 주어짐

    // 각 shelifWidth를 한 번 넘어가면 남은 공간 활용 x

    // dp를 활용하고, 현재 책마다 같이 놓을 책들을 구함
    // 예를 들어 현재 3번째 책을 놓을 상황이라면
    //3번째 책만 놓는 경우의 가로, 세로를
    // 2번째 +3 번쨰일 경우 최대 세로는 달라지

    // // j = 3 (세 번째 책만 현재 선반에 놓는 경우)
    //width = 3 (두께 합)
    //height = 2 (최대 높이)
    //dp[3] = Math.min(dp[3], dp[2] + 2) = Math.min(Integer.MAX_VALUE, 4 + 2) = 6
    //
    //// j = 2 (두 번째 책과 세 번째 책을 현재 선반에 놓는 경우)
    //width = 2 + 3 = 5 (두께 합)
    //height = Math.max(4, 2) = 4 (최대 높이)
    //dp[3] = Math.min(dp[3], dp[1] + 4) = Math.min(6, 3 + 4) = 6
    //
    //// j = 1 (첫 번째 책, 두 번째 책, 세 번째 책을 함께 현재 선반에 놓는 경우)
    //width = 1 + 2 + 3 = 6 (두께 합)
    //height = Math.max(3, 4, 2) = 4 (최대 높이)
    //dp[3] = Math.min(dp[3], dp[0] + 4) = Math.min(6, 0 + 4) = 4


    public static void main(String[] args) {

        int[][] books = new int[][]{{1, 1}, {2, 3}, {2, 3}, {1, 1}, {1, 1}, {1, 1}, {1, 2}};
        int shelfWidth = 4;
        FillingBookcaseShelves main = new FillingBookcaseShelves();
        System.out.println(main.minHeightShelves(books, shelfWidth));


    }

    public int minHeightShelves(int[][] books, int shelfWidth) {

        int length = books.length;

        int dp[] = new int[length + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= length; i++) {
            int thick = 0;
            int height = 0;

            for (int j = i; j > 0; j--) {
                thick = thick + books[j - 1][0]; // 이해 안감

                if (thick > shelfWidth) { // 계산 전에 옆에 두었을때 초과되면 끝남
                    break;
                }
                height = Math.max(height, books[j - 1][1]);
                dp[i] = Math.min(dp[i], dp[j - 1] + height);
                // j번 반복할 떄 마다 ( 옆에 두거나 새로운 선반에 둘 때 마다 더 작은 min 값의 최선의 작은 높이를 계속 구해짐
            }
        }

        return dp[length];

    }
}
