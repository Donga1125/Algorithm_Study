package 알고리즘.leetcode.february25;

public class ClearDigits {

    //3174. Clear Digits

    // 첫번째로 등장하는 숫자를 지우고, 그 숫자에서 가장 가까운 왼쪽에 있는 숫자가 아닌 것을 지움
    // 반복 후 남은 것을 리턴

    public static void main(String[] args) {

        String s = "cb34";
        ClearDigits main = new ClearDigits();

        System.out.println( main.clearDigits(s));
    }

    public String clearDigits(String s) {

        StringBuilder sb = new StringBuilder();
        // sb에 쌓아두는 형식

        for (char c : s.toCharArray()) {
            // 현재 c를 판별

            if (Character.isDigit(c)) {
                // 숫자면 정답에 담겨있는 sb의 길이를 확인해준 후
                int length = sb.length();
                while (length > 0 && Character.isDigit(sb.charAt(length - 1))) {

                    length--;
                }
                if (length > 0) {
                    sb.deleteCharAt(length - 1);
                } else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();}

}








