package 알고리즘.단계별백준2.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 큐2 {

    // 큐 구현하는 문제
    public static StringBuilder sb = new StringBuilder();
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        Deque<Integer> q = new LinkedList<>();
        StringTokenizer st;


        for (int i = 0; i < t; i++) {

            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push" :
//                    que.enQue(Integer.parseInt(st.nextToken()));
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
//                    que.deQue();
                    Integer item = q.poll();
                    if (item == null) {
                        sb.append(-1).append('\n');
                    } else
                        sb.append(item).append('\n');
                    break;
                case "size":
//                    que.size();
                    sb.append(q.size()).append('\n');
                    break;
                case "empty":
//                    que.isEmpty();
                    if (q.isEmpty()) {
                        sb.append(1).append('\n');
                    } else
                        sb.append(0).append('\n');
                    break;
                case "front":
//                    que.front();

                    Integer ite = q.peek();
                    if (ite == null) {
                        sb.append(-1).append('\n');
                    } else
                        sb.append(ite).append('\n');
                    break;
                case "back":
                    Integer it = q.peekLast();
                    if (it == null) {
                        sb.append(-1).append('\n');
                    } else
                        sb.append(it).append('\n');
//                    que.back();
                    break;
            }



        }

        System.out.println(sb);

    }

//    public static class linkQueue {
//
//        private int[] que1;
//        private int capacity;
//        private int front;
//        private int rear;
//        private int num;
//
//        private LinkedList<Integer> q;
//
//        public linkQueue() {
//            num = front = rear = 0;
//            capacity = 2000000;
//            que1 = new int[capacity];
//            q = new LinkedList<>();
//
//
//        }
//
//        public void enQue(int x) {
////            que[rear++] = x;
//            q.add(x);
//            num++;
//
////            if (rear == capacity) { // 원형 유지하기 위해 다시 바꿈
////                rear = 0;
////            }
//        }
//
//        public void deQue() {
//            int x = que[front++];
//            num--;
//
//            if (front == capacity) { // 마찬가지로 배열초과하면 안되니까 원형으로
//                front = 0;
//            }
//
//            if (num == 0) {
//                sb.append(-1).append('\n');
//            }
//            else
//                sb.append(x).append('\n');
//        }
//
//        public void size() {
//            sb.append(num).append('\n');
//        }
//
//        public void isEmpty() {
//            if(num <= 0) {
//                sb.append(1).append('\n');
//            } else
//                sb.append(0).append('\n');
//        }
//
//        public void front() {
//            if (num <= 0) {
//                sb.append(-1).append('\n');
//            } else
//                sb.append(front).append('\n');
//        }
//
//        public void back() {
//            if (num <= 0) {
//                sb.append(-1).append('\n');
//            } else
//                sb.append(rear).append('\n');
//        }
//
//
//    }

}
