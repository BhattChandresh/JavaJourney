/**
 * You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:
 * Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
 * Align the substitution table with the regular English alphabet.
 * Each letter in message is then substituted using the table.
 * Spaces ' ' are transformed to themselves.
 * For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
 * Return the decoded message.
 */


package main.java.com.practice.java.string;

import java.util.HashMap;
import java.util.Map;

public class DecodeMessage {
    public static void main(String[] args) {

        //String key = "the quick brown fox jumps over the lazy dog";
        //String message = "vkbs bs t suepuv";

        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";


        DecodeMessage decodeMessage = new DecodeMessage();
        String decocedMsg = decodeMessage.decodeMessage(key, message);
        System.out.println("Decoded Message is : " + decocedMsg);
    }

    public String decodeMessage(String key, String message) {
        Map<String, String> map = new HashMap<>();
        int count = 0;
        StringBuilder s = new StringBuilder();

        key = key.replaceAll(" ", "");

        for (int k = 0; k < key.length(); k++) {
            String myKey = String.valueOf(key.charAt(k));
            if (!map.containsKey(myKey)) {
                map.put(myKey, Character.toString(97 + count));
                count++;
            }
        }

        for (int k = 0; k < message.length(); k++) {
            String str = String.valueOf(message.charAt(k));
            if (str.equals(" ")) {
                s.append(" ");
                continue;
            }
            s = s.append(map.get(str));
        }
        return s.toString();
    }
}
