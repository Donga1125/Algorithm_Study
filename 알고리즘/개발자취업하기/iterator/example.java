package 알고리즘.개발자취업하기.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class example {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("키1", "값1");
        map.put("키2", "값2");
        map.put("키3", "값3");
        map.put("키4", "값4");
        map.put("키5", "값5");
        map.put("키6", "값6");

        // 방법 1
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));
        }

        // 방법 2
        for (Map.Entry<String, String> element : map.entrySet()) {
            System.out.println(String.format("키 : %s, 값 : %s", element.getKey(), element.getValue()));

        }
        for (String key : map.keySet()) {
            System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));
        }
    }
}
