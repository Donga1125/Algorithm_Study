package 알고리즘.체육복;
//체육복을 도난 당했는데 여벌이 있는 학생들이 빌려줘야 한다.
//조건은 바로 앞번호나 뒷 번호만 빌려줄 수 있다. 이럴 때 체육 수업을 들을 수 있는 학생의 최대 값을 반환
// 전체학생은 2-30 이하, 도난 당한 학생 수 1명이하 n명이고 중복은 x, 여벌 가진 학생도 같고
// 여벌의 체육복있는 학생만 빌려줄 수 있다. 여벌의 체육복을 가져온 사람이 도난을 당했을 수 있고 그런 경우 1개만 도난되고 못빌려줌



public class SolutionSet {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        SolutionSet sol = new SolutionSet();
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(sol.solution(5, lost, reserve));
    }
}
