package 알고리즘.개발자취업하기.기능개발;

// 기능개발중인 100%가 되어야 배포가능 들어온 순서에 맞춰서 개발이 완료 되는건아니고
// 뒤에 꺼가 먼저 개발될 수 있지만 배포는 앞에 것이 배포되는 순간 같이 나감
//먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와
// 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다
// 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

//작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
//작업 진도는 100 미만의 자연수입니다.
//작업 속도는 100 이하의 자연수입니다.
//배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다.
// 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionArrays {
    // queue의 문제였지만, 다른 방식으로 써서 해결한 것이다.
    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            // 1. 1개 기능을 개발하는데 필요한 날짜를 계산한다.
            double days = (100 - progresses[i] / (double) speeds[i]);
            // 100 - 30 / 30
            int dayUp = (int) Math.ceil(days); // days 실형 값을 올림해서 int로 캐스팅해서 dayUP에 담아줌 (걸리는 날짜가 담김)

            // 2. 함께 배포할 기능의 인덱스를 찾기.
            int j = i + 1;
            for (; j < progresses.length; j++) {
                //j번째의 기능이 dayUP만큼 날짜가 지났을 때 개발이 완료되어 같이 배포할 수 있는 지 없는 지 알아보는 것
                if (progresses[j] + dayUp * speeds[j] < 100)
                    break;
                // break 한 값이 함께 배포할 수 없는 첫번째 인덱스
            }


            // 3. 이번에 배포할 기능의 갯수를 추가한다.
            answer.add(j - i); //함께 배포할 수 없는 첫번째 인덱스에서 현재 기능의 위치를 빼주면 그 사이에 몇개를 배포할 수 있는 지 차이값을
                //담아줌
            i = j - 1; // i와 j사이에는 answer에 배포되었기때문에 그 다음 값은 i는 j번째에서 시작하길 원함 그리고 1++해주기에..

        }

//        int[] answerArray = new int[answer.size()]; // 방법 1.arrays를 int[]에 담아서 반환하기 위해
//        for (int i = 0; i < answer.size(); i++) {
//            answerArray[i] = answer.get(i);
//        }
//        return answerArray;
        return answer.stream().mapToInt(i -> i.intValue()).toArray();
        // answer라는 arrayList에 .stream() 으로 각각의 Integer객체를 꺼내오는 동작이고
        // .mapToInt(i -> i.intValue) 인티저객체 i를 인트형태로 바꿀 것이다. i.intValue 그럼 최종적으로 int의stream이 되는데
        // 반환은 array로 하고 싶으니 toArray

    }

    public static void main(String[] args) {
        SolutionArrays sol = new SolutionArrays();
        int[] progresses = {95, 90, 99, 99, 89, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(sol.solution(progresses, speeds)));

    }
}
