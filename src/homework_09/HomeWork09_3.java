package homework_09;

public class HomeWork09_3 {
    public static void main(String[] args) {
        String[] array = {"One", "Two", "Twenty"};
        String longestString = findLongestString(array);
        for (char a : longestString.toCharArray()) {
            System.out.println(a);
        }
    }

    private static String findLongestString(String[] array) {
        String longestString = "";
        for (String str : array) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        return longestString;

    }
}
