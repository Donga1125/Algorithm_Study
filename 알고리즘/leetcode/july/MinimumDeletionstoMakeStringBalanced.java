package 알고리즘.leetcode.july;

public class MinimumDeletionstoMakeStringBalanced {

    // 1653. Minimum Deletions to Make String Balanced

    // aababbab가 있을 때 최소한으로 지워서 페어를 만들어라

    //페어란 a부터 나와 b를 구성 ba는 안되고 aabbb abbb이런 식으로 만들기

    //aababbab

    // a를 기준으로 뒤에 남은 것들을 b로 만들기


    public static void main(String[] args) {

        String s = "aababbab";
        MinimumDeletionstoMakeStringBalanced main = new MinimumDeletionstoMakeStringBalanced();
        main.minimumDeletions(s);



    }

    public int minimumDeletions(String s) {

        char[] ch = s.toCharArray();
        // 1. a 갯수를 세주고,
        // 2. a를 만나면 지워하는지 판별 여부는 b의 갯수와 지웠을 때 숫자 중 더 작은 걸 정해서 지울 걸 정함 후에 a--;
        // 3. b를 만나면 b 카운트 추가
        int aCount = 0;
        int bCount = 0;
        int deletions = 0;

        for (char c : ch) { // a의 총 갯수 세기

            if (c == 'a') {
                aCount++;

            }
        }

        for (char c : ch) {

            if (c == 'a') {

                deletions = Math.min(deletions + 1, bCount);
            } else
                bCount++;
        }

        return deletions;

    }
}
