package 기초1.Day02.정해영;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class 에디터 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Character> list = new LinkedList<>(); //ArrayList -> LinkedList

        String str = br.readLine(); //입력 1번줄을 받아온다.

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i)); //리스트에 str을 한글자씩 넣는다.
        }

        int M = Integer.parseInt(br.readLine()); //입력할 명령어의 개수

        //iterator메서드 호출.
        ListIterator<Character> iterator = list.listIterator();

        //처음에 커서가 문장의 맨뒤에 있어야 하므로 커서를 맨뒤로 이동시킨다.
        while (iterator.hasNext()){
            iterator.next();
        }

        for (int i = 0; i < M; i++) { //명령어 개수만큼 반복

            String command = br.readLine();
            char c = command.charAt(0);
            switch (c) {
                case 'P':
                    char ch = command.charAt(2);
                    iterator.add(ch);

                    break;

                case 'L':
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    break;

                case 'D':
                    if (iterator.hasNext()) {
                        iterator.next();
                    }
                    break;

                case 'B':

                    if(iterator.hasPrevious()){
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
            }
        }

        for(Character chr : list) {
            bw.write(chr);
        }
        bw.flush();
        bw.close();
    }
}