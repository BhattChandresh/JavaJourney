/**
 * Given a string array words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. If no such two words exist, return 0.
 * <p>
 * Example 1:
 * Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
 * Output: 16
 * Explanation: The two words can be "abcw", "xtfn".
 * <p>
 * Example 2:
 * Input: words = ["a","ab","abc","d","cd","bcd","abcd"]
 * Output: 4
 * Explanation: The two words can be "ab", "cd".
 * <p>
 * Example 3:
 * Input: words = ["a","aa","aaa","aaaa"]
 * Output: 0
 * Explanation: No such pair of words.
 * <p>
 * Constraints:
 * 2 <= words.length <= 1000
 * 1 <= words[i].length <= 1000
 * words[i] consists only of lowercase English letters.
 */


package main.java.com.practice.java.string;

public class MaximumProductOfWordLength {
    public static void main(String[] args) {
        //String[] strArr = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        //String[] strArr = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        //String[] strArr = {"a","aa","aaa","aaaa"};
        String[] strArr = {"deadd", "ccabfecbcba", "cdbeeffafd", "fcafbfc", "befcf", "bc", "ff", "fa", "fbadfebccac", "be", "fbddbafacf", "abdcf", "dcae",
                "efbacdcbbbc", "bcbfbf", "cad", "cedcfaaf", "bacfd", "ae", "bbfdbefb", "cabf", "bcc", "edbfbae", "eabfe", "decf", "ecceecdafdf", "dabfbbddbe",
                "fbbdbfb", "bafebcddadc", "accdaaddefe", "daffbcbff", "dfecdbcefdf", "faabfef", "ffefaccbaee", "ed", "dbcfba", "abb", "be", "aacade", "dfeedddbbc",
                "fefc", "abdcf", "dfeceefd", "bedfcf", "eceeaf", "cbdceccebd", "dafeb", "dfdabdebac", "fe", "fddbedb", "ffeaadb", "fddb", "fcaddeeb", "eaabfee",
                "dedecbdbbb", "ffcbeffdd", "bacfeb", "dcfbfda", "aaaabdcae", "dbfffafceec", "dde", "dbcfffe", "fdfe", "eada", "beaecbbbc", "bcfecaaec", "ddabeaaeed",
                "eb", "fbcafcbcb", "db", "cbdfeecfaa", "cdffb", "dbeadebbace", "ccfedaee", "ecc", "fefcebd", "eccccfd", "fddccbfb", "dfd", "eaac", "afa", "ecdbfaff", "dd", "bcebfbedbff",
                "cdcdaaabe", "bdbdbfc", "adefbfeff", "baef", "edbbbca", "dec", "adbecacdaec", "cedcbecd", "fffbdbeaedc", "bdacfbbaabe", "dbcecacefb", "abdda", "af", "dbdeaaa",
                "ebdfebc", "bafcdac", "dfcbbbcdac", "cfefeaa", "bdaedeafa", "cecbbfcdef", "ccedfcaeda", "baacdceec", "cb"};

        //String[] strArr = {"aacade","dfeedddbbc","fefc","abdcf","dfeceefd","bedfcf"};


        int maxLength = 0;


        MaximumProductOfWordLength productOfWordLength = new MaximumProductOfWordLength();

        maxLength = productOfWordLength.maxProduct(strArr);
        System.out.println("Max. Product of Word Length : " + maxLength);

        System.out.println('c' - 'a');
        System.out.println('c');
    }

    // Every test case is getting pass but last test cases gives time limit exceed error in leetcode console.
    //Out of 168, 167 test cases is passed but last test case gives time limit exceed.
    public int maxProduct(String[] words) {
        int maxProductLength = 0;
        int nextWord = 0;
        int position = 0;
        int wordLength = words.length;

        for (int k = 0; k < wordLength; k++) {
            char[] c = words[k].toCharArray();
            if (nextWord >= wordLength - 1 && k >= nextWord) {
                break;
            }
            nextWord = k + 1;
            for (int m = 0; m < c.length; m++) {
                String temp = String.valueOf(words[k].charAt(m));
                if (!words[nextWord].contains(temp)) {
                    position++;
                    if (position == words[k].length()) {
                        maxProductLength = Math.max(maxProductLength, words[nextWord].length() * words[k].length());
                        m = -1;
                        position = 0;
                        if (nextWord >= wordLength - 1) {
                            break;
                        }
                        nextWord++;
                    }
                } else {
                    m = -1;
                    position = 0;
                    if (nextWord >= wordLength - 1) {
                        break;
                    }
                    nextWord++;
                }
            }
        }
        return maxProductLength;
    }
}
