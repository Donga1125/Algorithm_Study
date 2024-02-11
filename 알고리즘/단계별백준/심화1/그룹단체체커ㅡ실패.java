package 알고리즘.단계별백준.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

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



//            for (int j = 0; j < str.length() - 1; j++) {
//
//                if (str.charAt(j) == str.charAt(j + 1)) {
//                    answer = answer + str.charAt(j);i++;
//                }
//
//            }

            Stack<Character> stack = new Stack<>();
            stack.push(str.charAt(0));//일단 0번쨰 넣어주고 그 영번쨰에서 다음부터 하나씩 넣어주는데 다음 수가 같지 않으면 넣어주기
            //즉 aaab면 0이랑 1,2까지 비교하고 같지 않은 3이 나오면 넣어줘서 ab로 만들어준다! 그럼 다음 peek은 2부터 꺼내게됨!

            // 내가 만들려고 했던 거랑 비슷하지만 난 포문으로 만들고 다시 set으로 하는 과정에서 막혔다 (for문에서 연속된 수만 넣어줄 수 밖에없었다ㅠ)
            for (int j = 1; j < str.length(); j++) {
                if (stack.peek() != str.charAt(j)) {
                    stack.push(str.charAt(j));
                }
            }
            for (int j = 0; j < stack.size(); j++) {
                answer += stack.get(j);
            }

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
