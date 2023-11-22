package 기초1.Day10.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 진법변환2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");

        long n = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);

        Stack<Long> stack = new Stack<>();

        while (n != 0){
            stack.add(n%b);
            n /= b;
        }
        while (!stack.isEmpty()){
            if(stack.peek() >= 10){
                System.out.printf("%c", Integer.parseInt(String.valueOf(stack.pop())) + 55);
            }else {
                System.out.print(stack.pop());
            }
        }

        br.close();
    }
}
