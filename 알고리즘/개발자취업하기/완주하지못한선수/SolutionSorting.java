package 알고리즘.개발자취업하기.완주하지못한선수;

import java.util.Arrays;

// 한 선수만 완주를 못했다. 그 선수를 찾 참여자들이 part, 완주자들이 comp
// 1명 이상 100,000명 이 comp의 길이가 part의 길이보다 1 작다.(1명만 완주 못함)
// 참가 이름은 1개 이 20개 이하의 소문자로 구성
// 참가자 중 동명이인이 존재 가 (즉 동명이인인 홍길동이 완주를 못하면 1번길동인지 2번길동인지 상관 x 길동 한명만 빠지면 됨)
 class SolutionSorting {
    public String solution(String[] participant, String[] completion) {
        // sorting & loop 방법
        // 1. 두 배열을 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. 두 배열이 다를 때 까지 찾는다.
        int i = 0;
        for (; i < completion.length; i++)
            if (!participant[i].equals(completion[i]))
               // return participant[i];
                break;

        // 3. 두 배열이 다를 때 까지 찾았는데 없다면 마지막 선수가 완주하지 못했다.
        return participant[i];




    }

    // 2개의 방법 sorting Loop 활용해서 풀기 or Hash 쓰기

    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        SolutionSorting sol = new SolutionSorting();
        System.out.println(sol.solution(part, comp));
    }

}
