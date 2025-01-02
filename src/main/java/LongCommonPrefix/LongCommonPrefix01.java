package LongCommonPrefix;

public class LongCommonPrefix01 {


    public static String longestCommonPrefix(String[] str) {


        if (str == null || str.length == 0) {
            return "";
        }
        String prefix = str[0];

        for (int i = 0; i < str.length; i++) {
            while (!str[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "Nothing Matched";
                }
            }
        }
        return prefix;

    }


    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));

        String[] str1 = {"Java", "Python", "C++"};
        System.out.println(longestCommonPrefix(str1));
    }

}
