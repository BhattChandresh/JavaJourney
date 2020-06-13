package com.practice.java.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEvenNoWIthStream {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(15);
        al.add(25);

        List<Integer> l1 = al.stream().filter(x -> x %2 == 0).collect(Collectors.toList());
        List<Integer> l2 = al.stream().map(x -> x *2).collect(Collectors.toList());
        System.out.println(l1);
        System.out.println(l2);

        long count1 = al.stream().count();
        System.out.println("Total elements =  " + count1);
        long count2 = al.stream().filter(x -> x%2 != 0).count();
        System.out.println("Total odd elements =" + count2);

        List<Integer> l3 = al.stream().sorted().collect(Collectors.toList());
        System.out.println(l3);
        List<Integer> l4 = al.stream().sorted((x1,x2) -> - (x1.compareTo(x2))).collect(Collectors.toList());
        System.out.println(l4);

        Integer min = al.stream().min((x1,x2) -> x1.compareTo(x2)).get();
        System.out.println("Min Value = " + min);

        Integer max = al.stream().max((x1,x2) -> x1.compareTo(x2)).get();
        System.out.println("Max Value = " + max);

        al.stream().forEach(x -> System.out.println(x * 10));

        //For Group of values
        Stream<Integer> s = Stream.of(10,2,4,5,89,34);
        List<Integer> mylist = s.sorted().collect(Collectors.toList());
        System.out.println(mylist);

        //For Arrays
        Double[] d = {10.0,10.1,10.2,10.3,10.4};
        Stream<Double> sd = Stream.of(d);
        Double sum = sd.mapToDouble(x -> x).sum();
        System.out.println("Sum is = " + sum);

    }
}
