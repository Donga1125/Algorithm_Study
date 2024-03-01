package 알고리즘.단계별백준.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 가로수 {
    // 주어진 수 중에 사이에 있는 가장 작은 걸 찾아야 하네 ( 증가도 만족 해야하는데 그건 고려 안하고 사이 수중 작은 것만 찾으면 될듯

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(br.readLine());



        }
        int minInterval = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            minInterval = Math.min(minInterval, arr[i] - arr[i - 1]);
        }

        // 가로수를 심을 위치를 계산하고 리스트에 추가
        for (int i = 1; i < n; i++) {
            int distance = arr[i] - arr[i - 1];
            int numTreesToAdd = (distance - 1) / minInterval;
            for (int j = 1; j <= numTreesToAdd; j++) {
                list.add(arr[i - 1] + minInterval * j);
            }
        }

        System.out.println(list.size());
    }
    }

