package 알고리즘.단계별백준.브루트포스;

import java.util.Scanner;

public class 영화감독숀 {
    //666은 연속되어야 하고 666이 포함한 제일 작은수부터 1번째이다.
    //포인트는 666이 연속되어서 숫자를 세는데 666의 왼쪽이나 오른쪽에 붙인 수 중 더 작은 수를 하나씩 올려주고,
    // 올려주다 비교해서 왼쪽이 더 커져야 하는 경우에 스위칭 반대로 오른쪾도 스위칭 반복해서 카운팅 !

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 개 쉬운 브루트포스 계속 666부터 하나씩 늘어가면서 666이 포함된 작은 수일떄 카운트를 세주고 그 n번이랑 같아지면 num출력

        int num = 666;
        int count = 1;
        while (count != n) {
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }

        }
        System.out.println(num);

    }
}
