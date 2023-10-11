package 기초1.Day02.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class 조세퍼스문제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        String[] input = br.readLine().split(" ");

        //n만큼 queue1에 넣어줌
        for (int i =1; i<=Integer.valueOf(input[0]); i++){
            queue1.add(i);
        }

        while (queue1.size() !=1){
            //K번째 사람을 반복해서 제거
            for (int j = 1; j<Integer.valueOf(input[1]);  j++) {
                queue1.add(queue1.poll());
            }
            sb.append(queue1.poll()).append(", ");
        }

        sb.append(queue1.poll());
        System.out.println(sb.append(">"));

    }
}
