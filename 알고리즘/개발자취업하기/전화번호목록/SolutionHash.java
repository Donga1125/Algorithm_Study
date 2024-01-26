package 알고리즘.개발자취업하기.전화번호목록;

import java.util.HashMap;

// phone_book의 길이는 1이상 1,000,000 이하
// 각 전화번호의 길은 1~20 이하이다.
// 각 전화번호는 중복되서 저장되지 않는다.

// 하나라도 접두어인가 ? 이게 중점

public class SolutionHash {
    public boolean SolutionHash(String[] phone_book) {
        //1. hashMap을 만든다.
        HashMap<String, Integer> map = new HashMap<>();
        for (String phone : phone_book) {
            map.put(phone, 1);
        }
        //2. 모든 전화번호의 접두어가 HashMap에 있는 지 확인한다.
        for (int i = 0; i < phone_book.length; i++) { //"9674223"을 골랐다면 그걸로 확인하느데
            //j의 값은 1부터 시작해서 length까지만 돌아서 확인한다! ( 왜냐 다 돌아서 "9674223"을 찾게되면 그건 있으니까
            for (int j = 1; j < phone_book[i].length(); j++) { //
                // j는 예를 들어 "9674223" 의 수를 짤라서 "9"가 존재하는지? "96"이 존재하는 지 확인하는 과정
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        //3. 여기까지 돌았는데 없다 접두어가 없단 뜻이다.

        return true;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "9674223", "11295524421"};
        SolutionHash solutionHash = new SolutionHash();
        System.out.println(solutionHash.SolutionHash(phone_book));

    }
}
