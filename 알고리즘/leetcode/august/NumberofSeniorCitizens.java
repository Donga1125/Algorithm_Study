package 알고리즘.leetcode.august;

public class NumberofSeniorCitizens {

    // 2678. Number of Senior Citizens

    public static void main(String[] args) {

        String[] details = new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        NumberofSeniorCitizens main = new NumberofSeniorCitizens();
        System.out.println(main.countSeniors(details));

    }

    public int countSeniors(String[] details) {
        int count = 0;
        int length = details.length;

        for (int i = 0; i < length; i++) {

           int age = Integer.parseInt(details[i].substring(11, 13));
            if (age > 60) {
                count++;
            }
        }

        return count;

    }
}
