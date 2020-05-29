package com.nk.algo;

public class Permutation {
    public static void main(String[] args) {

        String str = "ABC";
        permute(str, 0, str.length() - 1);
    }


    public static void permute(String str, int left, int right) {

        if (left == right) {
            System.out.println(str);
        } else {

            for (int i = left; i <= right; i++) {

                String swapped = swap(str, left, i);
                permute(swapped, left + 1, right);
            }

        }


    }


    public static String swap(String str, int i, int j) {

        char[] chars = str.toCharArray();

        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);

    }
}