package 알고리즘.프로그래머스.항해99.오주차;

import java.util.Arrays;

public class minimumSuffixFlips {

    //1과 0으로 구성된 타겟 스트링이 들어오면 같은 길이의 0으로 이루어진 s를 타겟이랑 같이 만들고 싶다

    //한번 연산 0부터 시작하는 i~n-1까지의 인덱스를 한번에 바꿀 수 있다 (시작부터 끝까지 다 바꿈)
    // 0 -> 1 1-> 0
    //s를 target과 동일하게 만들기 위한 최소 연산

    // 00000 -> 10111

    // 00000 -> 00111,  i=2부터 n-1까지 바꾸고,  1
    // 00111 -> 11000,  i=0부터 n-1           2             11111 -> 10000 -> 10111
    // 11000 -> 10111,  i=1부터 n-1           3             01111 -> 01000 -> 10111

    //순서는 어떤 걸 먼저 하냐보다  012 201 120 이 흐름에만 맞으면 됨x
    //탐색을 어디서 하든 상관 x일 거 같다 그러면 0으로 시작한다면 다음 수가 먼지를 찾아야함
    // 근데 000 -> 001로 바꾸는 경우에는 3부터 무조건 시작해야 하잖아
    // 그러면 최초의 1부터 바꿔나가자 그냥 한번씩 brute force를 쓰지 않고 바꾸려면 ?

    // 000 -> 101
    // 000 -> 111 1   001 3   001 3   011 2  011 2
    // 111 -> 100 2   010 2   110 1   100 1  010 3
    // 100 -> 101 3   101 1   101 2   101 3  101 1

    // 현재 수가 더 앞의 index의 영향을 받게 된다.

    public static void main(String[] args) {

        String target = "10111";
        minimumSuffixFlips main = new minimumSuffixFlips();

        System.out.println(main.minFlips(target));

    }
    public int minFlips(String target) {

        int length = target.length();

        int arr[] = new int[length];
//        int sArr[] = Arrays.copyOf(arr, length);


        for (int i = 0; i < length; i++) {


            arr[i] = target.charAt(i) - 48; // 48보다 더 쌈뽕한 것 ?

        }
        int answer = 0;
        int now = 0;

//        for (int i = 0; i < length; i++) {
//
//            if (arr[i] != sArr[i]) {
//
//                answer++;
//                sArr[i] = arr[i];
//
//            for (int j = i; j < length; j++) {
//
//                if (sArr[j] == 1) {
//                    sArr[j] = 0;
//
//                } else
//                    sArr[j] = 1;
//            }
//            }
//        }

        for (int i = 0; i < length; i++) {

            if (arr[i] != now) {
                answer++;
                now = arr[i];


            }
        }

        return answer;

    }
}
