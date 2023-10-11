package 기초1.Day02.정해영;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요새푸스문제 {

    /*
    1~N 명의 사람이 원으로 앉음
    K가 주어진다. K번쨰 사람을 순서대로 제거한다.

    한사람이 제거되면 남은사람으로 N명이 모두 제거될때까지 계속한다.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        //Queue 선언
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++){
            queue.offer(i);
        }

        int count = 0;
        String result = "<";

        //queue가 빌때 까지
        while (!queue.isEmpty()){
            count++;
            //카운트가 주어진 K의 수와 같을 경우 결과값에 추가하고 카운트를 초기화
            if(count == K){
                result += queue.poll() + ", ";
                count = 0;
            }else { //count != K 인경우에는 poll한 값을 다시 queue에 추가한다.
                queue.offer(queue.poll());
            }
        }

        result = result.substring(0, result.length()-2);
        result += ">";


        System.out.println(result);
    }
}
