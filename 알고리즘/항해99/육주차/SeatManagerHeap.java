package 알고리즘.항해99.육주차;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.PriorityQueue;

public class SeatManagerHeap {

    // 1845. Seat Reservation Manager

    //3개의 메서드 SeatManager(int n)의 자리 초기화
    //  reserve 예약하면 작은 수부터 반환
    //  unreserve 들어온 자석 번호 취소 취소void

    //일반적으로 O(n0)으로 하니 마지막에 시간초과 걸림


    int n;

    PriorityQueue<Integer> minHeap;


    public static void main(String[] args) {
        int n = 5;
        SeatManagerHeap main = new SeatManagerHeap(n);
        main.reserve();


    }


    public SeatManagerHeap(int n) {

        this.n = n;


        minHeap = new PriorityQueue<>();

        for (int i = 1; i <= n; i++) {
            minHeap.add(i);

        }


    }

    public int reserve() {

        int q  =minHeap.remove();


        return q;

    }

    public void unReserve(int seatNumber) {

        minHeap.add(seatNumber);

    }
}
