package 알고리즘.항해99.육주차;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SeatManager {

    // 1845. Seat Reservation Manager

    //3개의 메서드 SeatManager(int n)의 자리 초기화
    //  reserve 예약하면 작은 수부터 반환
    //  unreserve 들어온 자석 번호 취소 취소void

    //일반적으로 O(n0)으로 하니 마지막에 시간초과 걸림

    private static Deque<Integer> deque;


    private static ArrayList<Integer> arrSeat;
    int n;
    private int[] seat;


    public static void main(String[] args) {
        int n = 5;
        SeatManager main = new SeatManager(n);

    }


    public SeatManager(int n) {

        this.n = n;

        deque = new ArrayDeque<>();
        seat = new int[n + 1];
        arrSeat = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            deque.add(i);
            arrSeat.add(i);
        }

    }

    public int reserve() {

        for (int i = 1; i <= n; i++) {

            if (seat[i] == 0) {

                seat[i] = i;

                return i;

            }

        }

        return n;

    }

    public void unreserve(int seatNumber) {

        seat[seatNumber] = 0;

    }
}
