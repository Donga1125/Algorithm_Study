package 기초2.Day26.임한준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class 일곱_난쟁이 {

    /**
     * 문제
     * 왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
     * <p>
     * 아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다.
     * 뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
     * <p>
     * 아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
     * <p>
     * 입력
     * 아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며,
     * 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
     * <p>
     * 출력
     * 일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.
     */

    //브루트 포스 (완전 탐색) dp로 풀어도 되는 것 같은데.
    // 오름차순 (순 접미사)
    //두개 반복문 돌면서 ? 가짜 2명 찾아 내기 sum - a -b ==100 이면 a,b가 가짜

    static int[] input = new int[9];
    static int sum = 0;

    static int a = 0;
    static int b = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 9; i++) {
            input[i] = Integer.parseInt(br.readLine());
            sum += input[i];
        }

        // 오름차순
        Arrays.sort(input);

        // 다른 두명 변수

        for (int i = 0; i < input.length; i++) { // 2개 빼주고
            for (int j = i + 1; j < input.length; j++) {

                if (sum - input[i] - input[j] == 100) {
                    a = i;
                    b = j;

                    for (int k = 2; k < input.length ; k++) { // ?
                        System.out.println(input[k]);
                    }

                    return;
                }

            }
        }
    }
}

//import java.util.*;
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] arr = new int[9];
//        int sum = 0;
//        for (int i = 0; i < 9; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//            sum += arr[i];
//        }
//        for (int i = 0; i < 8; i++) {
//            for (int j = i+1; j < 9; j++) {
//                if (sum - arr[i] - arr[j] == 100) {
//                    arr[i] = 0;
//                    arr[j] = 0;
//                    Arrays.sort(arr);
//                    for (int k = 2; k < 9; k++) {
//                        System.out.println(arr[k]);
//                    }
//                    return;
//                }
//            }
//        }
//    }
//}

