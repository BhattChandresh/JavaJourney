package com.practice.java.Testing;

public class Demo {
    public static void main(String[] args) {
        //String s = "ssssssssaaaauuuuuuuuugxxjjaaa";
        String s = "ttttyyyyruzgnnnbb";
        countChars(s);
    }

    static void countChars(String s) {
        String result = "";
        String subStr = "";
        int head = 0;
        int tail = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                tail = i;
                subStr = s.substring(head, tail + 1);
                head = tail + 1;
                result = result + subStr.length() + subStr.charAt(0);
                subStr = "";
            }
        }
        String last = s.substring(head, s.length());
        result = result + last.length() + last.charAt(0);
        System.out.println(result);
    }
}

//    char[] c = s.toCharArray();
//    int value = 0;
//    String result = "";
//    Map<Character,Integer> map = new HashMap<Character,Integer>();
//         for(int i=0; i < c.length;i++) {
//        if(i == 0) {
//        map.put(c[i], 1);
//        } else {
//        if(map.containsKey(c[i])) {
//        value = map.get(c[i]);
//        map.put(c[i], value);
//        } else {
//
//        }
//        }
//        }
