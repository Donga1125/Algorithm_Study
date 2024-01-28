package 알고리즘.doit.수들의합;

//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//2 초	32 MB	18515	8790	6621	48.838%
//문제
//어떠한 자연수 N은, 몇 개의 연속된 자연수의 합으로 나타낼 수 있다. 당신은 어떤 자연수 N(1 ≤ N ≤ 10,000,000)에 대해서, 이 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 알고 싶어한다. 이때, 사용하는 자연수는 N이하여야 한다.
//
//예를 들어, 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지가 있다. 반면에 10을 나타내는 방법은 10, 1+2+3+4의 2가지가 있다.
//
//N을 입력받아 가지수를 출력하는 프로그램을 작성하시오.
//
//입력
//첫 줄에 정수 N이 주어진다.
//
//출력
//입력된 자연수 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 출력하시오

// 핵심은 투포인터 투포인터는 O(n)의 시간복잡도를 가진다. 이 문제에선 천만이라 O(NlogN)이라도 위험할 수 있다..

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2018수들의합5 {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        int count = 1, sum = 1, start = 1, end = 1;
        //count는 자기 자신으로 만든 걸 하나 그냥 저장 15가 들어오면 15하나 저장


        while (end != N) {
            if (sum == N) {
                count++; end++;
                sum = sum + end;
            } else if (sum < N) {
                end++;
                sum = sum + end;
            } else { // {}를 안붙이면 무조건 if문의 sum이 n이 아닐경우에 실행하기에 문제가 됐
                sum = sum - start;
                start++;
               }


        }
        System.out.println(count);



    }
}
