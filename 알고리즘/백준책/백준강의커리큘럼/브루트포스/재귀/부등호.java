package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 부등호 {

    //2529
    // <,> , k로 나열된 순서열 a가 있을 때 주어진 부등호를 만족하는 이어진 수 중 최소 값과 최대값을 이어서 반환
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;
    private static boolean[] visited = new boolean[10];
//    private static String answer = "";

    //숫자는 0~9 , 10개로 구성 각 하나 씩 써야함
//    private static int[] num; // 오답 반복문에서 범위 지정으로 해결
    private static char[] arr;
    private static int t;

    static List<String> list = new ArrayList<>();

    //2 <= k , k <= 9

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
//        num = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // num 배열로 관리할 필요가 없다 그냥 반복문에서 범위로 지정해주면 되니까



        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new char[t];

        for (int i = 0; i < t ; i++) {
            arr[i] = st.nextToken().charAt(0); // 어차피 하나 밖에 없어서 하나만 담음

        }

        recursion("", 0);


//        System.out.println(max);
//        System.out.println(min);

        System.out.println(list.get(list.size() - 1));
        System.out.println(list.get(0));



    }

    private static void recursion(String a, int depth) {

        // 기저 조건
        if (depth == t + 1) {
//            int ans = Integer.parseInt(a);
//            max = Math.max(max, ans);
//            min = Math.min(min, ans); // 021가 들어와서 숫자로 바뀌면 0이 없어짐 ㅠ 그래서 리스트로 해야겠다
            list.add(a);

            return;

        }
        // 기저에서 탈출 전answer을 Integer로 바꾸고 max랑 min 비교해서 저장하고 return


        // 작동이 부등호 갯수+ 1 수를 가지고 돌고 서로 조합해서 들어온 조합식에 일치되면 answer에 추가해주고
        //fori로 depth +1해서 넘겨서 탐색하면 부등호 >가 올 때 0부터 탐색이라 불가능 다르게 만들어야 할듯 2중
        // return

        for (int i = 0; i <= 9; i++) {
            if(visited[i]) continue;
            if (depth == 0 || check((a.charAt(depth - 1) - '0'), i , arr[depth - 1])) {
                visited[i] = true;
                recursion(a + i, depth + 1);
                visited[i] = false;
            }



            }
        }




    private static boolean check(int a, int b, char c) { // 체크 배열로 해결
        //char를 그냥 String으로 했더니 순서에서 오류가 남


        if (c == '<') {
            if (a > b)
                return false;
        } else if (c == '>') {
            if (a < b) {
                return false;
            }
        }
        return true;

    }
}
