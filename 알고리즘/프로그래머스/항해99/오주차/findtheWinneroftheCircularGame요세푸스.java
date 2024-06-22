package 알고리즘.프로그래머스.항해99.오주차;

import java.util.Deque;
import java.util.LinkedList;

public class findtheWinneroftheCircularGame요세푸스 {

    //1823. Find the Winner of the Circular Game

    // n명이 게임을 하는데, 1부터 n명까지 시계방향으로 돌아가고
    // k가 주어지면 1번부터 시작해k번 떨어진 수의 사람을 돌며 탈락시킴
    // 원형이라 반복하며 마지막에 남은 친구가 승리하고 그 친구 반환
    // deque로 구현하면 쉬울 것 같다

    // 1,2,3,4,5 k =2  [1,3,4,5] -2, [1,3,5] -4, [3,5] -3 [5] winner 5

    //k,n <=500

    public static void main(String[] args) {
        int n = 5;
        int k = 2;

        findtheWinneroftheCircularGame요세푸스 main = new findtheWinneroftheCircularGame요세푸스();
        System.out.println(main.findTheWinner(n, k));

    }



    public int findTheWinner(int n, int k) {

        int winner = 0; // 0번 인덱스를 기준으로 마지막 남는 친구 계산

        // 친구의 수가 1에서 n까지 증가할 때마다 마지막 남는 친구 계산
        for (int i = 1; i <= n; i++) {
            winner = (winner + k) % i;
        }

        return winner + 1; // 0번 인덱스를 1번 인덱스로 변환
    }



}
