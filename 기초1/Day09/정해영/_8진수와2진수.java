package 기초1.Day09.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _8진수와2진수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for(int i=0; i<str.length(); i++){
            //str을 잘라준다.
            int num = str.charAt(i) - '0';
            String numStr = binaryNumber(num);

            if(numStr.length() == 3){ //binary로 변환한 값이 3자리인경우
                sb.append(numStr);
            } else if (numStr.length() == 2) { //binary로 변환한 값이 2자리인경우, 앞에 0추가
                sb.append("0").append(numStr);
            }else if(numStr.length() == 1){ //binary로 변환한 값이 1자리인경우, 앞에 00추가
                sb.append("00").append(numStr);
            }
        }

        if(str.equals("0")){ //str이 0인경우 StringIndexOutOfBounds 에러 발생하여 0입력시 0출력
            System.out.println(0);
            return;
        }

        while (sb.charAt(0) == '0'){ //sb의 첫번째값이 0인경우 1이 나올때까지 제거
            sb.deleteCharAt(0);
        }

        System.out.println(sb);
    }

    public static String binaryNumber(int n){ //2진수로 변환하는 코드

        if(n == 0) return "000"; //0이 입력되는경우에 000을 반환

        Stack<Integer> stack = new Stack<>();
        String str = "";
        while (n > 0){
            stack.add(n%2);
            n /= 2;
        }

        while (!stack.isEmpty()){
            str += stack.pop();
        }

        return str;
    }
}
