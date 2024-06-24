package 알고리즘.항해99.사주차;

import java.util.Arrays;

public class findTheOriginalArrayofPrefixXor {


    //2433. Find The Original Array of Prefix Xor
    // 비트연산 묻는 것
    //pref[0] = arr[0]
    //pref[1] = arr[0] ^ arr[1]
    // arr[1] = arr[0] ^ pref[1]
    //pref[2]=  arr[0]^arr[1]^arr[2]
    //arr[2] =  arr[0]^arr[1]^pref[2]
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 0, 3, 1};

        findTheOriginalArrayofPrefixXor main = new findTheOriginalArrayofPrefixXor();
        System.out.println(Arrays.toString(main.findArray(arr)));
    }

    public int[] findArray(int[] pref) {


        int arr[] = new int[pref.length];
        arr[0] = pref[0];


        int now = arr[0];


        for (int i = 1; i < pref.length; i++) {


            arr[i] = now ^ pref[i];
            now = now ^ arr[i];



        }
        return arr;

    }
}
