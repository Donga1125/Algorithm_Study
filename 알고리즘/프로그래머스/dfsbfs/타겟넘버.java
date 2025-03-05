package 알고리즘.프로그래머스.dfsbfs;

public class 타겟넘버 {


    public static void main(String[] args) {

        int numbers[] = new int[]{1, 1, 1, 1, 1};
        int target = 3;

        타겟넘버 main = new 타겟넘버();
        System.out.println(main.solution(numbers,target));



    }

    //num의 위치를 바꾸지 않고 -, +만 조합해서 target 넘버에 도달할 수 있는 수를 return

    public int solution(int[] numbers, int target) {
        int answer = 0;

        answer = dfs(answer, 0, numbers,target,0);

        return answer;

    }

    private int dfs(int answer, int depth,int nums[],int target, int total) {

        if(depth == nums.length){
            if (target == total) {
                return 1;

            }

            return 0; }


        int now = nums[depth];

       int plus = dfs(answer, depth + 1, nums, target, total + now);
       int minus =  dfs(answer, depth + 1, nums, target, total - now);



        return plus + minus;

    }
}
