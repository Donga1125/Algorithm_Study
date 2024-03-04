package 알고리즘.단계별백준.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 창문닫기메모리초과 {
    // n이 3이면 배수들을 계속 닫음 처음에 1번이 다 열고, 2번은 배수만큼 닫는데, 다음은 3이면 3배수 닫으면서 겹치는 6은
    // 이미 2에서 닫았으니까 3에서 6을 만나면 열게될듯 ? 6의 공배수들을 찾으면 될 거 같은데
    // 이미 2,4,6 처럼 한번 닫으면 끝남 바뀌는 수는 다음 수들 메모하면 될 거 같은데 그리고 그 수 나오면 약수들로 횟수 정하면..


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[n + 1];

        int count = 0;





        for (int i = 2; i <= n; i++) {

            for (int j = i; j <= n; j += i) {

                if(arr[j] == true) {
                    arr[j] = false;
                } else if (arr[j] == false) {

                arr[j] = true; }

            }

        }


        for (int i = 1; i <= n; i++) {

            if (arr[i] == false) {
                count++;
            }


        }

        System.out.println(count);

    }
}
