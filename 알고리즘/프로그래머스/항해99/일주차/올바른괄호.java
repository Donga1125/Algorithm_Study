package 알고리즘.프로그래머스.항해99.일주차;

public class 올바른괄호 {
    // 올바른 괄호를 만드는 건데 (로 시작했음 )로 닫혀야 한다
    // true or false로 반환 100,000

    // )로 닫혀야 하고 짝이 맞아야 한다 (로 들어와야 하고 큐 ? 스택 ?
    // 시작은 무조건 (, 끝은 ), 짝수

    public static void main(String[] args) {

        올바른괄호 main = new 올바른괄호();

        boolean answer = main.solution("(())()");

        System.out.println(answer);


    }

    private boolean solution(String s) {
        boolean answer = true;

        System.out.println(s.length());



        if (s.length() % 2 != 0 || s.charAt(0) != '(' || s.charAt(s.length() - 1) != ')') {
            return false; // 기본 조건 짝수가 아니거나 (로 시작하지 않거나, )로 끝나지 않거나 바로 false
        }


        return answer;
    }


}
