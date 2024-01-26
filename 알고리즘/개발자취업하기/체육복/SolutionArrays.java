package 알고리즘.개발자취업하기.체육복;

//체육복을 도난 당했는데 여벌이 있는 학생들이 빌려줘야 한다.
//조건은 바로 앞번호나 뒷 번호만 빌려줄 수 있다. 이럴 때 체육 수업을 들을 수 있는 학생의 최대 값을 반환
// 전체학생은 2-30 이하, 도난 당한 학생 수 1명이하 n명이고 중복은 x, 여벌 가진 학생도 같고
// 여벌의 체육복있는 학생만 빌려줄 수 있다. 여벌의 체육복을 가져온 사람이 도난을 당했을 수 있고 그런 경우 1개만 도난되고 못빌려줌


public class SolutionArrays {// 여벌의 체육복을 최대한 빌려준 후 체육복을 가진 학생 수 구하기(여벌의 학생을 기준)

    // lost, reserve 배열 두개를 하나에 배열로 만들어줘서 체육복을 가진 애를 세서 반환
    // 5명이지만 7개로 하는 이유는 0,6 인덱스 값을 확인할 때 5개의 배열로 하면 지저분해져서 코드 흐름에 상관없게 7개로 선언

    public int solution(int n, int[] lost, int[] reserve) {

        int answer = 0;

        // 1. student 배열을 생성한다.
        int[] student = new int[n + 2]; // 2명 더 선언해주기
        // 2. reserve / lost 정보 반영
        for (int i : lost) {
            student[i]--;
        }
        for (int i : reserve) {
            student[i]++;
        }
        // 3. 여분을 기준으로 앞 뒤를 확인하여 빌려준다.
        for (int i = 1; i <= n; i++) {
            if (student[i] == 1) {
                if (student[i - 1] == -1) {
                    student[i]--;
                    student[i - 1]++;
                } else if (student[i + 1] == -1) {
                    student[i]--;
                    student[i + 1]++;
                }
            }

        }
        // 4. 체육복을 가진 학생의 수를 계산한다.
        for (int i = 1; i <= n; i++) {
            if (student[i] >= 0) {
                answer++;
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        SolutionArrays sol = new SolutionArrays();
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(sol.solution(5, lost, reserve));
    }
}
