package 알고리즘.항해99.육주차;



import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class RemovingStarsFromAString {

    // 2390. Removing Stars From a String
    // String이 주어지면 그 안에 있는 *가 들어온 만큼 왼쪽 char를 지우기
    // 순서가 중요하다 * 나오면 바로 왼쪽 꺼 지워주기
    // 전부 다 유효하다.

    // Input: s = "leet**cod*e"
    //Output: "lecoe"

    //왼쪽이니까 stack에 넣으면서 *이 나오면 다음 인덱스로 가면 될 듯

    // 100000이 들어오고,

    public static void main(String[] args) {
        String s = "abb*cdfg*****x*";

        RemovingStarsFromAString main = new RemovingStarsFromAString();
        main.removeStars(s);
    }



    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        Deque<Character> deque = new LinkedList<>();

        StringBuilder sb = new StringBuilder();


        int length = s.length();

        for (int i = 0; i < length; i++) {
            stack.push(s.charAt(i));
        }



        while (!stack.isEmpty()) { // isEmpty ?

            int star = 0;

            if(stack.peek() == '*') {


            while (stack.peek() == '*') {
                char n = stack.pop();
                System.out.println("*이여서 빠지는  = " + n);
                star++;

                }
            for (int i = 0; i < star; i++) {
                stack.pop();

            }}

            else deque.addFirst(stack.pop());




        }

        while (!deque.isEmpty()) {
            sb.append(deque.pollFirst());
        }




        return sb.toString();

    }
}
