package 기초1.Day02.정해영;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 덱 {

    static Deque<Integer> deque = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        int N = sc.nextInt(); //명령어의 수

        for(int i=0; i<N; i++){

            switch (sc.next()){
                case "push_front":
                    int X = sc.nextInt();
                    push_front(X);
                    break;

                case "push_back":
                    int Y = sc.nextInt();
                    push_back(Y);
                    break;

                case "pop_front":
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back()).append("\n");
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
                    sb.append(back()).append("\n");
                    break;
            }
        }
        sc.close();
        System.out.println(sb);
    }

    private static int empty(){
        if(deque.isEmpty()) return 1;
        return 0;
    }

    private static int size(){
        return deque.size();
    }

    private static int pop_back() {
        if(deque.isEmpty()) return -1;
        return deque.removeLast();
    }

    private static int pop_front() {
        if(deque.isEmpty()) return -1;
        return deque.removeFirst();
        deque.stream().forEach(System.out::println);
    }

    private static void push_front(int X) {
        deque.addFirst(X);
    }

    private static void push_back(int Y) {
        deque.addLast(Y);
    }

    private static int front(){
        if(deque.isEmpty()) return -1;
        return deque.getFirst();
    }

    private static int back(){
        if(deque.isEmpty()) return -1;
        return deque.getLast();
    }

}
