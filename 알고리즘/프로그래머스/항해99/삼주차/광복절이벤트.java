package 알고리즘.프로그래머스.항해99.삼주차;

public class 광복절이벤트 {
    //정수 배열 date1과 date2가 주어집니다.
    // 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다.
    // 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
    //만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.

    //date1의 길이 = date2의 길이 = 3
    //0 ≤ year ≤ 10,000
    //1 ≤ month ≤ 12
    //day는 month에 따라 가능한 날짜로 주어집니다.
    //앞이 더 빠르면 1 아닌 경우엔 다 0 return

    public int solution(int[] date1, int[] date2) {

        int answer;

        int date1Y = date1[0];
        int date2Y = date2[0];

        int date1M = date1[1];
        int date2M = date2[1];

        int date1D = date1[2];
        int date2D = date2[2];

        if (date1Y < date2Y) { // 1이 더 빠른 날

            return 1;

        } else if (date1Y > date2Y) {

            return 0;

        } else {

            if (date1M < date2M) {

                return 1;

            } else if (date1M > date2M) {

                return 0;

            } else {

                if (date1D < date2D) {

                    return 1;

                } else if (date1D > date2D) {

                    return 0;

                } else {

                    answer = 0;

                }
            }
        }

        return answer;
    }
}
