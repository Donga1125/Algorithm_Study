package 알고리즘.프로그래머스.항해99.삼주차;

public class countSquareSubmatriceswithAllOnes {

    // 0 or 1의 수가 주어지고 arr[][]안ㅇ 주어지면
    //정사각형의 갯수 return
    // 매트릭스 안에서 모든 수 더하기 느낌으로 하다 1,4,9가 만들어질 때 카운팅 +1 해주는 방식으로 가자
    // 11
    // 11 일 때 (1,1) 4를 저장하는 건 되는데  +1의 규칙성을 어떻게 정하지 ?
    // dp[i][j] = matrix[i][j] + dp[i - 1][j] + dp[i][j] - dp[i - 1][i - 1] 까진 느낌 오는데
    // 여기서 4개 9개가 1이 다 채워져 있다면 +1씩 계속 해줘야 하는데 이것도 다시 검사 ?

    private static int[][] dp;
    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 1}, {1, 1}};

        countSquareSubmatriceswithAllOnes main = new countSquareSubmatriceswithAllOnes();

        System.out.println(main.countSquares(arr));



    }

    public int countSquares(int[][] matrix) {

        int answer = 0;

        dp = new int[matrix.length][matrix[0].length]; // 같은 배열 크기로 초기화


        for (int i = 0; i <matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) { // 현재 수가 1인데, 가장자리의 수를 기본 값으로 계속 세팅
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;






                    } else {

                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }

                    answer = answer + dp[i][j];


                }

            }
        }




        return answer;

    }

}
