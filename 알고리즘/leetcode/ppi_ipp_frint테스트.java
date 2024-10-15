package 알고리즘.leetcode;

public class ppi_ipp_frint테스트 {

    public static void main(String[] args) {
        int i = 5;

        String str = "abacabcd";
        boolean[] seen = new boolean[256];
//        System.out.print(calculFn(str, str.length()-1, seen));
        String st1r = "ITISTESTSTRING";
        String[] result = st1r.split("T");
        for (String s : result) {
            System.out.println(s);
        }



//        System.out.printf("%d,%d,%d,%d", i++, ++i, i++, ++i);
    }

    public static String calculFn(String str, int index, boolean[] seen) {

        if(index < 0) return "";

        char c = str.charAt(index);
        String result = calculFn(str, index-1, seen);
        if(!seen[c]) {
            seen[c] = true;
            return c + result;
        }
        return result;
    }
}
