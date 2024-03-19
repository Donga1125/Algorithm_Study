package 알고리즘.단계별백준2.백트레킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자끼워넣기완전탐색 {
    // math { +, -, *, /} 순서

    // 수식은 무조건 숫자보다 하나 적게 주어진다..

    // sum도 넘기고 그 섬에서 계속 수식 하나씩 써야 하네
    // 근데 최대 값이랑 최소 값을 찾을꺼면 숫자는 어차피 순서대로 들어오고,,
    // *,/ 만 잘 써서 찾아야할듯 전체 탐색이 아니라.. 수식에 우선순위를 둬야 하나
    private static int[] arr;
    private static int[] math = new int[4];

    private static int count;

    private static int sum;
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        arr = new int[t];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            math[i] = Integer.parseInt(st.nextToken());
            count = count + i; // 카운트만큼 총 다 쓰면 탈출조건
        }

        backTracking(0,0);


    }

    private static void backTracking(int sum,int depth) {


        if (depth == count) {

            if (sum > max) {
                max = sum;
            } else if (sum < min) {
                min = sum;

            }

            return;

        }
        for (int i = 0; i < count; i++) { // 카운트 만큼 돌면서 계산은 맞지만.. 연산자 구분 어떻게 할꺼지 ?
            if (math[i] != 0) {

            }

        }




        }



    }

