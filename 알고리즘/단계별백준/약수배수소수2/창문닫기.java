package 알고리즘.단계별백준.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 창문닫기 {
    // n이 3이면 배수들을 계속 닫음 처음에 1번이 다 열고, 2번은 배수만큼 닫는데, 다음은 3이면 3배수 닫으면서 겹치는 6은
    // 이미 2에서 닫았으니까 3에서 6을 만나면 열게될듯 ?
    // 이미 2,4,6 처럼 한번 닫으면 끝남 바뀌는 수는 다음 수들 메모하면 될 거 같은데 그리고 그 수 나오면 약수들로 횟수 정하면..

    // 정리  배열로 하니 메모리초과 약수가 홀수개인 수들을 찾아 카운트하면 해결이라고 한다.. ( 제곱수!)


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());



        int count = 0;

        for (int i = 1; i * i <= n ; i++) { // 제곱수 지날때마다 카운트
            count++;
        }
//        for (int i = 1; i <= n; i++) {
//            if (i * i <= n) {
//                count++;
//
//            }
//        }
        //n번째 창문이 열려 있으려 그 창문을 닫고 연 횟수가 홀수여야 한다 ( 1에서 열었으니)
        //즉 연 횟수가 홀수일 때 창문의 열린 갯수가 하나씩 증가한다 1,4,9,16 등일떄마다 하나씩!
        //그 말은 약수가 홀수인 수인 제곱수 마다 창문이 하나 더 열리게 되는데 그걸 카운트해주자

        System.out.println(count);

    }
}
