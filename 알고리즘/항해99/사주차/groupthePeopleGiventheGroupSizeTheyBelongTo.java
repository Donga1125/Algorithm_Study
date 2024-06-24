package 알고리즘.항해99.사주차;

import java.util.*;

public class groupthePeopleGiventheGroupSizeTheyBelongTo {

    //문제 이해가 어려웠다
    // 배열이 주어지면, 같은 배열의 크기만큼 넣어서 그 숫자에 묶음 대한 index를 반환

    //일단 수가 들어오면 처음 들어오거나,or full이거나 확인하고 새로 만들어야 할듯 ?


    public static void main(String[] args) {

        int[] arr = new int[] {3, 3, 3, 3, 3, 1, 3};
        groupthePeopleGiventheGroupSizeTheyBelongTo main = new groupthePeopleGiventheGroupSizeTheyBelongTo();
        System.out.println(main.groupThePeople(arr));

    }





    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> answer = new ArrayList<>();


        HashMap<Integer, List<Integer>> map = new HashMap<>();

        //그 인덱스 만큼 찾는 게 어려워서 걍 정렬 ?
//        Arrays.sort(groupSizes);


        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if (!map.containsKey(size)) { // 없을 경우
                map.put(size, new ArrayList<>());

            }

            map.get(size).add(i); // map에서 list를 가져오고 그 list에 add



            if (map.get(size).size() == size) {
                answer.add(new ArrayList<>(map.get(size)));
                map.get(size).clear();

            }

        }


//        for (int i = 0; i < groupSizes.length; i++) {
//            if (answer.get(i).isEmpty() || answer.get(i).size() == groupSizes[i]) {
//                // 없거나 다 찾거나
//                answer.add(new ArrayList<>(groupSizes[i]));
//
//            } if (answer.get(i).size() > groupSizes[i]) {
//                answer.get(i).add(i);
//            }
//
//            answer.get(i).contains()
//        }
        return answer;

    }
}
