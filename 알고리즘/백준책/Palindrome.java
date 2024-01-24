package 알고리즘.백준책;

public class Palindrome {


    public boolean solution(String palindrome) {



        //if (palindrome.length() % 2 == 0) { // 이럴 필요가 없는게 자바에선 나누기하면 무조건 정수로만 나온다 (버림)
            int size = palindrome.length();
            for (int i = 0; i < (palindrome.length() / 2); i++) {
                if (palindrome.charAt(i) == palindrome.charAt(size - 1)) { //charAt은 인덱스를 기반
                    size = size - 1;
                } else
                    return false;

            }
            return true;


    }

    public static void main(String[] args) {
        Palindrome pal = new Palindrome();
        String palindrome = "madam";
        System.out.println(pal.solution(palindrome));


    }


}
