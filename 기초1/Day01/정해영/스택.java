package 기초1.Day01.정해영;

import java.util.Scanner;

public class 스택 {

    public static int[] stack;
    public static int counter = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        stack = new int[N];

        for(int i = 0; i<N; i++){
            String command = sc.next();

            switch (command){

                case "push" :
                    push(sc.nextInt());
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    static void push(int num){
        stack[counter] = num;
        counter++;
    }

    static int pop(){
        if(counter <= 0){
            return -1;
        }
        else {
            int x = stack[counter-1];
            stack[counter-1] = 0;
            counter --;
            return x;
        }
    }

    static int size(){
        return counter;
    }

    static int empty(){
        if(counter > 0) return 0;
        return 1;
    }

    static int top(){
        if(counter == 0) return -1;

        return stack[counter-1];
    }



}
