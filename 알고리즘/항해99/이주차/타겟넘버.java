package 알고리즘.항해99.이주차;

public class 타겟넘버 {


    // n개의 정수로 순서대로 들어온 수가 있고, 그 순서를 바꾸지 않고 +,- 둘중 하나를 써서 타겟 넘버를 만들어라
    // 들어온 수대로 dfs로 depth를 파고 계속 들어가면 될듯 ?

    // 어떻게 완성된 지 판뱔할까 ? depth가 5까지 가면 ?

    //주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
    // 2의 20승 ? 1048576
    //각 숫자는 1 이상 50 이하인 자연수입니다.
    //타겟 넘버는 1 이상 1000 이하인 자연수입니다.

    private static int count;


    private int numbers[];
    private int target;

    public static void main(String[] args) {

        int [] numbers = new int[]{1, 1, 1, 1, 1};
        int target = 5;




        타겟넘버 main = new 타겟넘버();
        System.out.println(main.solution(numbers, target));


    }


    private int solution(int[] numbers, int target) {

        this.numbers = numbers;
        this.target = target;
        count = 0;

        dfs(0, 0);
        return count;

    }

    private void dfs(int depth, int sum) {

        if (depth == numbers.length) { // 기저조건
            // 들어온 배열의 크기까지 가기만 하면 return 해주는데,
            // 카운트를 추가해주는 조건은 더해진 수가 target넘버가 되면 count
            if (sum == target) {
                count++;
            }
            return;

        }

        dfs(depth + 1, sum + numbers[depth]);
        dfs(depth + 1, sum - numbers[depth]);

    }
}
