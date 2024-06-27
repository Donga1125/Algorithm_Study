package 알고리즘.항해99.육주차;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReduceArraySizetoTheHalfUseMapmerge {

    //1338. Reduce Array Size to The Half

    //배열이 주어지면 배열 안에 있는 수 중 하나를 골라 그 수를 다 없앨 수 있다.
    //그럴 때 반이 상 줄일 수 있는 최소의 갯수를 반환

    //arr = [3,3,3,3,5,5,5,2,2,7]
    // set을 사용해서 하나씩 담는데, 조합되는 수 를 찾는ㄷ ㅏ?
    // map으로 찾고, 그 수를 돌면서 반 이상되면 바로 리턴 ? 3 =4 5=3 2=2 7=1
    // 키 값은 상관 없음 번호로 부여하고, 몇개인지가 중요

    public static void main(String[] args) {
        int arr[] = new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        int arr1[] = new int[]{1, 9};
        ReduceArraySizetoTheHalfUseMapmerge main = new ReduceArraySizetoTheHalfUseMapmerge();
        System.out.println(main.minSetSize(arr));
    }


    public int minSetSize(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();



        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            map.merge(arr[i], 1, Integer::sum);
            map.merge(arr[i], 1, (a, b) -> a + b);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry.getValue());
        }

        int sum = 0;
        int count = 0;
        int halfSize = arr.length / 2;
        System.out.println(maxHeap);


        while (sum < halfSize) {
            sum += maxHeap.poll();
            count++;
        }

        return count;

    }
}
