package 알고리즘.신규아이디추천;

// 규칙에 맞는 아이디를 추천해줘야 한다.
// 맞지 않는 아이디 입력시 입력된 아이디와 유사하고, 규칙맞게 추천해주기
// 3글자 이상,15자 이하 소문자,숫자,빼기(-),밑줄(_),마침표(.) 단 마침표 처음과 끝 안되고 연속으로 사용 x
// 1. 대문자에 대응되는 소문자 치환, 2. 규칙에 맞지 않는 문자는 모두 제거
// 3.마침표가 두번 이상은 하나의 마침표 4. 마침표가 처음과 끝이라면 없앰
// 5.빈문자열은 new_id에 "a" 대입, 6-1. 16이상이면 15까지하고 다 제거
// 6-2. 제거 후 마침표가 끝이면 제거, 7. 길이가 2 이하면 길이가 3 될때까 마지막 글자를 반복해서 붙이기

// 정규표현식 알고 쓰기 or 아닌 상태로 쓰기
public class SolutionNotRegex {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();
        String answer = "";
        // 2단계
        for (int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);
            if (Character.isAlphabetic(ch) ||
                    Character.isDigit(ch) ||
                    ch == '-' || ch == '_' || ch == '.')
                answer += ch;
        }
        // 3단계
        while (answer.indexOf("..") != -1) { // indexOf는 '..이 있으면 .만 반환 (while문은 언제까지 돌지 모를 때 씀)
            answer = answer.replace("..", ".");
            // 예시로"..." 3개가 들어오면 ..이 .으로 바껴서 ".."이 되고 또 ".."이 "."으로 바뀜
        }
        // 4단계
        if(!answer.isEmpty() && answer.charAt(0)== '.') // 빈 문자열이라면 에러나니까 에러처리
            answer = answer.substring(1);
        if(!answer.isEmpty() && answer.charAt(answer.length() -1) == '.')
            answer = answer.substring(0, answer.length() - 1);
        // 5단계
        if(answer.isEmpty())
            answer = "a";
        // 6단계
        if(answer.length() > 15) { // 15 이하면 에러나니까, 그리고 자른 후 .이면 없애줘야함
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length() - 1)== '.')
                answer = answer.substring(0, answer.length() - 1);
            }
        // 7단계
        while (answer.length() < 3)
            answer += answer.charAt(answer.length() - 1);

        return answer;
    }

    public static void main(String[] args) {
        SolutionNotRegex sol = new SolutionNotRegex();
        System.out.println(sol.solution("...!@BaT#*..y.abcdefghijklm"));

    }
}
