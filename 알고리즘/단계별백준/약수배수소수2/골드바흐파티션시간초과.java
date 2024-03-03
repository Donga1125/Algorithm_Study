package 알고리즘.단계별백준.약수배수소수2;

import java.io.*;
import java.util.ArrayList;

public class 골드바흐파티션시간초과 {

    //골드바흐의 추측은 2보 큰 짝수 두 소수의 합으로 나타낼 수 있다. 그럴 때 주어진 수의 파티션 갯수를 구하자! (순서 다르면 같은 취급)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < t; i++) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            boolean arr[] = new boolean[n + 1];

            ArrayList<Integer> list = new ArrayList<>();

            arr[0] = arr[1] = true;

            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (!arr[j]) {
                    for (int k = j * j; k <= n; k += j) {
                        arr[k] = true;

                    }
                }
            }

            for (int j = 2; j < n; j++) {
                if (!arr[j]) {
                    list.add(j);
                }
            }


            for (int j = 0; j < list.size() -1 ; j++) {
                if (list.get(j) > n) { // 반보다 크면 뒷 숫자는 더 커지는 수만 오기에 시간을 좀 더 단축
                    break;
                }

                for (int k = j; k < list.size(); k++) {
                    if (list.get(j) + list.get(k) == n) {
                        count++;
                        break;
                    }
                }
            }
            sb.append(count).append('\n');

        }
        System.out.println(sb);
        br.close();
        bw.flush();
        bw.close();

    }
}
