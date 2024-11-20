package 알고리즘.leetcode.November;

public class DefusetheBomb {

    //1652. Defuse the Bomb
    //원형의 배열로 이루어짐

    // 주어진 k에 따라 숫자를 재배열해서 배열로 반환
    //k > 0 크면 다음 숫자부터,차례대로 k개의 숫자들을 더해서 현재 i 번째 수로 저장
    //k < 0 작으면 전숫자부터 차례대로 k개의 숫자들을 더해서 현재 i 수로 저장
    //k = 0 이면 0으로 다 바꾸고 반환

    // 링버퍼로 구현하면 좋을듯 모듈러로 앞뒤를 정해주자
    // 3가지 경우 먼저 0이 들어오면 바로 빈 배열 리턴해주기

    public static void main(String[] args) {


        int code[] = new int[]{5, 7, 1, 4};
        int k = 3;
        DefusetheBomb sol = new DefusetheBomb();
        System.out.println(sol.decrypt(code, k));
    }



    public int[] decrypt(int[] code, int k) {

        int length = code.length;

        int[] answer = new int[length];


        if (k == 0) {
            return answer;
        }

        if (k > 0) {

            for (int i = 0; i < length; i++) {

            }

        } else {
            k = Math.abs(k);


        return answer;



    }
}
