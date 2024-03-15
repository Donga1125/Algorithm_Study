package 알고리즘.단계별백준2.백트레킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n과m2 {

    //1과는 다르게 반대 중복도 없애주자 찾는 조건에 추가해주면 될듯 ?
    public static int[] arr;
//    public static boolean[] isVisited;

    public static int n;
    public static int m;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
//        isVisited = new boolean[n + 1];

        backTracking(1,0);


    }

    public static void backTracking(int at, int depth) {

        // 원랜 isvisited 배열로 확인했다면 이번엔 at을 그냥 추가해서 at 다음부터 출발할 수 있게금 한다
        //depth도 하나씩 늘어나서 중복이 담길 수 없는 구조가 됨

        if (depth == m) {

            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = at; i <= n; i++) {

            arr[depth] = i;

            backTracking(i + 1, depth + 1);

            }


        }

    }

