package com.company;

/**
 * Created by je565 on 11/29/17.
 */

public class Tester {
    private static int sPos;
    private static int lPos;

    public static void main(String args[]) {
        String t1 = cat(68, 108);
        System.out.println(t1);

        String t2 = cat(35, 59);
        System.out.println(t2);
    }

    private static String cat(int start, int end)
    {
        sPos = start;
        lPos = end;

        StringBuffer sb = new StringBuffer("");

        for(int j = sPos; j <= lPos; j++)
        {
            sb.append(j);
        }
        sb.append('\n');

        String s = sb.toString();
        return s;
    }
}
