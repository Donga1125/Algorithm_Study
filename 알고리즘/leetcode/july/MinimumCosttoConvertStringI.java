package 알고리즘.leetcode.july;

public class MinimumCosttoConvertStringI {

    // 2976. Minimum Cost to Convert String I

    //불가능하면 -1
    // source를  target으로 바꾸고 싶은데
    // 각 char마다 바꿀 수 있는 표가 있고 비용이 있다.
    // 최소 비용으로 바꾸고 최소 비용의 합을 반환하거나 안된다면 -1 반환
    //source = "abcd", target = "acbe", original = ["a","b","c","c","e","d"],
    // changed = ["b","c","b","e","b","e"], cost = [2,5,5,1,2,20]

    public static void main(String[] args) {

        String s = "abcd";
        String t = "acbe";
        char[] ori = new char[] {'a', 'b', 'c', 'c', 'e', 'd'};
        char[] change = new char[]{'b', 'c', 'b', 'e', 'b', 'e'};
        int[] cost = new int[]{2, 5, 5, 1, 2, 20};




    }


    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        // 소스를 타겟으로 바꿀려면
        // 바꿀려는 ori에서 있는지 찾고, change로 바꾸는데 먼저 고려해야할 게 저장될 값이
        // a->b로 가기 위해 바로 가는 게 싼가 아니면 돌아서 가는 게 싼가? 를 고려 해야함 이건
        // 매 선택에 따라 최소 값을 정할 수 있어서 dp 배열로 관리할 수 있을 거 같다
        // 그리고 dp 저장 전 change를 좀 더 빠르게 불러올 수 있는 정보를 저장하는게 좋을듯 ? map이라던지..

    }
}
