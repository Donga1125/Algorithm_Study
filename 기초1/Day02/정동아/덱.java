package 기초1.Day02.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 덱 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> arr = new LinkedList<>();

        int t = Integer.parseInt(br.readLine());
        for (int i =0; i< t; i++){
            String[] input = br.readLine().split(" ");
            switch (input[0]){
                case "push_front":
                    arr.addFirst(Integer.valueOf(input[1]));
                    break;

                case "push_back":
                    arr.addLast(Integer.valueOf(input[1]));
                    break;

                case "pop_front":
                    if (!arr.isEmpty()){
                        sb.append(arr.pollFirst()).append('\n');
                    }else {
                        sb.append("-1").append('\n');
                    }
                    break;

                case "pop_back":
                    if (!arr.isEmpty()){
                        sb.append(arr.pollLast()).append('\n');
                    }else {
                        sb.append("-1").append('\n');
                    }
                    break;

                case "size":
                    sb.append(arr.size()).append('\n');
                    break;

                case "empty":
                    if (!arr.isEmpty()){
                        sb.append("0").append('\n');
                    }else {
                        sb.append("1").append('\n');
                    }
                    break;

                case "front":
                    if (!arr.isEmpty()){
                        sb.append(arr.peekFirst()).append('\n');
                    }else {
                        sb.append("-1").append('\n');
                    }
                    break;

                case "back":
                    if (!arr.isEmpty()){
                        sb.append(arr.peekLast()).append('\n');
                    }else {
                        sb.append("-1").append('\n');
                    }
                    break;
            }
        }
        br.close();
        System.out.println(sb);
    }

}
