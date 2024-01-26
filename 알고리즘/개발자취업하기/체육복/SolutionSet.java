package 알고리즘.개발자취업하기.체육복;

import java.util.HashSet;
//체육복을 도난 당했는데 여벌이 있는 학생들이 빌려줘야 한다.
//조건은 바로 앞번호나 뒷 번호만 빌려줄 수 있다. 이럴 때 체육 수업을 들을 수 있는 학생의 최대 값을 반환
// 전체학생은 2-30 이하, 도난 당한 학생 수 1명이하 n명이고 중복은 x, 여벌 가진 학생도 같고
// 여벌의 체육복있는 학생만 빌려줄 수 있다. 여벌의 체육복을 가져온 사람이 도난을 당했을 수 있고 그런 경우 1개만 도난되고 못빌려줌



public class SolutionSet {// 여벌의 체육복을 최대한 빌려준 후 체육복을 가진 학생 수 구하기(여벌의 학생을 기준)

    public int solution(int n, int[] lost, int[] reserve) {
        // 1. set을 만든다.
        HashSet<Integer> reserveSet = new HashSet<>();
        HashSet<Integer> lostSet = new HashSet<>();

        for (int i : reserve) {
            reserveSet.add(i);
        }
        for (int i : lost) { // 주의점이 여분 있는 학생이 도둑을 맞았을 경우
            if (reserveSet.contains(i)) {
                reserveSet.remove(i); // 여분이 있는 애가 도둑의 경우 여분도 없고, 빌려줄 수도 없다.
            } else
                lostSet.add(i);
        }

        // 2. 여분을 기준으로 앞 뒤를 확인하여 체육복을 빌려준다.
        for (int i : reserveSet) { // 남은 셋을 비교해서
            if (lostSet.contains(i-1))
                lostSet.remove(i - 1);
            else if (lostSet.contains(i + 1)) {
                lostSet.remove(i + 1);
            }
        }
        // 3. 전체 학생 수에 lostSet에 남아있는 학생 수를 빼준다.
        int answer = 0;
        return n - lostSet.size();
    }

    public static void main(String[] args) {
        SolutionSet sol = new SolutionSet();
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(sol.solution(5, lost, reserve));
    }
}
