package 알고리즘.leetcode.august;

import java.util.*;

public class MinimumNumberofPushestoTypeWordII {

    //3016. Minimum Number of Pushes to Type Word II

    //키보드의 구성이 헷갈린다 사진을 보니.. 댓글 보니까
    // 예제 무시하고 그냥 ?

    // 기본적인 일반 키패드로 생각하자는 건 아닐테고
    // 보니까 주어진 word에 확정된 키패드가 아닌
    // word가 주어지면 내가 배열을 해서 최소로 누르게 하는 것
    // 나오는 빈도가 많은 단어일수록 한번만 누르게 설계하면 될듯?
    //우선순위를 둬서 처리하면 좋을 거 같드

    public static void main(String[] args) {

        String word = "aabbccddeeffgghhiiiiii";
        String word1 = "avghdcyinjmbopwtrfslzkuxeq";

        MinimumNumberofPushestoTypeWordII sol = new MinimumNumberofPushestoTypeWordII();
        sol.minimumPushes(word1);




    }

    public int minimumPushes(String word) {

        // 1숫자 세고, 숫자에 따라 8개씩 끊어서 우선순위 부여 작을수록
        // 그럼 map에 저장할 때 key에 저장 다하고 8개 초과면 value 확인 후 우선순위 다르게

        // 최고 효율의 기준은 8 8 8 2로 구성하는 것

        HashMap<Character, Integer> map = new HashMap<>();
        int length = word.length();
        Integer[] alphabet = new Integer[26];
        Arrays.fill(alphabet, 0);


        for (int i = 0; i < length; i++) {

            char ch = word.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
            alphabet[ch - 97]++;

        }
        Arrays.sort(alphabet, (a, b) -> b - a);

        int index = 0;
        int answer = 0;


        int alphLength = alphabet.length;

        for (int i = 0; i < alphLength; i++) {


            if (alphabet[i] == 0) {
                break;
            }

            if (index <= 7) {

                answer = answer + alphabet[index] * 1;

            } else if (index <= 15) {

                answer = answer + alphabet[index] * 2;

            } else if (index <= 23) {

                answer = answer + alphabet[index] * 3;
            } else {
                answer = answer + alphabet[index] * 4;
            }

            index++;

        }

        int ind=1,sum=0,count=1;
        // 다른 사람 방식
        // 설명하자면 오름차순 정렬 후 역순
        //ind가 8이하면 1번씩(count)로, sum에 누적
        // 8이상이면 다시 inx를 초기화해주고 곱해주는 count 값을 증가

        // idx는 계쏙 8번 반복8넘는 순간만 초기화후 count ++ 후 다시 if문 반복

        for (int i = 25; i >= 0; i--) {

            if (ind <= 8) {
                ind++;
            } else {
                ind = 2;
                count++;
            }
//            sum = sum + (a[i] * count);
        }

//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//
//
//
//        }

        return answer;

    }
}