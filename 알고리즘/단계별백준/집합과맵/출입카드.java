package 알고리즘.단계별백준.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 출입카드 {

    // 출입기록을 보고 남은 회사 사람을 맞추는데, 대 소문자가 다를 경우 다른 사람임
    // 사전 순으로 출력해야 하는데, 먼저 정렬해서 뽑아야하나 아님 뽑고 나서 정렬 ?
    // 정렬해서 넣을 떄 같은 이름이 있다면 그냥 없애주고, 다 뽑아낼까 ?
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String now = st.nextToken();
            if(map.containsKey(name)){
                map.remove(name);
            } else
            map.put(name, now);

        }
        br.close();

        ArrayList<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, Collections.reverseOrder()); // 두번째 인자로 뒤집은(내림차순)Comparator를 전달

        StringBuilder sb = new StringBuilder();

        for (String key : list) {
            sb.append(key).append('\n');

        }


//        for (Map.Entry<String, String> entry : map.entrySet()) { // 굳이 밸류로 비교할 필요 없어서 패스
//
//            String key = entry.getKey();
//            String value = entry.getValue();
//
//            if (value == " enter") {
//                sb.append(key).append('\n');
//            }
//        }

        System.out.println(sb);
            
    }}

