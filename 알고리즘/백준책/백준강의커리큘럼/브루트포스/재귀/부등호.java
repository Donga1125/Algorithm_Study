package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부등호 {

    //2529
    // <,> , k로 나열된 순서열 a가 있을 때 주어진 부등호를 만족하는 이어진 수 중 최소 값과 최대값을 이어서 반환
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;
    private static String answer = "";

    //숫자는 0~9 , 10개로 구성 각 하나 씩 써야함
    private static int[] num;
    private static String[] arr;
    private static int t;

    //2 <= k , k <= 9

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        num = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new String[t];

        for (int i = 0; i < t ; i++) {
            arr[i] = st.nextToken();

        }



    }

    private static void recursion(int depth) {

        // 기저 조건
        if (depth == t + 1) {

        }
        // 기저에서 탈출 전answer을 Integer로 바꾸고 max랑 min 비교해서 저장하고 return


        // 작동이 부등호 갯수+ 1 수를 가지고 돌고 서로 조합해서 들어온 조합식에 일치되면 answer에 추가해주고
        //fori로 depth +1해서 넘겨서 탐색하면 부등호 >가 올 때 0부터 탐색이라 불가능 다르게 만들어야 할듯 2중
        // return
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (arr[depth] == "<" && num[i] < num[j]) {
                    recursion(depth + 1);
                }
            }

        }

    }
}
