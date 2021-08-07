package com.practice.java.logicmonitor;

public class Test1 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.solution(6);
    }

    int solution(int number) {
        int sum = 0;
        for(int index=1; index < number;index++) {
            if(index % 3 == 0 || index %5== 0) {
                sum = sum + index;
            }
        }
        System.out.println(sum );
        return 0;
    }
}
