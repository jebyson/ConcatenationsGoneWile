package com.company;

public class Main {

    public static void main(String[] args) {
        String t1 = cat(68, 108);
        System.out.println(t1);

        String t2 = cat(35, 59);
        System.out.println(t2);
    }

    private static String cat(int start, int end) {
        StringBuffer sb = new StringBuffer("");

        for (int j = start; j <= end; j++) {
            sb.append((char)(j));
        }
        sb.append('\n');

        String s = sb.toString();
        return s;
    }
}