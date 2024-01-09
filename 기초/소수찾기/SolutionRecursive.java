package 기초.소수찾기;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

// 숫자를 조합해서 소수를 만들기
// 한자리 숫자씩  여러개가 들어올텐데, 숫자를 만들고 그 중 소수는 몇개인가 ? (prime number)
// numbers의 길이는 1이상 7이고, 0~9이며 "013"은 0과 1과 3이 들어온 경우
public class SolutionRecursive {
    HashSet<Integer> numberSet = new HashSet<>();
    // 문제 단순히 하면 모든 숫자를 만들고 소수를 세어서 반환하자!

    // hash Set을 사용하자 이유는 set이 중복되는 숫자를 두번 세지 않게 자동화 가능 (중복 제거 가능)
    // ex) 117이면  17이 두개가 될 수 있어 하나 더 카운트 될 수 있음

    // 에라토스테네스의 체로  특정 숫자의 제곱근까지 약수의 여부를 검증함 즉 그 숫자의 루트를 씌운 값까지만 확인


    public boolean isPrime(int num) { //num이 소수인 지 판별
        //2-1 0,1은 소수가 아니다.
        if (num == 0 || num == 1)
            return false;

        //2-2 에라토스테네스의 체에 limit을 계산한다. (루트까지만 계산의 범위를 갖기 위해)
        int limit = (int) Math.sqrt(num); // 17, 7, 71


        //2-3 에라토스테네스의 체에 따라 limit까지 배수의 여부를 확인한다.(limit 71이라면 그 루트 까지만 돌게 한다는 뜻)
        for (int i = 2; i <= limit ; i++) {
            if (num % i == 0) { // 즉 17이라면 4까지만 나눠보면 된다. 2,3,4을 다 나눴을 때 하나라도 나머지가 0이면 소수 x
                return false;
            }
        }
        return true;
    }

    public void recursive(String comb, String others) {
        // comb는 이때까지 조합된 숫자, others는 이때까지 쓰지 않은 숫자

        //1-1 현재 조합을 set에 추가한다. (comb가 만들어져서 들어올텐데 이 comb를 set에 추가
        if(!comb.equals("")) {// 예외처리 처음 들어오는 건 빈거니까 추가 x
        numberSet.add(Integer.valueOf(comb));} // 현재까지 만들어진 comb를 numberSet에 더하기(중복은 안됨)

        //1-2 Others 남은 숫자를 하나 더 더해 새로운 조합을 만든다. 즉 Others에서 하나씩 뽑아서 다음 recursive에 던지기
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0,i)+ others.substring(i + 1));
            // comb에는 others의 i번째 수를 추가해서 넘겨주고 others는 그 수를 빼줘야 하니까

        }

    }
    public int solution(String numbers) {
        int count = 0;

        // 1. 모든 조합 숫자를 만든다.
        recursive("", numbers); //처음엔 조합된 숫자는 없고, others는 전달받은 숫자 전체
        //이까지 모두 숫자의 조합만 나온다 즉 17이면 1,7,17,71
        System.out.println(numberSet);

        // 2. 소수의 갯수만 센다.
        Iterator<Integer> it = numberSet.iterator(); // 넘버셋이 이터레이터(반복자)의 인터페이스를 쓰는 것
        //numberSet을 하나 하나 다 꺼내서 어떤 동작을 하고 싶을 때 hasNext, next, remove 등의 기능
        // for문 써도 되지만, 이터레이터라는 동일한 인터페이스를 쓰면 HashSet이나 List나 ArrayList 등 자료구조과 관계없이 공통된 코드 가능
        while (it.hasNext()){
            int number = it.next();
            if (isPrime(number))
                count++;
        }
        // 3. 소수의 갯수를 반환한다.
        return count;



    }

    public static void main(String[] args) {
        SolutionRecursive sol = new SolutionRecursive();
        System.out.println(sol.solution("17"));
    }
}
