package 알고리즘.전화번호목록;

import java.util.Arrays;
// phone_book의 길이는 1이상 1,000,000 이하
// 각 전화번호의 길은 1~20 이하이다.
// 각 전화번호는 중복되서 저장되지 않는다.

// 하나라도 접두어인가 ? 이게 중점

// Sorting 그냥 이중 루프를 돌면 timeOut이 난다 !
// 그래서 전화번호를 오름 차순으로  sorting을 해야함

public class SolutionSorting {
    public boolean SolutionHash(String[] phone_book) {

        boolean answer = true;
        Arrays.sort(phone_book);

        System.out.println("length = " + phone_book.length);
 // 2
        for (int i = 0; i < phone_book.length -1; i++)
            if (phone_book[i + 1].startsWith(phone_book[i])) {

                // i+1번째가 i로 시작을 하는가 ? 시작하면 접두어라는 의미
                return false;}
            

        //1. phone_book을 정렬한다.
        //2. 1중 루프 돌면서 앞번호 뒷번호 접두어인 지 확인한다.
        //3. 다 돌았는데도 나오지 않는다면, 접두어가 아닌 것이다 return False;

        return true;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "9674223", "11295524421"};
        SolutionSorting solutionHash = new SolutionSorting();
        System.out.println("phonebook = " + phone_book);
        System.out.println(solutionHash.SolutionHash(phone_book));

    }
}
