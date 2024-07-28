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

    }
}
