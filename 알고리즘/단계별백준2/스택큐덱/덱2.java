package 알고리즘.단계별백준2.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 덱2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());


            switch (st.nextToken()) {
                case "1" :
                    deque.addFirst(Integer.valueOf(st.nextToken()));
                    break;

                case "2" :
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case "3":
                    if(!deque.isEmpty()){
                        sb.append(deque.removeFirst()).append("\n");}
                    else
                        sb.append(-1).append('\n');

                    break;
                case "4":
                    if(!deque.isEmpty()){
                        sb.append(deque.removeLast()).append("\n");}
                    else
                        sb.append(-1).append('\n');

                    break;

                case "5":
                    sb.append(deque.size()).append("\n");
                    break;
                case "6":
                    if (deque.isEmpty()) {
                        sb.append(1).append('\n');
                    } else
                        sb.append(0).append('\n');
                    break;
                case "7":
                    if(!deque.isEmpty()){
                        sb.append(deque.peekFirst()).append("\n");}

                    else
                        sb.append(-1).append('\n');
                    break;
                case "8":
                    if(!deque.isEmpty()){
                        sb.append(deque.peekLast()).append("\n");}

                    else
                        sb.append(-1).append('\n');
                    break;
            }



            }

        System.out.println(sb);


        }

    }

