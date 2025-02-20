package 알고리즘.leetcode.february25;

import 알고리즘.leetcode.january25.FindEventualSafeStates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindUniqueBinaryString {

    static int size;



    //주어진 num의 길이만큼의 바이너리 수 중 포함되지 않은 아무 바이너리 를 반환

    public static void main(String[] args) {
        //1980. Find Unique Binary String

        String nums[] = new String[]{"111", "011", "001"};
        FindUniqueBinaryString main = new FindUniqueBinaryString();
        main.findDifferentBinaryString(nums);
    }


    // 주어진 길이만큼의 n을 확인 후 주어진 만큼의 바이너리를 만든 후 비교해서 없음 바로 반환?
    // 순열로 조합?
    public String findDifferentBinaryString(String[] nums) {
        // 들어온 바이너리를 값, 숫자를  키로 저장함
        // 바이너리를 만들고 키 값으로 들어온 키가 있는지 확인한 후 없으면 그 값 반환?
        // 핵심은 바이너리를 다 만들기
        HashMap<String, Integer> map = new HashMap<>();

        int[] oneZero = new int[]{0, 1};
        size = nums[0].length();
        String answer = "";

        makeBinary("", map, oneZero);

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) == 0) {
                answer = s;
                break;

            }
        }


        return answer;

    }

    private void makeBinary(String binary, HashMap<String, Integer> map, int[] oneZero) {


        if (binary.length() == size) {
            map.put(binary, 0);
            return;

        }

        for (int i : oneZero) {
            makeBinary(binary + i, map, oneZero);
        }
    }
}
