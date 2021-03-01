package com.practice.java.Testing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws IOException {
        String parent = "ABCADBA";
        String s = "ABCABDABABBE";

        m1(parent);
    }

    static void m1(String parent) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int head = 0;
        int tail = 0;
        Set set = new HashSet<>();
        for (int i = 0; i < parent.length(); i++) {
            if (set.add(parent.charAt(i))) {
                list.add(i);
//                   System.out.println(i);
            }
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (!(i == list.get(i))) {
                head = i - 1;
                break;
            }
        }
        System.out.println(head);
        System.out.println(list.get(list.size() - 1));
        tail = list.get(list.size() - 1);
        System.out.println(parent.substring(head, tail + 1));
    }
}


//https://wqu.org/?gclid=EAIaIQobChMI8oHVlZWi6gIViphoCh2rQwqNEAEYASAAEgKuV_D_BwE&gclsrc=aw.ds


//            File file = new File("/home/dell/Desktop/1.txt");
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter br = new BufferedWriter(fw);
//            br.write("id " + "     " + "firstname" + "     " + "lastname" + "     ");
//            br.newLine();
//            for(int i=0; i < 10;i++) {
//                br.write(i  + "     " + "ABC-"+ i + "     " + "XYZ" + i+1 + "     ");
//                br.newLine();
//            }
//            br.flush();
