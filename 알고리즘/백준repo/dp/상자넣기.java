package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 상자넣기 {
    // 쭉 나열된 상자들이 있는데 앞 상자가 뒤에 상자보다 더 작다면 뒤 상자에 넣을 수 있다 (건너뛰기 가능)
    // 1, 5, 2, 3, 7 가 있다면 1을 5에 넣고 -> 다시 7에 넣으면 3번 넣게 된다
    // 근데 1 2 3 7 순으로 넣게 된다면 4번 넣을 수 있다 최대로 넣는 횟수를 구해라

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

    }
}
