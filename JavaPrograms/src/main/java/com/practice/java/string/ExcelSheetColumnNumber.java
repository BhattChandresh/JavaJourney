/**
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * Example 1:
 * Input: columnTitle = "A"
 * Output: 1
 * Example 2:
 * Input: columnTitle = "AB"
 * Output: 28
 * Example 3:
 * Input: columnTitle = "ZY"
 * Output: 701
 * Constraints:
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle is in the range ["A", "FXSHRXW"].
 */

package main.java.com.practice.java.string;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {

        //String columnTitle = "A";
        //String columnTitle = "AB";
        //String columnTitle = "ZY";
        String columnTitle = "CDA";


        ExcelSheetColumnNumber columnNumber = new ExcelSheetColumnNumber();
        int columnTitleNumber = columnNumber.titleToNumber_Solution_1(columnTitle);
        System.out.println("ColumnTitle is : " + columnTitleNumber);

        int columnTitle_Number = columnNumber.titleToNumber_Solution_2(columnTitle);
        System.out.println("ColumnTitle is : " + columnTitle_Number);


    }

    public int titleToNumber_Solution_1(String columnTitle) {

        int titleNumber = 0;
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);
        map.put("G", 7);
        map.put("H", 8);
        map.put("I", 9);
        map.put("J", 10);
        map.put("K", 11);
        map.put("L", 12);
        map.put("M", 13);
        map.put("N", 14);
        map.put("O", 15);
        map.put("P", 16);
        map.put("Q", 17);
        map.put("R", 18);
        map.put("S", 19);
        map.put("T", 20);
        map.put("U", 21);
        map.put("V", 22);
        map.put("W", 23);
        map.put("X", 24);
        map.put("Y", 25);
        map.put("Z", 26);

        int index = columnTitle.length() - 1;
        int number = 1;
        for (int k = 0; k < columnTitle.length() - 1; k++) {
            String s = String.valueOf(columnTitle.charAt(k));
            number = (int) Math.pow(26, index);
            titleNumber = titleNumber + (number * map.get(s));
            index--;
        }
        String s = String.valueOf(columnTitle.charAt(columnTitle.length() - 1));
        titleNumber = titleNumber + map.get(s);
        return titleNumber;
    }

    public int titleToNumber_Solution_2(String columnTitle) {
        int titleNumber = 0;
        int index = columnTitle.length() - 1;
        int number = 1;
        for (int k = 0; k < columnTitle.length() - 1; k++) {
            number = (int) Math.pow(26, index);
            titleNumber = titleNumber + (number * (columnTitle.charAt(k) - 'A' + 1));
            index--;
        }
        titleNumber = titleNumber + columnTitle.charAt(columnTitle.length() - 1) - 'A' + 1;
        return titleNumber;
    }
}
