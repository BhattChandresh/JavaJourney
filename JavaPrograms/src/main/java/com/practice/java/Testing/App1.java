package com.practice.java.Testing;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class App1 {
    public static void main(String[] args) {
        String parent = "ABCADBA";
        m1(parent);
    }

    static void m1(String parent) {
        Set set = new LinkedHashSet();
        ArrayList<String> list = new ArrayList<String>();
        String result = "";
        int index = 0;
        char[] c = parent.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if ((set.add(c[i]))) {
                result = result + c[i];
            } else {
                char[] r = result.toCharArray();
                for (int j = 0; j < r.length; j++) {
                    if (r[j] == c[i])
                        i = j;
                    set.clear();
                    list.add(result);
                    result = "";
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
