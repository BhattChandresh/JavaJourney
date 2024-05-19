package main.java.com.practice.java.string;

public class ReplaceDigit {
    public static void main(String[] args) {
        String input = "abc3de2";
        //String input = "abc99de0"; //abc111111111111111111de
        ReplaceDigit replaceDigit = new ReplaceDigit();
        String result = replaceDigit.convertString(input);
        System.out.println("Resulted String is : " + result.toString());
    }

    public String convertString(String input) {
        StringBuilder output = new StringBuilder();

        for(int t=0; t < input.length(); t++) {
            if (input.charAt(t) >= 48 && input.charAt(t) <= 57) {
                int number = Character.digit(input.charAt(t), 10);
                if (number == 0) {
                    continue;
                }
                for(int r=0; r < number; r++) {
                    output.append("1");
                }
            } else {
                output.append(input.charAt(t));
            }
        }
        return output.toString();
    }
}
