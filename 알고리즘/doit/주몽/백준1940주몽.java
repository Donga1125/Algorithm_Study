package 알고리즘.doit.주몽;

//주몽은 철기군을 양성하기 위한 프로젝트에 나섰다. 그래서 야철대장을 통해 철기군이 입을 갑옷을 만들게 하였다. 야철대장은 주몽의 명에 따르기 위하여 연구에 착수하던 중 아래와 같은 사실을 발견하게 되었다.
//
//갑옷을 만드는 재료들은 각각 고유한 번호를 가지고 있다. 갑옷은 두 개의 재료로 만드는데 두 재료의 고유한 번호를 합쳐서 M(1 ≤ M ≤ 10,000,000)이 되면 갑옷이 만들어 지게 된다. 야철대장은 자신이 만들고 있는 재료를 가지고 갑옷을 몇 개나 만들 수 있는지 궁금해졌다. 이러한 궁금증을 풀어 주기 위하여 N(1 ≤ N ≤ 15,000) 개의 재료와 M이 주어졌을 때 몇 개의 갑옷을 만들 수 있는지를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에는 재료의 개수 N(1 ≤ N ≤ 15,000)이 주어진다. 그리고 두 번째 줄에는 갑옷을 만드는데 필요한 수 M(1 ≤ M ≤ 10,000,000) 주어진다. 그리고 마지막으로 셋째 줄에는 N개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 주어진다. 고유한 번호는 100,000보다 작거나 같은 자연수이다.
//
//출력
//첫째 줄에 갑옷을 만들 수 있는 개수를 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 투포인터 쓰기 배열로 만들어서 저장 n의 범위가 150,000이라 O(NlogN)도 가능

public class 백준1940주몽 {

    public static void main(String[] args) throws IOException {
        
        // 입력 값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        
        // 배열로 투포인터
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());


        }
        Arrays.sort(arr);


        int start = 0, end =N -1 , count = 0;
        // start와 end를 바로 배열의 값으로 만들었는데 이렇게 숫자로 해놓고 더하는 값만 따로 빼는 게 더 깔끔하고
        //while문 종료조건도 만족되어서 좋다

        while (start < end) { // 인덱스가 교차하는 순간은 중복임으로 세어주지 않고 종료하는 조건!
            int sum = arr[start] + arr[end];


            if (sum == M) {// 특정 수를 반환 해야하기에 9가 되거나 안되거나에 따라 start end를 더해주거나 빼주거나 한다!
                          // 같을 경우도 딱 한 수기에 그럼 둘다 움직여준다!
                count++;
                start++;
                end--;

            } else if (sum > M) {
                end--;

            } else if (sum < M) {
                start++;
            }

        }
        System.out.println(count);


    }
}
