package 기초1.Day02.정해영;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 큐 {

    static Queue<Integer> queue = new LinkedList<>();


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int last = 0;

        for(int i=0; i<N; i++){

            switch (sc.next()){
                case "push":
                    int num = sc.nextInt();
                    last = num;
                    push(num);
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back(last)).append("\n");
                    break;
            }
        }
        System.out.println(sb);
        sc.close();
    }

    private static int back(int last) {
        if(queue.isEmpty()) return -1;
        return last;
    }

    private static int front() {
        if(queue.isEmpty()) return -1;
        return queue.peek();
    }

    private static int empty() {
        if (queue.isEmpty()) return 1;
        else return 0;
    }

    private static int size() {
        return queue.size();
    }

    private static int pop() {
        if(queue.isEmpty()) return -1;
        return queue.poll();
    }

    private static void push(int num) {
        queue.add(num);
    }
}
