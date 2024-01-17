package 알고리즘.순위검색;
// info 4가지 정보와 점수가 주어지고 이걸 가지고 hashmap을 만들어야 한다.
// 최정적으로 쿼리를 처리하고 싶다. 이러이러한 조건의 사람이 몇명 있는지 찾아야하는데
// 이걸 처리하기 위해선 하나하나 써칭하는 게 아니라 이 정보를 기반으로 해시맵을 만들고 처리해줘야한다.
// o번 지원자는 자바 백앤드 주니어 피자 하나를 키고 ,밸류는 150
// if -가 4가지 정보에 담겨있다면 그것도 0번째와 같은 키로 저장되어야 한다.
// 다 해시 맵에 저장하면 value 값을 오름차순으로 정렬 쿼리가 들어왔을때 키를 가지고 밸류를 확인할텐데(정렬안하면 다 찾아봐야하지만)
// 정렬하면 이분탐색을 쉽게 쓸 수 있게 된다. 밸류의 인댁스로 100점 이상인 사람을 찾기 위해 사이즈에서 인덱스를 빼주면 그 수가 됨

//정리 : 쿼리를 할 때 마다 느려지면 해쉬 맵을 최대한 완벽하게 만들고 그 해쉬맵을 기반으로 쿼리를 빠르게 처리할 수 있게 하는 게 핵심

import java.util.ArrayList;
import java.util.HashMap;

public class SolutionHashWithBS { //Hash + Binary Search
    public int[] solution(String[] info, String[] query) {
        // 1. info를 기반으로 해쉬맵을 만든다.
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        for (String i: info) { // 인포를 돌면서 i에 data에 담는데
            String[] data = i.split(" "); // i를 스플릿할꺼다 " " 공백을 기반으로
            String[] languages = {data[0], "-"};
            String[] positions = {data[1], "-"};
            String[] exps = {data[2], "-"};
            String[] foods = {data[3], "-"};
            Integer value = Integer.parseInt(data[4]);
            for (String lang : languages)
                for (String position : positions)
                    for (String exp : exps)
                        for (String food : foods) {
                            String[] keyData = {lang, position, exp, food};
                            String key = String.join(" ", keyData);
                            ArrayList<Integer> arr = map.getOrDefault(key, new ArrayList<Integer>());

                            arr.add(value);
                            map.put(key, arr);
            }
        }

        // 2. 각 해쉬맵의 밸류를 오름차순으로 정렬한다.
        for (ArrayList<Integer> arr : map.values())
            arr.sort(null);
        // 3. query에 맞는 지원자를 가져온다.
        int[] answer = new int[query.length];
        int i = 0;
        for (String q : query) {
            String[] data = q.split(" and ");
            int target = Integer.parseInt(data[3].split(" ")[1]); // 뒤에 점수를 가지고 오고 싶기에 짜르고 1번이 점수임
            data[3] = data[3].split(" ")[0];
            String key = String.join(" ", data);

            if (map.containsKey(key)) {
                ArrayList<Integer> list = map.get(key);
                // 4. binary search를 통해 lower-bound를 찾는다.
                int left = 0;
                int right = list.size();
                while (left < right) {
                    int mid = (left + right) / 2;
                    if (list.get(mid) >= target)
                        right = mid;
                    else
                            left = mid + 1;
                    }
                answer[i] = list.size() - left;
                }
            i++;
            }
        // 4. binary search를 통해 lower-bound를 찾는다.
        return answer;
    }

    public static void main(String[] args) {
        SolutionHashWithBS sol = new SolutionHashWithBS();
        String[] info = {"java backend junior pizza 150",
                "python frontend senior chicken 210",
                "python frontend senior chicken 150",
                "cpp backend senior pizza 260",
                "java backend junior chicken 80",
                "python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100",
                "python and frontend and senior and chicken 200",
                "cpp and - and senior and pizza 250",
                "- and backend and senior and - 150",
                "- and - and - and chicken 100", "- and - and - and - 150"};
        System.out.println(sol.solution(info, query));
    }
}
