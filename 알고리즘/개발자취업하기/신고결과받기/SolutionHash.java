package 알고리즘.개발자취업하기.신고결과받기;
//id list에는 4명의 사용자가 주어진다.
// 사용자들은 서로 신고가 가능하고, report에 신고한 자와 신고 당한 자의 정보가 주어진다. (중복 허용)
// k번 신고 당하면 아이디가 정지 당한다. 같은 사람이 또 신고하면 신고를 2회 이상해도 하나만 저장이 됨

// report배열을 Hash Set으로 관리해서 중복을 첨부터 없애자
// 신고자 목록을 관리하자 프로도라는 사람을 신고한 사람을 콘, 무지 이렇게 관리하자 (해쉬형태 키는 신고당한, 밸류는 어레이리스트로 사람관리)
// 해쉬형태에 밸류가 K 이상이라면 밸류의 어레이리스트의 사람에게 신고당한 사람이 정지됐다고 알려주는 해쉬 만들자(키 : con ,value :1)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SolutionHash {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length]; // 엔서에는 아이디리스트 사람들을 반환하니까

        // 1. 중복제거 set을 이용하자
        HashSet<String> reportSet = new HashSet<>();
        for (String rep : report)
            reportSet.add(rep);

        // 2. notifyListHash 만들기
        HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
        for (String rep : reportSet) {
            int blankIdx = rep.indexOf(" ");// 블링크 기반으로 인덱스 나누기
            String reporter = rep.substring(0, blankIdx); // 신고한 사람
            String reportee = rep.substring(blankIdx + 1); // 신고당한 사람
            ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee, null);
            //getOrDefalut가 계속 헷갈리는데 Key를 기준으로 찾는 데이터의 키가 있다면 그 키의 밸류 반환 아니라면 default 밸류반환



            if (reporterList == null) // reportList가 처음 만들어질땐 null로 만들어지고, null이라면 새로 만들어주고 아니라면
                reporterList = new ArrayList<>();
            reporterList.add(reporter);

            notifyListHash.put(reportee, reporterList);

        }
        // 3. notifyListHash 를 기반으로 reportHash를 만들자 신고한 사람 : 신고당한 사람의 신고가 K 이상 쌓일 때 1
        // reportee에 있는 사람들이 키고, 만약 k=2rk
        HashMap<String, Integer> reportHash = new HashMap<>();
        for (ArrayList<String> notifyList : notifyListHash.values()) {
            if (notifyList.size() >= k) { // notifyList에 사람이 k명 이상이면 정지시켜야하고 전달해줘야하기에
                for (String reportee : notifyList) // notifyList의 사람을 키 값으로
                    reportHash.put(reportee, reportHash.getOrDefault(reportee, 0) + 1);
            }
        }


        // 4. reportHash 기반으로 answer을 채운다.
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reportHash.getOrDefault(id_list[i], 0);
        }

        return answer;
    }

    public static void main(String[] args) {
        SolutionHash sol = new SolutionHash();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "apeach muzi"};
        int k = 2;
        System.out.println(sol.solution(id_list, report, k));
    }
}
