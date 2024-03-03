package 알고리즘.단계별백준.약수배수소수2;

import java.io.*;
import java.util.ArrayList;

public class 골드바흐파티션 {

    //골드바흐의 추측은 2보 큰 짝수 두 소수의 합으로 나타낼 수 있다. 그럴 때 주어진 수의 파티션 갯수를 구하자! (순서 다르면 같은 취급)

    public static boolean[] prime = new boolean[1000001];
    //미리 그냥 만들자 테스트 마다 새로 만드니 시간초과가 걸린다 메모리 쓰기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        eratos();






        for (int i = 0; i < t; i++) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());
//            boolean arr[] = new boolean[n + 1];

            ArrayList<Integer> list = new ArrayList<>();



            for (int j = 2; j < n; j++) {
                if (!prime[j]) {
                    list.add(j);
                }
            }

            int left = 0;
            int right = list.size() - 1;


            while (left <= right) { // 같은 수도 가능해서 = 이 중요 자꾸 빼먹네 메모리떄메 투포인터 구현
                int sum = list.get(left) + list.get(right);
                if (sum == n) {
                    count++;
                    left++;
                    right--;
                } else if (sum > n) {
                    right--;
                } else if (sum < n) {
                    left++;
                }
            }

            System.out.println(count);



//            for (int j = 0; j < list.size() -1 ; j++) { // 투포인터 사용해야함 (시간초과)
//                if (list.get(j) > n) { // 반보다 크면 뒷 숫자는 더 커지는 수만 오기에 시간을 좀 더 단축
//                    break;
//                }
//
//                for (int k = j; k < list.size(); k++) {
//                    if (list.get(j) + list.get(k) == n) {
//                        count++;
//                        break;
//                    }
//                }
//            }
//            sb.append(count).append('\n');

        }
        br.close();


    }

    private static void eratos() {

        prime[0] = prime[1] = true;
        int max = 1000000;

        for (int j = 2; j * j <= max; j++) {
            if (!prime[j]) {
                for (int k = j * j; k <= max; k += j) {
                    prime[k] = true;

                }
            }
        }

    }
}
