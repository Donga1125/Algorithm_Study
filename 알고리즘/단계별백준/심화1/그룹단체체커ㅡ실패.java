package 알고리즘.단계별백준.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 그룹단체체커ㅡ실패 {
    // 한 알파벳이 들어오면 연속적으로만 들어오고 떨어지지만 않으면


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        String answer = "";




        int n = Integer.parseInt(br.readLine());



        for (int i = 0; i < n; i++) {
            answer ="";
            String str = br.readLine();



            for (int j = 0; j < str.length() - 1; j++) {
                // 망한 원인 같을 경우에는 answer을 새로 만들어줌 폐기하자

                if (str.charAt(j) == str.charAt(j + 1)) {
                answer = answer + str.charAt(j);
                }
            }
            answer = answer + str.charAt(str.length() - 1);
            System.out.println(answer);

            Set<Character> set = new HashSet<>();

            for (int k = 0; k < answer.length(); k++) {
                    set.add(answer.charAt(k));}

                if (set.size() == answer.length()) {
                    count++;
            }
        }

        System.out.println(count);
    }
}
