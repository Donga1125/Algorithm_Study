package 기초1.Day04.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class 후위표기식2 {

    //switch문 활용?
    //배열로 숫자를 넣고
    //스택에는 인덱스만 저장

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Double> stack = new Stack<>();

        String str = br.readLine();

        double[] arr = new double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        double result = 0;

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                stack.push(arr[str.charAt(i) - 'A']);  // 핵심 코드
            } else {
                if (!stack.isEmpty()) {
                    double a = stack.pop();
                    double b = stack.pop();

                    switch (str.charAt(i)) {
                        case '+':
                            result = b + a;
                            stack.push(result);
                            continue;
                        case '-':
                            result = b - a;
                            stack.push(result);
                            continue;
                        case '*':
                            result = b * a;
                            stack.push(result);
                            continue;
                        case '/':
                            result = b/ a;
                            stack.push(result);
                            continue;
                    }
                }
            }
        }

        System.out.printf("%.2f", stack.pop());

        br.close();
    }
}
