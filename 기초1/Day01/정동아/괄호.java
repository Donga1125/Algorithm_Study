package 기초1.Day01.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 괄호 {
    //처음 입력받은 int만큼 테스트케이스가 주어짐
    //각 줄에 입력된 괄호가 올바른지 판단해서 각 줄에 yes Or NO를 반환
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i =0; i<t; i++){
            String words = br.readLine();
            int length = words.length();
            int num1 = 0;
            int num2 = 0;

            for (int j = 0; j <length; j++){
                char ch = words.charAt(j);
                if (ch == '('){
                    num1++;
                }else if(ch == ')') {
                    num1--;
                    if (num1 < 0){
                        break;
                    }
                }
            }

            if (num1 == 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        br.close();
    }
}
