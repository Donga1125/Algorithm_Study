package 기초1.Day03.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();

        String[] sl = s.split("");
        Stack<String> st = new Stack<>(); //스택을 선언

        int count = 0;
        for (int i = 0; i < sl.length; i++) {
            if(sl[i].equals("(")) {
                st.push(sl[i]);
            }
            else if (sl[i].equals(")")) {
                if (sl[i-1].equals("(")) {
                    st.pop(); //()일때니까 하나를 빼준다.
                    count+=st.size(); //스택의 크기를 카운트에 넣어준다.
                } else {
                    st.pop();
                    count++;
                }
            }
        }
        System.out.print(count);
    }

}
