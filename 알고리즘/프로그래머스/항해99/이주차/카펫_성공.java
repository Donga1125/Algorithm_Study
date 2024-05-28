package 알고리즘.프로그래머스.항해99.이주차;

public class 카펫_성공 {

    //중앙에 노란색으로 색칠되어 있고 겉엔 갈색으로 감싼 구조의 카펫이 있다.
    //카펫의 크기를 기억하지 못하고 노랑타일의 수, 갈색 타일의 수만 알 때 가로와 세로를 반환해라

    //갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
    //노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
    //카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.

    // 가로가 더 기니까 약수들을 찾고 o1(가로)의 약수가 더 커지거나 같아질 때(제곱근까지만 구해도 되긴 하겠다)



    public static void main(String[] args) {

        카펫_성공 main = new 카펫_성공();

        int arr[] = main.solution(18, 6);
        for (int i : arr) {
            System.out.println(i);
        }



    }

    private int[] solution(int brown, int yellow) {
        int[] answer = new int[2];


        int size = brown + yellow;

        for (int row = 3; row < size; row++) {


            if (size % row == 0) { // 제곱근까지 할 지  ? 그냥 size는 안들어오게 하면 될듯

                int column = size / row;

                if (row == column) { //row와 column이 같다는 건 정 사각 안에 정사각이라 됨

                    answer[0] = row;
                    answer[1] = column;

                    return answer;
                }

                if (row > column && column >= 3 ) {



                    int middle = (column - 2) * (row - 2);

                    if (middle == yellow) {
                        answer[0] = row;
                        answer[1] = column;

                        return answer;
                    }
                }
            }
        }

        return answer;

    }
}
