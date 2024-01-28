package 알고리즘.doit.수들의합;

import java.util.Scanner;

//수들의 합
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//2 초	128 MB	58571	23890	20234	41.667%
//문제
//서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
//
//입력
//첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.
//
//출력
//첫째 줄에 자연수 N의 최댓값을 출력한다.

// 이건 투포인터가 아니라 처음부터 1부터 더해가며 그 조합으로 s를 만들어야 하는데, 만들면 그 술 리턴
public class 백준1789수들의합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();  //N만 long으로 해주고 sum은 안해줘서 틀림
        long sum = 0, count = 0, num = 1;

        while (sum <= N) {
            // 1 = 1 + 2;
            //3
            // 1 = 2;
            sum =  sum + num;
            if (sum > N) {
                break;
            }
            count++;
            num++;
            }
        System.out.println(count);
        }



    }

