package lesson_31.wrapper_classes_and_generiecs;


    public class PatternCounter {

        public static int countPatternOccurrences(String input, String pattern) {
            int count = 0;
            int index = input.indexOf(pattern);

            while (index != -1) {
                count++;
                index = input.indexOf(pattern, index + 1);
            }

            return count;
        }

        public static void main(String[] args) {
            String input = "Hello World";
            String pattern = "l";
            int occurrences = countPatternOccurrences(input, pattern);
            System.out.println("Number of occurrences: " + occurrences);
        }
    }

