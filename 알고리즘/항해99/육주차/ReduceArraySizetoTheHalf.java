package 알고리즘.항해99.육주차;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Stream;

public class ReduceArraySizetoTheHalf {

    //1338. Reduce Array Size to The Half

    //배열이 주어지면 배열 안에 있는 수 중 하나를 골라 그 수를 다 없앨 수 있다.
    //그럴 때 반이 상 줄일 수 있는 최소의 갯수를 반환

    //arr = [3,3,3,3,5,5,5,2,2,7]
    // set을 사용해서 하나씩 담는데, 조합되는 수 를 찾는ㄷ ㅏ?
    // map으로 갯수를 반환 ? 3 =4 5=3 2=2 7=1
    // 키 값은 상관 없음 번호로 부여하고, 몇개인지가 중요

    public static void main(String[] args) {
        int arr[] = new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        ReduceArraySizetoTheHalf main = new ReduceArraySizetoTheHalf();
        System.out.println(main.minSetSize(arr));
    }


    public int minSetSize(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();



        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int size = map.size();
        Integer index[] = new Integer[size];
        int now = 0;

        for (Integer value : map.values()) {
            index[now++] = value;

        }
        Arrays.sort(index, new Comparator<Integer>() {


            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });


        int sum = 0;



        for (int i = 0; i < index.length; i++) {
            sum += index[i];



            if (sum >=arr.length/ 2) {
                return i +1;
            }


        }


        return -1;

    }
}
