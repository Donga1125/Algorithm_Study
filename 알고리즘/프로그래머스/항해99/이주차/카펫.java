package 알고리즘.프로그래머스.항해99.이주차;

public class 카펫 {

    //중앙에 노란색으로 색칠되어 있고 겉엔 갈색으로 감싼 구조의 카펫이 있다.
    //카펫의 크기를 기억하지 못하고 노랑타일의 수, 갈색 타일의 수만 알 때 가로와 세로를 반환해라

    //갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
    //노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
    //카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.

    // 가로가 더 기니까 약수들을 찾고 o1(가로)의 약수가 더 커지거나 같아질 때(제곱근까지만 구해도 되긴 하겠다)


    public static void main(String[] args) {

        카펫 main = new 카펫();
        main.solution(24,24);
//        System.out.println(main.solution(24, 24).toString());

    }

    private int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int[] yellowRow;


        int size = brown + yellow;

        for (int i = 1; i < size; i++) {




            if (size % i == 0) { // 제곱근까지 할 지  ? 그냥 size는 안들어오게 하면 될듯


                int j = size / i;

                if (i >= j) {
                    if(i > yellow){


                    answer[0] = i; // fail 일차적으로 약수고, 가로가 더 커지거나 둘 중 같은 수만 생각했는데 반례가 있다
                    answer[1] = j;
                    System.out.println(answer[0]);
                    System.out.println(answer[1]);
                    break;


                }}
//                if (i > j) {
//                    for (int k = 1; k <= i; k++) {
//
//                        if (i % k == 0 && (yellow - k) % 2 == 0) {
//
//
//                        }
//
//                    }
//                }

            }


        }

        return answer;
    }
}
