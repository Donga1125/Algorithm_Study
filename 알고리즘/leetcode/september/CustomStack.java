package 알고리즘.leetcode.september;

import java.util.Stack;

public class CustomStack {

    int maxSize;
    Stack<Integer> stack;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;

        this.stack = new Stack<Integer>();


    }

    public void push(int x) {

        if (stack.size() < maxSize) {
            stack.push(x);

        }

        // 사이즈 만큼 넣기

    }

    public int pop() {
        // 뽑을 게 없다면 -1 리턴
        if (stack.size() == 0) {
            return -1;
        }
       return stack.pop();

    }

    public void increment(int k, int val) {

        // 현재 stack의 요소가 k보다 작으면 다val 증가시키고
        // 아니라면 bottom부터 k개까지 val 증가

    }
}
