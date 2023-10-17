package 기초1.Day06.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 접미사배열 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new LinkedList<>();

        String string = br.readLine();

        for(int i=0; i<string.length(); i++){
            list.add(string.substring(i));
        }

        Collections.sort(list);

        list.forEach(System.out::println);
        br.close();
    }
}
