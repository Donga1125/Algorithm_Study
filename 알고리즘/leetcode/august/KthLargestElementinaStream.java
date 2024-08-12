package 알고리즘.leetcode.august;

public class KthLargestElementinaStream {

    //703. Kth Largest Element in a Stream

    // stream 안에 제일 큰 수 찾기 k
    // 정렬된 순서고, 같은 수 사이에 순서가 중요 (안정적인 정렬을 써라)

    public static void main(String[] args) {

        KthLargest sol = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(sol.add(3));
        System.out.println(sol.add(5));
        System.out.println(sol.add(10));
        System.out.println(sol.add(9));
        System.out.println(sol.add(4));




    }
}
