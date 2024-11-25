package 알고리즘.leetcode.November;

public class TakeKofEachCharacterFromLeftandRight {

    //2516. Take K of Each Character From Left and Right

    //문자열 s가 주어지고 abc로만 이루어져있다.
    //k가 주어지고 abc를 k개 만큼 가져와야함
    // 각 분마다 왼쪽 끝이나 오른쪽 끝에서 하나씩 가져올 수 있음
    // k개 이상의 abc를 가져오기 위해서 최소시간 계산해서 반환git commit -m “2516. Take K of Each Character From Left and Right"git commit -m “2516. Take K of Each Character From Left and Right"git commit -m “2516. Take K of Each Character From Left and Right"
    public static void main(String[] args) {

        String s = "aabaaaacaabc";
        int k = 2;
        TakeKofEachCharacterFromLeftandRight sol = new TakeKofEachCharacterFromLeftandRight();
        System.out.println(sol.takeCharacters(s, k)); // 출력: 8


    }

    public int takeCharacters(String s, int k) {

        int n = s.length();
        int[] totalCount = new int[3];
        for (char c : s.toCharArray()) {
            totalCount[c - 'a']++;
        }

        // Step 2: 'k' 개씩 가져올 수 없는 경우 -1 반환
        if (totalCount[0] < k || totalCount[1] < k || totalCount[2] < k) {
            return -1;
        }

        // Step 3: 최소 구간 길이 계산
        int[] currentCount = new int[3];
        int left = 0, maxMiddle = 0;

        for (int right = 0; right < n; right++) {
            currentCount[s.charAt(right) - 'a']++;

            // 오른쪽 포인터가 조건을 초과하면 왼쪽 포인터 이동
            while (currentCount[0] + k > totalCount[0] ||
                    currentCount[1] + k > totalCount[1] ||
                    currentCount[2] + k > totalCount[2]) {
                currentCount[s.charAt(left) - 'a']--;
                left++;
            }

            // 최대 중간 구간 길이 갱신
            maxMiddle = Math.max(maxMiddle, right - left + 1);
        }

        // 전체 문자열 길이에서 최대 중간 구간 길이를 빼서 최소 시간 계산
        return n - maxMiddle;
    }

}
