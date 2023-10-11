package 기초1.Day02.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class 큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        int t = Integer.parseInt(br.readLine());
        for (int i =0; i< t; i++){
            String [] input = br.readLine().split(" ");
            switch (input[0]){
                case "push":
                    queue.add(Integer.valueOf(input[1]));
                    break;

                case "pop":
                    if (!queue.isEmpty()){
                        sb.append(queue.poll()).append('\n');

                    }else {
                        sb.append("-1").append('\n');
                    }
                    break;

                case "size":
                    sb.append(queue.size()).append('\n');
                    break;

                case "empty":
                    if (!queue.isEmpty()){
                        sb.append("0").append('\n');
                    }else {
                        sb.append("1").append('\n');
                    }
                    break;

                case "front":
                    if (!queue.isEmpty()){
                        sb.append(queue.peek()).append('\n');
                    }else {
                        sb.append("-1").append('\n');
                    }
                    break;

                case "back":
                    if (!queue.isEmpty()){
                        sb.append(((LinkedList<Integer>) queue).getLast()).append('\n');
                    }else {
                        sb.append("-1").append('\n');
                    }
                    break;

            }
        }

        System.out.println(sb);
    }
}
