package 알고리즘.항해99.삼주차;

public class partitionArrayforMaximumSum {

    //1043. Partition Array for Maximum Sum

    //arr가 주어지면 최대 k개의 subarr로 만드는데,
    // 합이 가장크게 만들어라 그 서브 어레이는 젤 큰 값으로 변경시키자
    //1. 어떻게 나누느냐가 중요한데, 어떻게 dp에 이 정보들을 저장하지..

    //일단 k개로 짤랐을 때 7개의 배열을 k인 3으로 짜르면 3개의 배열이 나오는데
    //작은 수가 있다면 제일 큰수에 포함시켜 바꿔주고, 그다음 제일 큰 수가 포함된 배열로
    //{15,15,15} {10,10,10} {9}의 형태로 작은 수들은 큰 수로 다 바꿔주는 형태가 베스트일듯

    private static int[] dp;



    public static void main(String[] args) {
        partitionArrayforMaximumSum main = new partitionArrayforMaximumSum();
        int[] arr = new int[]{1, 15, 7, 9, 2, 5, 10};
        int k = 3;

        int answer = main.maxSumAfterPartitioning(arr, k);
        System.out.println(answer);
    }

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;

        dp = new int[n + 1];


        for (int i = 1; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                max = Math.max(max, arr[i - j]);
                dp[i] = Math.max(dp[i], dp[i - j] + max * j);


            }
        }

        return dp[n];
        

    }


}
