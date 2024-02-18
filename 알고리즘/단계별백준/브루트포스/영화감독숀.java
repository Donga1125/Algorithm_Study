package 알고리즘.단계별백준.브루트포스;

import java.util.Scanner;

public class 영화감독숀실패 {
    //666은 연속되어야 하고 666이 포함한 제일 작은수부터 1번째이다.
    //포인트는 666이 연속되어서 숫자를 세는데 666의 왼쪽이나 오른쪽에 붙인 수 중 더 작은 수를 하나씩 올려주고,
    // 올려주다 비교해서 왼쪽이 더 커져야 하는 경우에 스위칭 반대로 오른쪾도 스위칭 반복해서 카운팅 !

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 666;
        int count = 1;

        for (int i = 1; i <n; i++) {
            String str = String.valueOf(min);
            int left = Integer.parseInt(str + String.valueOf(i));
            int right = Integer.parseInt(String.valueOf(i) + str);
            if (left > right) {
            }

        }
        System.out.println(min);
    }
}
