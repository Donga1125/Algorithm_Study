package 알고리즘.leetcode;

public class ppi_ipp_frint테스트 {

    public static void main(String[] args) {
        int i = 5;

        String str = "abacabcd";
        boolean[] seen = new boolean[256];
//        System.out.print(calculFn(str, str.length()-1, seen));
        String st1r = "ITISTESTSTRING";
        String[] result = st1r.split("T");
//        for (String s : result) {
//            System.out.println(s);
//        }

        int v1 = 0, v2 = 35, v3 = 29;
        if (v1 > v2 ? true : false) {

        } else
            v3 = v3 << 2;
//        System.out.println(v3);
//
//        System.out.println(v3 + v2);

        int i1 = 0, sun = 0;

        while (i1 < 10) {
            i1 = i1 + 1;
            if (i1 % 3 == 0) {
                sun -= i1;
            } else if (i1 % 3 == 1) {
                sun += i1;
            } else
                sun *= i1;
        }

        System.out.println(sun);



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
