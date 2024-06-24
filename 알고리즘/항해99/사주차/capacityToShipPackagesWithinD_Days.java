package 알고리즘.항해99.사주차;

public class capacityToShipPackagesWithinD_Days {
    //다른 항구로 며칠 내 배송할 패키지
    // i번째는 weight[i]의 무게를 가짐 순서대로 , 최대무게초과 x
    // 주어진 day 안 모든 패키지 보내기 위해 필요한 배의 최소 무게를 반환

    // 주어진 day 안에 보내려면 하루에 몇개씩 묶어보내야 하나 ?
    // 하루에 몇개 씩 보낼 지 정했다면 최소한의 무게를 찾기 위해
    //순서대로 을 수 있네
    // 무게 범위를 탐색

    //이진 탐색으로 탐색한다고 하면 최악의 경우에 아무 것도 안 보내는 건 너무 말도 안되니까
    //들어온 배열의 크기를 데이만큼만 나누고 큰거 두개씩 ? 최악의 경우


    public static void main(String[] args) {
        int w[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int d = 5;
        capacityToShipPackagesWithinD_Days main = new capacityToShipPackagesWithinD_Days();
        System.out.println(main.shipWithinDays(w,d));

    }
    public int shipWithinDays(int[] weights, int days) {


//        Arrays.sort(weights);// 정렬을 하지 않고

        int capa = weights.length;


        int left = 0;
        int right = 0; // 최악의 경우를 그냥 첫날에 다 때려넣으면 다음날 아무것도 안 싣어도 되려나

        for (int weight : weights) {
            left = Math.max(left, weight);
            right = right + weight;

        }


//
//        for (int i = capa - 1; capa - 1 - i < max; i--) {
//
//            right = right + weights[i];
//        }

        while (left < right) {
            int mid = (left + right) / 2;

            int sum = 0; // 하루에 담을 수 있는 최대 합
            int day = 1; // 날짜

            //어디에 담아서 뺴쓰는 형식 ?

            for (int i = 0; i < capa; i++) {

                if (sum + weights[i] > mid) {
                    day++; // 더 커지면 다음 날로 넘김
                    sum = 0; // 다시 0으로 초기화

                    if (day > days)
                        left = mid + 1;
                    break;
//
                }
                sum = sum + weights[i]; //계속 sum에 더해줘서 다음 수를 담고 day를 유지

            }

            if (day > days) {

                left = mid + 1;
            } else {

                right = mid;
            }
        }

            // 들어온 mid의 날로 분배하는데, 순서대로 분배하는 규칙 ?
            // 넣는 갯수가 중요한 게 아니고 한번에 mid보다 작은 수만큼 넣기


        return right;

    }
}
